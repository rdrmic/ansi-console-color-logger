package io.github.rdrmic.util.colorlogger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ColorLogger {
	
	private static final String CODE_BOLD = "\u001b[1m";
	private static final String CODE_COLOR_YELLOW = "\u001b[33m";
	private static final String CODE_COLOR_GREEN = "\u001b[32m";
	private static final String CODE_COLOR_RED = "\u001b[31m" + CODE_BOLD;
	private static final String CODE_COLOR_BLUE = "\u001b[34m" + CODE_BOLD;
	private static final String CODE_RESET = "\u001b[0m";
	
	private final Logger logger;
	
	public ColorLogger(Class<?> callerClass) {
		logger = LoggerFactory.getLogger(callerClass);
	}
	
	private void toLogger(String colorCode, Object obj) {
		logger.info("{}{}{}", colorCode, obj, CODE_RESET);
	}
	
	// DEBUG
	public void debug(final Object obj) {
		toLogger(CODE_COLOR_YELLOW, obj);
	}
	
	public void debug(final String fmt, final Object... obj) {
		String formattedMsg = String.format(fmt, obj);
		debug(formattedMsg);
	}
	
	// INFO
	public void info(final Object obj) {
		toLogger(CODE_COLOR_GREEN, obj);
	}
	
	public void info(final String fmt, final Object... obj) {
		String formattedMsg = String.format(fmt, obj);
		info(formattedMsg);
	}
	
	// EMPHASIZE
	public void emph(final Object obj) {
		toLogger(CODE_COLOR_RED, obj);
	}
	
	public void emph(final String fmt, final Object... obj) {
		String formattedMsg = String.format(fmt, obj);
		emph(formattedMsg);
	}
	
	// SPECIAL
	public void spec(final Object obj) {
		toLogger(CODE_COLOR_BLUE, obj);
	}
	
	public void spec(final String fmt, final Object... obj) {
		String formattedMsg = String.format(fmt, obj);
		spec(formattedMsg);
	}

}
