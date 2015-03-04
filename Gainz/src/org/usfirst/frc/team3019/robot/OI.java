package org.usfirst.frc.team3019.robot;

import org.usfirst.frc.team3019.robot.commands.ActuateRear;
import org.usfirst.frc.team3019.robot.commands.Deploy;
import org.usfirst.frc.team3019.robot.commands.LiftRear;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    public Joystick Drive = new Joystick(0);
    public Joystick Xbox = new Joystick(1);
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    public Button ArmOpen = new JoystickButton(Drive,1);
    public Button ArmClose = new JoystickButton(Drive,2);
    public Button button3 = new JoystickButton(Drive,3);
    public Button button4 = new JoystickButton(Drive,4);
    public Button button5  = new JoystickButton(Drive,5);
    public Button button6  = new JoystickButton(Drive,6);
    
    
    public Button ElevatorFastUp = new JoystickButton(Drive,9);
    public Button ElevatorSlowUp = new JoystickButton(Drive,10);
    public Button ElevatorFastDown = new JoystickButton(Drive,11);
    public Button ElevatorSlowDown = new JoystickButton(Drive,12);
    
    

    //xbox controls
    //public Button ClawDeploy = new JoystickButton(Xbox,1);
    //public Button ClawUnDeploy = new JoystickButton(Xbox,4);
    public Button buttonOpen = new JoystickButton(Xbox,2);
    public Button buttonClose = new JoystickButton(Xbox,3);
    public Button buttonElevatorUp = new JoystickButton(Xbox,5);
    public Button buttonElevatorDown = new JoystickButton(Xbox,6);
    
    public Button DriveDistance = new JoystickButton(Xbox,9);
    
    //public Button buttonClawClose = new JoystickButton(Xbox,4);
    //public Button buttonClawOpen = new JoystickButton(Xbox,4);
    
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    public OI() {
		// TODO Auto-generated constructor stub
    	//button1.whenPressed();
    
    //ClawDeploy.whenPressed(new Deploy(false,.5));
    //ClawUnDeploy.whenPressed(new Deploy(true,.5));
    
    buttonElevatorDown.whenPressed(new LiftRear(false, .5));
    buttonElevatorUp.whenPressed(new LiftRear(true, .5));
    buttonClose.whenPressed(new ActuateRear(true,.5));
    buttonOpen.whenPressed(new ActuateRear(false, .5));
    }
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
}

