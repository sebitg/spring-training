package pl.sebitg.training.core.sampleclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import pl.sebitg.training.core.events.LogEvent;
import pl.sebitg.training.core.loggers.Logger;

@Component
public class SomeInterfaceImpl1 implements SomeInterface, ApplicationListener<LogEvent> {
	
	@Autowired
	@Qualifier("console")
	private Logger logger;

	@Override
	public void foo() {
		logger.log("Some dummy message!");
	}
	
	@Override
	public void onApplicationEvent(LogEvent event) {
		logger.log(event.getMessage());
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}