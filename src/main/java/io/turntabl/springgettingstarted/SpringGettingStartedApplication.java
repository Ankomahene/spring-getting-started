package io.turntabl.springgettingstarted;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringGettingStartedApplication {

	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");

		HumanBean person = (HumanBean)ac.getBean("humanBean");

		System.out.println(person.getFName());
		System.out.println(person.getLName());
		
		System.out.println(person.getBestFriend().getFName());
		System.out.println(person.getBestFriend().getLName());




	}

}
