package com.jnit1;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring1.xml");
		Student1 s = (Student1) appContext.getBean("rahul");
		
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
		
		Map m =  s.getCourses();
		
		Set se = m.entrySet();
		
		Iterator i = se.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
