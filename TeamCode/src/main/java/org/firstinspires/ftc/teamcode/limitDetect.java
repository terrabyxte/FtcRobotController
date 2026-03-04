package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.hardware.DigitalChannel;
import com.qualcomm.robotcore.hardware.HardwareMap;

import org.firstinspires.ftc.robotcore.external.Telemetry;

public class limitDetect {
    DigitalChannel limit;
    public void init(HardwareMap hwmap) {
        limit = hwmap.get(DigitalChannel.class, "limit1");
        limit.setMode(DigitalChannel.Mode.INPUT);
    }
    public boolean limitTrig(Telemetry telemetry) {
        if (limit.getState()) {
            telemetry.addData("Sensor is", limit.getState());
            return true; }
        else {
            telemetry.addData("Sensor is", limit.getState());
            return false; }
    }
}
