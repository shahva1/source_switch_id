
/** 
 * The HelloWorldApp class implements an application that simply prints "Hello World" to standard output.
 */
public class HelloWorld {
  public static void main(String[] args) {
    System.out.println("Hello, World");
	System.out.println("Hello, World");
	for(String arg : args) {
		System.out.println("$$$$$$$$$$$" + arg);
	}
	
	String variable = System.getProperty("source.switch.id");
	System.out.println("#############"+ variable );
  }
}
