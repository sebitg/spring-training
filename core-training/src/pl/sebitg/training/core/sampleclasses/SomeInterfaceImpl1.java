package pl.sebitg.training.core.sampleclasses;

import pl.sebitg.training.core.loggers.Logger;

public class SomeInterfaceImpl1 implements SomeInterface {
	
	private Logger logger;

	@Override
	public void foo() {
		System.out.println("Hello world!");
	}

	public Logger getLogger() {
		return logger;
	}

	public void setLogger(Logger logger) {
		this.logger = logger;
	}

}