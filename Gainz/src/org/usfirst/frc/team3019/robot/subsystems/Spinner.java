package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.commands.Spin;

import edu.wpi.first.wpilibj.Relay;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Spinner extends Subsystem {
	Relay Right;
	Relay Left;
	public Spinner() {
	// TODO Auto-generated constructor stub
		super();
		Right = new Relay(0);
		Left = new Relay(1);
	}
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		setDefaultCommand(new Spin());
	}
	public void move(boolean forward){
		if(forward){
			Right.set(Relay.Value.kReverse);
			Left.set(Relay.Value.kReverse);	
			
		}
		else{
			Right.set(Relay.Value.kForward);
			Left.set(Relay.Value.kForward);	
		}
	}
	public void doNothing(){
		Right.set(Relay.Value.kOff);
		Left.set(Relay.Value.kOff);
	}

}
