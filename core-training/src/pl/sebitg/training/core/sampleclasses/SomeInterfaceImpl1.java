package pl.sebitg.training.core.sampleclasses;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import pl.sebitg.training.core.loggers.Logger;

@Component
public class SomeInterfaceImpl1 implements SomeInterface {
	
	@Autowired
	@Qualifier("console")
	private Logger logger;

	@Override
	public void foo() {
		logger.log("Some dummy message!");
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}