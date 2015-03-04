package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.MoveElevator;

import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem{

	Talon Bottom;
	//public Encoder encoder;
	public DigitalInput limit;
	
	public Elevator() {
		// TODO Auto-generated constructor stub
		super();
		Bottom = new Talon(RobotMap.ElevatorBottom);
//		encoder = new Encoder(RobotMap.Encoder_Elevator_A, RobotMap.Encoder_Elevator_B, false, CounterBase.EncodingType.k4X);
//		encoder.setReverseDirection(true);
//		encoder.setDistancePerPulse(35.75/8590.0);
		limit = new DigitalInput(RobotMap.Limit_Switch_Elevator);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveElevator());
	}
	public void move(){
		
		if(limit.get()){
			if(Robot.oi.ElevatorSlowUp.get()){
				Bottom.set(-.45);
			}
			else if(Robot.oi.ElevatorFastUp.get()){
				Bottom.set(-.85);
			}
			else{
				Bottom.set(0);
			}
		}
		else{
		
			if(Robot.oi.ElevatorSlowDown.get()){
				Bottom.set(.45);
			}
			else if(Robot.oi.ElevatorFastDown.get()){
				Bottom.set(.85);
			}
			else if(Robot.oi.ElevatorSlowUp.get()){
				Bottom.set(-.45);
			}
			else if(Robot.oi.ElevatorFastUp.get()){
				Bottom.set(-.85);
			}
			else{
				Bottom.set(0);
			}	
		}
		
		if(limit.get()){
			//encoder.reset();
		}
	}
	public void move(double speed) {
		// TODO Auto-generated method stub
		Bottom.set(speed);
		if(limit.get()){
			//encoder.reset();
		}
	}
//	public void reset(){
//		encoder.reset();
//	}

	

}
