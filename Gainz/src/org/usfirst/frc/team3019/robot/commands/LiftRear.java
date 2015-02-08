package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class LiftRear extends Command {

	boolean  up;
	
	public LiftRear(boolean up) {
		// TODO Auto-generated constructor stub
		this.up = up;
		requires(Robot.rearLift);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub

	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(up)
			Robot.rearLift.Extend();
		else
			Robot.rearLift.Retract();
			
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.rearLift.DoNothing();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
