package java_project.alarmexample.qualifier;

import org.springframework.stereotype.Component;

@Component("visualAlarm4")
public class VisualAlarm4 implements Alarm4 {

    @Override
    public void activate() {
        System.out.println("Visual Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Visual Alarm activated");
    }
}