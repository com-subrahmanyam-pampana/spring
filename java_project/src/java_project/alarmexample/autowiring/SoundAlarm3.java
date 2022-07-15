package java_project.alarmexample.autowiring;


import org.springframework.stereotype.Component;


//@Component()
public class SoundAlarm3  implements Alarm3 {

    @Override
    public void activate() {
        System.out.println("Sound Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Sound Alarm deactivated");
    }
}