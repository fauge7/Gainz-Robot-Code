package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.MoveElevatorArms;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ElevatorArms extends Subsystem{

	Talon arm;
	Encoder encoder;
	public ElevatorArms() {
		// TODO Auto-generated constructor stub
		super();
		encoder = new Encoder(RobotMap.Elevator_A,RobotMap.Elevator_B);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new MoveElevatorArms());
	}
	public void setSpeed(double speed){
		arm.set(speed);
	}

}
