package Com.Entity;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainMethod {

	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("employee.xml");
		
		
		Employee ref = (Employee) ctx.getBean("obj1");
		Employee ref2 = (Employee) ctx.getBean("obj2");
		
		System.out.println(ref);
		System.out.println(ref2);
	}
}	