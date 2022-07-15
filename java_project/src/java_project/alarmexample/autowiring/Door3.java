package java_project.alarmexample.autowiring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component()
public class Door3 {
    private Alarm3 alarm;

    @Autowired
    public void setAlarm(Alarm3 alarm) {
        this.alarm=alarm;
    }

    public void open() {
        alarm.activate();
    }
    public void close() {
        alarm.deactivate();
    }
}