package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.MoveElevator;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem{

	Talon Bottom;
	Encoder encoder;
	public DigitalInput limit;
	
	private static final int Xbox_Trigger_Right = 3;
	private static final int Xbox_Trigger_Left = 2;
	public Elevator() {
		// TODO Auto-generated constructor stub
		super();
		Bottom = new Talon(RobotMap.ElevatorBottom);
		encoder = new Encoder(RobotMap.Encoder_Elevator_A, RobotMap.Encoder_Elevator_B, false, CounterBase.EncodingType.k4X);
		limit = new DigitalInput(RobotMap.Limit_Switch_Elevator);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveElevator());
	}
	public void move(){
		double Right = Robot.oi.Xbox.getRawAxis(Xbox_Trigger_Right);
		double Left = Robot.oi.Xbox.getRawAxis(Xbox_Trigger_Left);
		
		if(!limit.get()){
			if(Right > .2){
				Bottom.set(-Right);
			}
			else if(Left > .2){
				Bottom.set(Left);
			}
			else{
				Bottom.set(0);
			}
		}
		else{
			if(Left > .2){
				Bottom.set(Left);
			}
			else{
				Bottom.set(0);
			}
		}
	}
	public void reset(){
		encoder.reset();
	}

}
