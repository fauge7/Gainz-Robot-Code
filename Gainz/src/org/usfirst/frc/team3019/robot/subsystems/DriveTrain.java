package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.Drive;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{

	Talon Drive_Right;
	Talon Drive_Left;
	Talon Drive_Center_A;
	Talon Drive_Center_B;
	RobotDrive drive;
	
	public DriveTrain() {
		// TODO Auto-generated constructor stub
		super();
		Drive_Right = new Talon(RobotMap.Drive_Right);
		Drive_Left = new Talon(RobotMap.Drive_Left);
		drive = new RobotDrive(Drive_Left, Drive_Right);
		drive.setInvertedMotor(MotorType.kFrontRight, true);
		Drive_Center_A = new Talon(RobotMap.Drive_Center_A);
		Drive_Center_B = new Talon(RobotMap.Drive_Center_B);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
	}
	public void Omni(){
	
	//test drive code
		//deadzone code
		double Rotate = Robot.oi.Drive.getTwist() 	> RobotMap.Drive_DeadZone_Turn 	? Robot.oi.Drive.getTwist() : 0;
		double Y = 		Robot.oi.Drive.getY() 		> RobotMap.Drive_DeadZone_Y 	? Robot.oi.Drive.getY() 	: 0;
		drive.arcadeDrive(Y,Rotate);

		/*if(Math.abs(Robot.oi.Drive.getTwist()) > .45){
			System.out.println(Robot.oi.Drive.getTwist());
			Drive_Left.set(Robot.oi.Drive.getTwist());
			Drive_Right.set(Robot.oi.Drive.getTwist());
		}
		else{
			double YSpeed = Robot.oi.Drive.getY();
			YSpeed = Math.abs(YSpeed) > .1 ? -YSpeed : 0;
			Drive_Left.set(YSpeed);
			Drive_Right.set(-YSpeed);
		 }*/
		//setting the middle wheel speed
		if(Robot.oi.button3.get()){
			Drive_Center_A.set(.75);
			Drive_Center_B.set(-.75);
		}
		else if(Robot.oi.button4.get()){
			Drive_Center_A.set(-.75);
			Drive_Center_B.set(.75);
		}
		else if(Robot.oi.button5.get()){
			Drive_Center_A.set(1);
			Drive_Center_B.set(-1);
		}
		else if(Robot.oi.button6.get()){
			Drive_Center_A.set(-1);
			Drive_Center_B.set(1);	
		}
		else{
			Drive_Center_A.set(0);
			Drive_Center_B.set(0);		
		}
	}
	public void driveForward(double speed){
			Robot.driveTrain.Omni();
	}
	public void doNothing() {
		drive.arcadeDrive(0, 0);
	}
}