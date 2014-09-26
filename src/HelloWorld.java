package osv;

import java.lang.*;

public class HelloWorld {
    public static void main(String[] args) {
    	while(true) {
        	System.out.println("Hello World.");
		try {
			Thread.sleep(1000);
		}	catch(InterruptedException ex) {
			Thread.currentThread().interrupt();
		}
	}
    }
}
