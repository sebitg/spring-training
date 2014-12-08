package pl.sebitg.training.core.loggers;

import org.apache.log4j.LogManager;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier(value="log4j")
public class Log4JLogger implements Logger {
	
	private static final org.apache.log4j.Logger LOG  = LogManager.getLogger(Log4JLogger.class);

	@Override
	public void log(String message) {
		LOG.info(message);
	}

}
