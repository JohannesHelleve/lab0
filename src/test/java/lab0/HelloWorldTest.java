package lab0;

import static org.junit.jupiter.api.Assertions.*;
import java.lang.Runtime.Version;
import org.junit.jupiter.api.Test;

public class HelloWorldTest{

	@Test 
	void testGetHelloWorld() {
		assertTrue(HelloWorld.getHelloWorld().equals("Hello World!"));
	}

	@Test
	void testJavaVersion() {
		String minimalJavaVersion = "17";
		String currentJavaVersion = System.getProperty("java.version");
		Version current = Runtime.Version.parse(currentJavaVersion);
		Version minimal = Runtime.Version.parse(minimalJavaVersion);
		assertTrue(current.compareTo(minimal) >= 0, "Your Java version is too low, should be at least 17.0.1. Current version is: " + currentJavaVersion);
	}
	
	@Test
	void finishedWithLab0() {
		assertTrue(HelloWorld.FINISHED_LAB0, "You must set the variable FINISHED_LAB0 to true in HelloWorld.java.");
	}

}
