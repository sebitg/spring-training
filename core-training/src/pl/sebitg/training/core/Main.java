package pl.sebitg.training.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.sebitg.training.core.sampleclasses.SomeInterface;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/resources/application-context.xml");		//Initialize application context
		
		//Get your bean here, and make some action...
		System.out.println(ctx.containsBean("someBeanDoesNotExist"));
		
		SomeInterface bean = ctx.getBean(SomeInterface.class);
		bean.foo();
		
		((AbstractApplicationContext)ctx).registerShutdownHook();	
	}

}
