package java_project.alarmexample.configbasedbeans;




public class SoundAlarm5  implements Alarm5 {

    @Override
    public void activate() {
        System.out.println("Sound Alarm activated");
    }

    @Override
    public void deactivate() {
        System.out.println("Sound Alarm deactivated");
    }
}