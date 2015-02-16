package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.MoveElevatorArms;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ElevatorArms extends Subsystem{

	Talon arm;
	public ElevatorArms() {
		// TODO Auto-generated constructor stub
		super();
		arm = new Talon(RobotMap.Elevator_Arm);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveElevatorArms());
	}
	public void setSpeed(double speed){
		System.out.println(speed);
		arm.set(speed);
	}

}
