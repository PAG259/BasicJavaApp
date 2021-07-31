package com.SpringAnno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext factory=new AnnotationConfigApplicationContext("AppConfig.class");
		
		Samsung s=factory.getBean(Samsung.class);
		s.config();
		
	}

}
