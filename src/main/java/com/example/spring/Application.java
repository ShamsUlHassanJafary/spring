package com.example.spring;

import com.example.spring.example1.Parrot;
import com.example.spring.example5.Person;
import com.example.spring.example6.Cat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

import java.util.function.Supplier;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {

	var context = 	SpringApplication.run(Application.class, args);

	/*
	example1
	1-example1 , explain spring context container
	2-Difference between object in container and object in app
	3- explain @Configuration
	 */

//		Parrot p =	context.getBean(Parrot.class);
//		System.out.println(p.getName());


		/*
			example2
		1- explain default name of bean
		2- explain Singleton Bean
		3- create multiple been of same type
		4- No qualifying bean of type 'com.example.spring.example1.Parrot' available: expected single matching bean but found 2: parrot1,parrot2

		 */

//		//		context.getBean(Parrot.class);
//		Parrot parrot1  = context.getBean("parrot1", Parrot.class);
//		System.out.println(parrot1.getName());
//
//		Parrot parrot2  = context.getBean("parrot2", Parrot.class);
//		System.out.println(parrot2.getName());




		/*
			example3
		1- if someone changes method name,  need of bean name.
		 */


//		Parrot parrot1 = context.getBean("Ruby", Parrot.class);
//		System.out.println(parrot1.getName());
//
//		Parrot parrot2 = context.getBean("Macy", Parrot.class);
//		System.out.println(parrot2.getName());


		/*
		 example4
		1- @Bean is also capable creating bean of library classes
		 */

//		String string = context.getBean(String.class);
//		System.out.println(string);
//
//		int abc = context.getBean(Integer.class);
//		System.out.print(abc);


		/*
		example5
		1-explain @Component
		2- explain @ComponentScan , @Configuration and @ AutoConfiguration => @SpringBootApplication
		3- How we initialize Bean which is created using @component, @PostConstruct
		 */

//		Person person = context.getBean(Person.class);
//		System.out.println("Person Name " + person.getName());



		/*
		example 6
		1- explain primary Bean
		 */

//		Cat cat = context.getBean(Cat.class);
//		System.out.println(cat.getName());



		/*
		 Programmatically register Bean.


		 */

//		Parrot x = new Parrot();
//		x.setName("Kiki");
//		Supplier<Parrot> parrotSupplier1 = () -> x;
//
//		Parrot y = new Parrot();
//		y.setName("Ozzy");
//		Supplier<Parrot> parrotSupplier2 = () -> y;
//
//		if (context instanceof GenericApplicationContext) {
//			GenericApplicationContext genericContext = (GenericApplicationContext) context;
//			genericContext.registerBean("Ricky", Parrot.class, parrotSupplier1);
//			genericContext.registerBean("Ozzy", Parrot.class, parrotSupplier2);
//		}
//
//		Parrot p1 = context.getBean( "Ricky",Parrot.class);
//		Parrot p2 = context.getBean( "Ozzy",Parrot.class);
//		System.out.println(p1.getName());

	}

}
