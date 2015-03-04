package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Deploy extends Command {

	boolean deploy;
	public Deploy(boolean deploy, double TimeOut) {
		// TODO Auto-generated constructor stub
		this.deploy = deploy;
		setTimeout(TimeOut);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(deploy){
			Robot.clawRetractionator.Extend();
		}
		else{
			Robot.clawRetractionator.Retract();
		}
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return isTimedOut();
	}

	@Override
	protected void end() {
		// TODO Auto-generated method stub
		Robot.clawRetractionator.DoNothing();
	}

	@Override
	protected void interrupted() {
		// TODO Auto-generated method stub

	}

}
