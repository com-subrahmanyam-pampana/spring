package java_project.alarmexample.qualifier;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component()
public class Door4 {



    @Autowired
    @Qualifier("visualAlarm4")
    private Alarm4 alarm;
    public void open() {
        alarm.activate();
    }
    public void close() {
        alarm.deactivate();
    }
}