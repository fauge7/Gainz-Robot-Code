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
	public static final int Drive_Right = 5;
	public static final int Drive_Left = 0;
	public static final int Drive_Center_A = 2;
	public static final int Drive_Center_B = 1;
	public static final int ElevatorBottom = 4;
	public static final int Elevator_Arm = 3;
    
    
	//solinoid constants
	public static final int Rear_Lift_D_Soli_Forward = 0;
	public static final int Rear_Lift_D_Soli_Retract = 1;
	public static final int Rear_Lift_D_Soli_Claw_Open = 2;
	public static final int Rear_Lift_D_Soli_Claw_Close = 3;
	public static final int Rear_Lift_D_Soli_Claw_Deploy_F = 4;
	public static final int Rear_Lift_D_Soli_Claw_Deploy_R = 5;
	public static final int Elevator_Lock_R = 6;
	
	//Elelvator Arms
	public static final double SomeSpeedForLaterSADGSDGDG = .75;
	
	
	public static final double Drive_DeadZone_Y = 0.05;
	public static final double Drive_DeadZone_Turn = 0.10;
    
	//dio ports
	public static final int Encoder_Drive_Right_A = 6;
	public static final int Encoder_Drive_Right_B = 7;
	
	public static final int Encoder_Drive_Left_A = 2;
	public static final int Encoder_Drive_Left_B = 3;
	
	public static final int Encoder_Drive_Center_A = 4;
	public static final int Encoder_Drive_Center_B = 5;
	
	public static final int Encoder_Elevator_A = 0;
	public static final int Encoder_Elevator_B = 1;
	
	//limit switcg dio
	public static final int Limit_Switch_Elevator = 9;
	
	
}
