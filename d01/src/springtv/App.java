package springtv;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = 
		new GenericXmlApplicationContext("myspring.xml");
		
		System.out.println("Spring Started");
		
		TV stv = (TV)factory.getBean("sstv");
		stv.turnOn();
		stv.volumeUp(10);
		System.out.println(stv);
		
		TV stv2 = (TV)factory.getBean("sstv");
		stv2.turnOn();
		stv2.volumeUp(10);
		System.out.println(stv2);
		
		factory.close();
	}

}
