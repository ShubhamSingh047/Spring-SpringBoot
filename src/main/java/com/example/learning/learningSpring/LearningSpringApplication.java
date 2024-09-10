package com.example.learning.learningSpring;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

@SpringBootApplication
public class LearningSpringApplication {

	public static void main(String[] args) {
//		SpringApplication.run(LearningSpringApplication.class, args);
		System.out.println("Please elset the table type /n 1)Short /n 2)Long");

		Scanner s1=new Scanner(System.in);
		String size = s1.nextLine();

		ClassPathXmlApplicationContext c1= new ClassPathXmlApplicationContext("applicationContext.xml");

		if(size.equals("long")){
//			longTable l1=new longTable(128.23,200.1);
//			String result=l1.showDetails();
			Table longTable =(Table)c1.getBean("longTable");
			String result=longTable.showDetails();
			System.out.println(result);
		}else{
//			shortTables sh1=new shortTables(10.1,12.1);
//			String result=sh1.showDetails();
			Table shortTable=(Table)c1.getBean("shortTable");
			String result=shortTable.showDetails();
			System.out.println(result);
		}
	}

}
