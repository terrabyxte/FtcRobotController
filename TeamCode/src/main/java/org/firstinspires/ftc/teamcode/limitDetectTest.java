package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.HardwareMap;
@TeleOp
public class limitDetectTest extends OpMode {
    limitDetect detector = new limitDetect();
    boolean triggeredLimit;
    public void init() {
        detector.init(hardwareMap);

    }
    public void loop() {
        triggeredLimit = detector.limitTrig(telemetry);
    }
}

