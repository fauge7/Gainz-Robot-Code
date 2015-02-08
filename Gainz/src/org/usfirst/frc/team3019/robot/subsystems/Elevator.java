package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.MoveElevator;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Elevator extends Subsystem{

	Talon Top;
	Talon Bottom;
	private static final int Xbox_Trigger_Right = 3;
	private static final int Xbox_Trigger_Left = 4;
	public Elevator() {
		// TODO Auto-generated constructor stub
		super();
		Top = new Talon(RobotMap.ElevatorTop);
		Bottom = new Talon(RobotMap.ElevatorBottom);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveElevator());
	}
	public void move(){
		double Right = Robot.oi.Xbox.getRawAxis(Xbox_Trigger_Right);
		double Left = Robot.oi.Xbox.getRawAxis(Xbox_Trigger_Left);
		
		if(Right > .1){
			Top.set(Right);
			Bottom.set(-Right);
		}
		else if(Left > .1){
			Top.set(-Left);
			Bottom.set(Left);
		}
	}

}
