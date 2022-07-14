package java_project;


import java_project.alarmexample.Door;
import java_project.helloworld.HelloWorld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainActivity {
	public static void helloWorld(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}

	public static  void alarmExampleTest() {
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:alarmbeans.xml");
		Door door=context.getBean("doorBeanWithSoundAlarm",Door.class);
		door.open();
		door.close();

		Door door2=context.getBean("doorBeanWithVisualAlarm",Door.class);
		door2.open();
		door2.close();
	}
	public static void main(String[] args) {
		helloWorld();
		alarmExampleTest();
	}
}
