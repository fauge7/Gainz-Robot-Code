package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class MoveElevatorArms extends Command {

	public MoveElevatorArms() {
		// TODO Auto-generated constructor stub
		requires(Robot.elevatorArms);
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.elevatorArms.setSpeed(RobotMap.SomeSpeedForLaterSADGSDGDG);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.elevatorArms.setSpeed(0);
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
