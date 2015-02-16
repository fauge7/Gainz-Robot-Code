package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ActuateRear extends Command {

	boolean close;
	public ActuateRear(boolean close, double TimeOut) {
		// TODO Auto-generated constructor stub
		this.close = close;
		requires(Robot.rearLiftArms);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(close)
			Robot.rearLiftArms.Extend();
		else
			Robot.rearLiftArms.Retract();
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.rearLiftArms.DoNothing();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}
}