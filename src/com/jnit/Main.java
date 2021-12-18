package com.jnit;

import java.util.Iterator;
import java.util.Set;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		 ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("spring1.xml");
		Student s = (Student) appContext.getBean("rahul");
		
		System.out.println(s.getSid()+" "+s.getSname()+" "+s.getMarks());
		
		Set se = s.getCourses();
		
		Iterator i = se.iterator();
		
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		

	}

}
