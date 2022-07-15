package java_project;


import java_project.alarmexample.Door;
import java_project.alarmexample.autowiring.Door3;
import java_project.alarmexample.configbasedbeans.AlarmBeansConfigFile;
import java_project.alarmexample.configbasedbeans.Door5;
import java_project.alarmexample.configbasedbeans.SoundAlarm5;
import java_project.alarmexample.configbasedbeans.VisualAlarm5;
import java_project.alarmexample.qualifier.Door4;
import java_project.alarmexample.withAnnotation.Alarm2;
import java_project.alarmexample.withAnnotation.Door2;
import java_project.config.ComponentScanConfig;
import java_project.helloworld.HelloWorld;
import java_project.repositoryexample.Student;
import java_project.repositoryexample.StudentRepository;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;


public class MainActivity  extends  Throwable{
	public static void helloWorld(){
		ApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
		obj.getMessage();
	}

	public static  void alarmExampleTestWithAnnotations() {
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:componentscan.xml");


		Alarm2 soundAlarm=context.getBean("soundAlarm2",Alarm2.class);
		Door2 doorWithSoundAlarm=new Door2();
		doorWithSoundAlarm.setAlarm(soundAlarm);
		doorWithSoundAlarm.open();
		doorWithSoundAlarm.close();

		Alarm2 visualAlarm=context.getBean("visualAlarmBean",Alarm2.class);
		Door2 doorWithVisualAlarm=new Door2();
		doorWithVisualAlarm.setAlarm(visualAlarm);
		doorWithVisualAlarm.open();
		doorWithVisualAlarm.close();

	}

	public static  void alarmExampleTestAutoWiring() {
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:componentscan.xml");

		Door3 door=context.getBean("door3",Door3.class);
		door.open();
		door.close();
		/*We added only VisualAlarm3  to beans.We didn't added SoundAlarm3 to beans.Even thought SoundAlarm3 extedns Alarm3,we did't added to beans.*/
		/*So in output you will see Visual Alarm only.Not sound alarm*/
		/*If you add  SoundAlarm3 also to bean you will get the following errror*/
		/*Error:available: expected single matching bean but found 2*/
		/*You can fix this error,that when Multipul classes extends a Interface and it will trow an error*/

	}

	public static  void alarmExampleTestAutoWiringWithQalifier(){
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ComponentScanConfig.class);

		Door4 door=context.getBean("door4",Door4.class);
		door.open();
		door.close();

	}


	public static  void alarmExampleWithJavaConfigBasedBeans() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AlarmBeansConfigFile.class);


		SoundAlarm5 soundAlarm=context.getBean("soundAlarm",SoundAlarm5.class);
		VisualAlarm5 visualAlarm=context.getBean("visualAlarm",VisualAlarm5.class);

		Door5 door=new Door5();
		door.setAlarm(visualAlarm);
		//door.setAlarm(soundAlarm);
		door.open();
		door.close();


	}

	public static  void alarmExamplePropertietFile() {
		AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(AlarmBeansConfigFile.class);
		/*Propertes file testing*/
		Door5 door=context.getBean("door",Door5.class);
		door.open();
		door.close();
	}




	public static  void springConfigWithJavaCode(){
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:componentscan.xml");

		Door4 door=context.getBean("door4",Door4.class);
		door.open();
		door.close();

	}







	public static  void alarmExampleTestWithXMLConfig() {
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

	public static void userEntity() {
//		EntityManagerFactory emf= Persistence.createEntityManagerFactory("user_details");
//		EntityManager em=emf.createEntityManager();
//		em.getTransaction().begin();
//
//		UserEntity s1=new UserEntity();
//		s1.setUserId(1);
//		s1.setEmail("user1@gmail.com");
//		s1.setPhone("9123456789");
//		UserEntity s2=new UserEntity();
//		s1.setUserId(2);
//		s1.setEmail("user2@gmail.com");
//		s1.setPhone("8123456789");
//
//
//		em.persist(s1);
//		em.persist(s2);
//
//		em.getTransaction().commit();
//
//		emf.close();
//		em.close();
	}


	public void hybernateExample() {
//		Session session = HibernateUtil.getSessionFactory().openSession();
//		session.beginTransaction();
//
//		//Add new Employee object
//		EmployeeEntity emp = new EmployeeEntity();
//		emp.setEmail("demo-user@mail.com");
//		emp.setFirstName("demo");
//		emp.setLastName("user");
//
//		session.save(emp);
//
//		session.getTransaction().commit();
//		HibernateUtil.shutdown();
	}
	public static void main(String[] args) {
		//helloWorld();
		//alarmExampleTestWithXMLConfig();

		/**/
		//alarmExampleTestWithAnnotations();
		//alarmExampleTestAutoWiring();
		//alarmExampleTestAutoWiringWithQalifier();
		//springConfigWithJavaCode();
		//alarmExampleWithJavaConfigBasedBeans();
		alarmExamplePropertietFile();
		//demoRepository();
		//userEntity();
	}
}
