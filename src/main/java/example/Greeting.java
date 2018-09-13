package example;

import java.util.logging.Logger;

public class Greeting {
	private static final Logger logger = Logger.getLogger(Greeting.class.getName());
	static final String HELLO = "Hello World";

	public void coveredByUnitTest() {
		logger.info(HELLO);

	}

	public void notCoveredByUnitTest() {
		logger.info(HELLO);
	}

	public void notCoveredByUnitTest2() {
		logger.info(HELLO);

	}
}
