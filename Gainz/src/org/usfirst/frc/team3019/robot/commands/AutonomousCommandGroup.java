package org.usfirst.frc.team3019.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutonomousCommandGroup extends CommandGroup {
	
	public AutonomousCommandGroup() {
		// TODO Auto-generated constructor stub
	
		//addParallel(command, timeout);
		//addSequential(command, timeout);
		
		///picks up a tote start at just above the lip
		addParallel(new MoveElevatorArms(.6),.3);
		addSequential(new MoveElevator(1),1.1);
		
		//addSequential(new );
		
		
//		addSequential(new Drive(.7),.4);
//		addSequential(new Drive(0), .2);
//		addParallel(new MoveElevator(-1),1.0);
//		addSequential(new MoveElevatorArms(-.6), .3);
//		
	}
}
