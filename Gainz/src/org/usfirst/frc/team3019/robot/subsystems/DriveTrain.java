package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.RobotMap;
import org.usfirst.frc.team3019.robot.commands.Drive;

import edu.wpi.first.wpilibj.CounterBase;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.RobotDrive.MotorType;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{

	Talon Drive_Right;
	Talon Drive_Left;
	Talon Drive_Center_A;
	Talon Drive_Center_B;
	public Encoder Right;
	public Encoder Left;
	public Encoder Center;
	RobotDrive drive;
	double ftperpulse;
	static double inchtofeet = 61.0/12.0;
	public DriveTrain() {
		// TODO Auto-generated constructor stub
		super();
		Drive_Right = new Talon(RobotMap.Drive_Right);
		Drive_Left = new Talon(RobotMap.Drive_Left);
		drive = new RobotDrive(Drive_Left, Drive_Right);
		drive.setInvertedMotor(MotorType.kFrontRight, true);
		Drive_Center_A = new Talon(RobotMap.Drive_Center_A);
		Drive_Center_B = new Talon(RobotMap.Drive_Center_B);
		Right = new Encoder(RobotMap.Encoder_Drive_Right_A, RobotMap.Encoder_Drive_Right_B, false, CounterBase.EncodingType.k4X);
		ftperpulse = inchtofeet/4753.0;
		Right.setDistancePerPulse(ftperpulse);
		Left = new Encoder(RobotMap.Encoder_Drive_Left_A, RobotMap.Encoder_Drive_Left_B, false, CounterBase.EncodingType.k4X);
		ftperpulse = inchtofeet/4771.0;
		Left.setDistancePerPulse(ftperpulse);
		Center = new Encoder(RobotMap.Encoder_Drive_Center_A, RobotMap.Encoder_Drive_Center_B, false, CounterBase.EncodingType.k4X);
		//ftperpulse = 
		//Center.setDistancePerPulse(/80.0);
		
		
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Drive());
	}
	public void Omni(){
	
	//test drive code
		//deadzone code
		double Rotate = Math.abs(Robot.oi.Drive.getX()) 	> RobotMap.Drive_DeadZone_Turn 	? -Robot.oi.Drive.getX() : 0;
		double Y = 		Math.abs(Robot.oi.Drive.getY()) 		> RobotMap.Drive_DeadZone_Y 	? -Robot.oi.Drive.getY() 	: 0; 
		if(Y < 0){
			Y = -Math.pow(Y, 2);
		}
		else{
			Y = Math.pow(Y, 2);
		}
		drive.arcadeDrive(Y,Rotate);

		//setting the middle wheel speed
		double someThing = Robot.oi.Drive.getRawAxis(4);
		System.out.println(someThing);
		if(someThing < .05 && someThing > -.05){
			someThing = 0;
		}
		Drive_Center_A.set(someThing);
		Drive_Center_B.set(someThing);		
	}
	public void driveForward(double speed){
			drive.drive(speed, 0);
	}
	public void doNothing() {
		drive.arcadeDrive(0, 0);
	}
	public void resetEncoder(){
		Right.reset();
		Left.reset();
		Center.reset();
	}
	public void Omni(double speed) {
		// TODO Auto-generated method stub
		drive.drive(speed, 0);
	}
}