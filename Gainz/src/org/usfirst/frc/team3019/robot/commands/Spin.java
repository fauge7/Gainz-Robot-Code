package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Spin extends Command {

	public Spin() {
		// TODO Auto-generated constructor stub
		requires(Robot.spin);
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(Robot.oi.Xbox.getRawButton(1)){
			System.out.println("true");
			Robot.spin.move(true);
		}
		else if(Robot.oi.Xbox.getRawButton(4)){
			System.out.println("false");
			Robot.spin.move(false);
		}
		else
			Robot.spin.doNothing();
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
