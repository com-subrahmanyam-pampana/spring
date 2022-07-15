package java_project.alarmexample.qualifier;


import org.springframework.stereotype.Component;

@Component("soundAlarm4")
public class SoundAlarm4  implements Alarm4 {

    @Override
    public void activate() {
        System.out.println("Sound Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Sound Alarm deactivated");
    }
}