package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class myAHRS extends Command {

	public myAHRS() {
		// TODO Auto-generated constructor stub
		requires(Robot.sensor);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		Robot.sensor.printData();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
