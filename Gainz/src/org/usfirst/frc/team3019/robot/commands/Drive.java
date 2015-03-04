package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Drive extends Command{

	double speed;
	public Drive() {
		// TODO Auto-generated constructor stub
		requires(Robot.driveTrain);
		speed = 500;
	}

	public Drive(double speed) {
		// TODO Auto-generated constructor stub
		this.speed = speed;
	}

	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		if(speed != 500){
			Robot.driveTrain.Omni(speed);
		}
		else{
			Robot.driveTrain.Omni();
		}
		
		SmartDashboard.putNumber("Right Drive Encoder", Robot.driveTrain.Right.getRaw());
		SmartDashboard.putNumber("Left Drive Encoder", Robot.driveTrain.Left.getRaw());
		SmartDashboard.putNumber("Center Drive Encoder", Robot.driveTrain.Center.getRaw());
		SmartDashboard.putNumber("Right Drive Distance", Robot.driveTrain.Right.getDistance());
		SmartDashboard.putNumber("Left Drive Distance", Robot.driveTrain.Left.getDistance());
		SmartDashboard.putNumber("Center Drive Distance", Robot.driveTrain.Center.getDistance());
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
