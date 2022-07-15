package java_project.alarmexample.withAnnotation;


import org.springframework.stereotype.Component;

@Component("soundAlarmBean")
public class SoundAlarm2  implements  Alarm2{

    @Override
    public void activate() {
        System.out.println("Sound Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Sound Alarm deactivated");
    }
}
