package org.firstinspires.ftc.teamcode;

import android.util.Range;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "drive")
public class drive extends OpMode {

    DcMotor leftfront, rightfront;
    DcMotor leftback, rightback;

    Servo claw;

    @Override
    public void init() {
        leftfront = hardwareMap.get(DcMotor.class, "leftfront");
        leftback = hardwareMap.get(DcMotor.class, "leftback");
        rightfront = hardwareMap.get(DcMotor.class, "rightfront");
        rightback = hardwareMap.get(DcMotor.class, "rightback");

        claw = hardwareMap.get(Servo.class, "claw");

    }

    @Override
    public void loop() {
        leftfront.setPower(gamepad1.left_stick_y);
        leftback.setPower(gamepad1.left_stick_y);
        rightfront.setPower(gamepad1.right_stick_y);
        rightback.setPower(gamepad1.right_stick_y);

        if (gamepad1.a){
            claw.setPosition(1);
        }
        else{
            claw.setPosition(0.5);        }


    }
}
