import java.io.IOException;
import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		
		System.out.println("Hello ASE2017 - How are you? :)");
		
		System.out.print("Please enter your name: ");
		
		Scanner sc = new Scanner(System.in);
		
		
		HelloUser newUser = new HelloUser(sc.next());
		
		newUser.greetUser();
		
		
	}

}
