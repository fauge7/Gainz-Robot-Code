package org.usfirst.frc.team3019.robot.commands;

import org.usfirst.frc.team3019.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class MoveElevator extends Command{

	double speed;
	
	public MoveElevator() {
		// TODO Auto-generated constructor stub
		requires(Robot.elevator);
		this.speed = 500;
	}
	public MoveElevator(double speed) {
		// TODO Auto-generated constructor stub
		requires(Robot.elevator);
		this.speed = speed;
	}
	@Override
	protected void initialize() {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void execute() {
		// TODO Auto-generated method stub
		SmartDashboard.putBoolean("Elevator Limit", Robot.elevator.limit.get());
//		SmartDashboard.putNumber("Elevator Encoder:", Robot.elevator.encoder.getRaw());
//		SmartDashboard.putNumber("Elevator Distance", Robot.elevator.encoder.getDistance());
//		
		if(speed == 500){
			//Robot.elevator.move();
		}
		else{
			Robot.elevator.move(speed);
		}	
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
