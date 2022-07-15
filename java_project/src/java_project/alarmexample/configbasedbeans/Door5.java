package java_project.alarmexample.configbasedbeans;


import java_project.alarmexample.Alarm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Door5 {
    private Alarm5 alarm;

    public void setAlarm(Alarm5 alarm) {
        this.alarm=alarm;
    }
    public void open() {
        alarm.activate();
    }
    public void close() {
        alarm.deactivate();
    }
}