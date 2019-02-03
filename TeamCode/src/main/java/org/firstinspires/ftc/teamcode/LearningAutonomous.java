package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

import java.util.concurrent.SynchronousQueue;

/**
 * Created by pahel on 2/2/19.
 */

@Autonomous (name = "LearningAutonomous" )
public abstract class LearningAutonomous extends LinearOpMode{

    /* Declare here any fields you might find useful. */
    DcMotor LeftWheelMotorFront = null;
    DcMotor LeftWheelMotorBack = null;
    DcMotor RightWheelMotorFront = null;
    DcMotor RightWheelMotorBack = null;

    @Override
    public void runOpMode() throws InterruptedException
    {
        //initializing hardware
        LeftWheelMotorFront = hardwareMap.dcMotor.get("LeftWheelMotorFront");
        LeftWheelMotorBack = hardwareMap.dcMotor.get("LeftWheelMotorBack");
        RightWheelMotorFront = hardwareMap.dcMotor.get("RightWheelMotorFront");
        RightWheelMotorBack = hardwareMap.dcMotor.get("RightWheelMotorBack");

        RightWheelMotorFront.setDirection(DcMotor.Direction.REVERSE);
        RightWheelMotorBack.setDirection(DcMotor.Direction.REVERSE);

        //wait for game to start
        waitForStart();

        //setting power to motors
        //driving forward
        LeftWheelMotorFront.setPower(.5);
        LeftWheelMotorBack.setPower(.5);
        RightWheelMotorFront.setPower(.5);
        RightWheelMotorBack.setPower(.5);
        Thread.sleep(4000);


        telemetry.update();
    }


}
