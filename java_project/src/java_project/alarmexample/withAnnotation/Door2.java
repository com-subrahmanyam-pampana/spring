package java_project.alarmexample.withAnnotation;


public class Door2 {
    private Alarm2 alarm;

    public void setAlarm(Alarm2 alarm) {
        this.alarm=alarm;
    }

    public void open() {
        alarm.activate();
    }
    public void close() {
        alarm.deactivate();
    }
}
