package lab0;

/**
 * Skriver ut Hello world!
 *
 * @author Anna Eilertsen - anna.eilertsen@uib.no
 *
 */
public class HelloWorld {
	
	/*
	 * TODO: Set this variable to true.
	 */
	public final static boolean FINISHED_WITH_LAB0 = false;

	public static void main(String[] args) {
		String helloWorld = getHelloWorld();
		System.out.println(helloWorld);
	}

	/**
	 * Henter en Hello World-{@link String}
	 *
	 * @return "Hello World!"
	 */
	public static String getHelloWorld() {
		return "Hello World!";
	}
}
