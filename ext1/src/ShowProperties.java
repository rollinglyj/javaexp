import java.util.*;
public class ShowProperties {
	static boolean condition(){
		boolean result = Math.random() < 0.99;
		System.out.print(result + ", ");
		return result;
	}
	public static void main(String[] args){
		//System.getProperties().list(System.out);
		//System.out.println(System.getProperty("user.name"));
		//System.out.println(System.getProperty("java.library.path"));
		while (condition())
			System.out.println("Inside 'While' ");
		System.out.println("Outside 'While'");
	}

}
