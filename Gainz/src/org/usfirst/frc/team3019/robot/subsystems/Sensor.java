package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.Robot;
import org.usfirst.frc.team3019.robot.commands.myAHRS;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Sensor extends Subsystem{

	public Sensor() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new myAHRS());
	}
	public void printData(){
		Robot.sp.writeString("trig");
		String Message = Robot.sp.readString();
		System.out.println(Message);
	}
}