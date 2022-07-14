package java_project;


import java_project.alarmexample.Door;
import java_project.helloworld.HelloWorld;
import java_project.repositoryexample.Student;
import java_project.repositoryexample.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
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


	public static void demoRepository() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("java_project.repositoryexample");
		context.refresh();

		StudentRepository repository = context.getBean(StudentRepository.class);
		// testing the store method
		repository.save(new Student(1L, "Anshul", 25));
		repository.save(new Student(2L, "Mayank", 23));
		// testing the retrieve method
		Student student = repository.findStudentById(1L);
		System.out.println(student);
		// close the spring context
		context.close();
	}
	public static void main(String[] args) {
		//helloWorld();
		//alarmExampleTest();
		demoRepository();
	}
}
