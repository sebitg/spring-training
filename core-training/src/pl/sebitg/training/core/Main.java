package pl.sebitg.training.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import pl.sebitg.training.core.events.LogEvent;
import pl.sebitg.training.core.events.LogEventPublisher;
import pl.sebitg.training.core.sampleclasses.SomeInterface;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:/resources/application-context.xml");		//Initialize application context
		
		//Get your bean here, and make some action...
		SomeInterface bean = ctx.getBean(SomeInterface.class);
		bean.foo();
		
		
		String[] messages = {
			"One message",
			"The second one",
			"The third one..."
		};
		for(String message: messages) {
			LogEvent logEvent = new LogEvent(message);
			
			//One way to publish event
			//ctx.publishEvent(logEvent);
			
			//The second one
			LogEventPublisher bean2 = ctx.getBean(LogEventPublisher.class);
			bean2.dispatch(logEvent);
		}
		
		((AbstractApplicationContext)ctx).registerShutdownHook();
	}

}