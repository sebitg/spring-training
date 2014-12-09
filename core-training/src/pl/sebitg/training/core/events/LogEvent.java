package pl.sebitg.training.core.events;

import org.springframework.context.ApplicationEvent;

/**
 * This is just a POJO. Make it springable! :D
 * @author s.mekal
 *
 */
public class LogEvent extends ApplicationEvent {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String message;
	
	public LogEvent(Object source) {
		super(source);
		message = source.toString();
	}

	public String getMessage() {
		return message;
	}
	
}