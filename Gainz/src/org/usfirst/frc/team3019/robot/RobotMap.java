package org.usfirst.frc.team3019.robot;



/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {

	public static final int Elevator_A = 0;
	public static final int Elevator_B = 1;
	
	//motor pwm channels
	public static final int Drive_Right = 0;
	public static final int Drive_Left = 1;
	public static final int Drive_Center_A = 2;
	public static final int Drive_Center_B = 3;
	public static final int ElevatorTop = 4;
	public static final int ElevatorBottom = 5;
	public static final int Elevator_Arm = 6;
    
    
	//solinoid constants
	public static final int Rear_Lift_D_Soli_F_E = 0;
	public static final int Rear_Lift_D_Soli_R_E = 1;
	public static final int Rear_Lift_D_Soli_F = 2;
	public static final int Rear_Lift_D_Soli_R = 3;
	
	
	//Elelvator Arms
	public static final double SomeSpeedForLaterSADGSDGDG = 0;
	
	
	public static final double Drive_DeadZone_Y = 0.1;
	public static final double Drive_DeadZone_Turn = 0.35;
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
}
