package pl.sebitg.training.core.loggers;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="console")
public class SystemOutLogger implements Logger {

	@Override
	public void log(String message) {
		System.out.println("[LOG] " + message);
	}
	


}