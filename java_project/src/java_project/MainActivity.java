package java_project;


import java_project.alarmexample.Door;
import java_project.entityexample.UserEntity;
import java_project.helloworld.HelloWorld;
import java_project.hibernate.EmployeeEntity;
import java_project.hibernate.HibernateUtil;
import java_project.repositoryexample.Student;
import java_project.repositoryexample.StudentRepository;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class MainActivity  extends  Throwable{
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
		alarmExampleTest();
		//demoRepository();
		//userEntity();
	}
}
