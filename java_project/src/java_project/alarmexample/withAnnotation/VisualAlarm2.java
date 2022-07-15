package java_project.alarmexample.withAnnotation;

import org.springframework.stereotype.Component;

@Component("visualAlarmBean")
public class VisualAlarm2 implements  Alarm2 {

    @Override
    public void activate() {
        System.out.println("Visual Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Visual Alarm activated");
    }
}
