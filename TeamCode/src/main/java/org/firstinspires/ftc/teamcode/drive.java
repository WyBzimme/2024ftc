package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.Servo;

@TeleOp(name = "drive")
public class drive extends OpMode {

    DcMotor frontleft, frontright;
    DcMotor backleft, backright;

    Servo Claw;

    @Override
    public void init() {
        frontleft = hardwareMap.get(DcMotor.class, "frontleft");
        backleft = hardwareMap.get(DcMotor.class, "backleft");
        frontright = hardwareMap.get(DcMotor.class, "frontright");
        backright = hardwareMap.get(DcMotor.class, "backright");

        Claw = hardwareMap.get(Servo.class, "Claw");


    }

    @Override
    public void loop() {
        frontleft.setPower(-gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + -gamepad1.right_stick_x);
        backleft.setPower(-gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + -gamepad1.right_stick_x);
        frontright.setPower(gamepad1.right_stick_y + gamepad1.left_stick_x * 1.1 + -gamepad1.right_stick_x);
        backright.setPower(gamepad1.right_stick_y + -gamepad1.left_stick_x * 1.1 + -gamepad1.right_stick_x);


        if (gamepad1.a){
            Claw.setPosition(-1);
        }
        else{
            Claw.setPosition(1);        }

    }
}
