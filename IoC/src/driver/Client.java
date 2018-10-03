package driver;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import beans.Test;

public class Client {

	public static void main(String[] args) 
	{
		ApplicationContext ap = new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("Document is valid");
		
		Test o1 = (Test)ap.getBean("t");

	}

}
