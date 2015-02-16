package org.usfirst.frc.team3019.robot.subsystems;

import org.usfirst.frc.team3019.robot.RobotMap;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class ClawRetractionator extends Subsystem {

	DoubleSolenoid soli;
	public ClawRetractionator() {
		// TODO Auto-generated constructor stub
		super();
		soli = new DoubleSolenoid(RobotMap.Rear_Lift_D_Soli_Claw_Deploy_F, RobotMap.Rear_Lift_D_Soli_Claw_Deploy_R);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}
	public void Extend(){
		System.out.println("extending");
		soli.set(DoubleSolenoid.Value.kForward);
	}
	public void Retract(){
		System.out.println("retracting");
		soli.set(DoubleSolenoid.Value.kReverse);
	}
	public void DoNothing(){
		soli.set(DoubleSolenoid.Value.kOff);
	}

}
