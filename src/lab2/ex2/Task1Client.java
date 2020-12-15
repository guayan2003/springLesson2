package lab2.ex2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lab2.ex1.Product;

public class Task1Client {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"lab2/ex2/beans-config.xml");
		Product p = (Product) context.getBean("productA");
		System.out.println(p);
		// start task1 here
		// end task1
		
	}

}
