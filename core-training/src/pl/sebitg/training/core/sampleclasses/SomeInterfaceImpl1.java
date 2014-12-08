package pl.sebitg.training.core.sampleclasses;

import pl.sebitg.training.core.loggers.Logger;

public class SomeInterfaceImpl1 implements SomeInterface {
	
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