package pl.sebitg.training.core.loggers;

public class SystemOutLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}

}
