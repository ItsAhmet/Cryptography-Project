import java.util.*;
public class Cipher {
	   
	

	    
	public static void CeaserEncode(String x, int y) {

		for(int i = 0; i < x.length(); i++) {
			if(x.charAt(i)==32) {
				System.out.print(" ");
			}
			else {
			int asciiValue = (x.charAt(i)+y);
		        if (asciiValue > 122) {
		        	asciiValue -= 26;
		        }
		        
		        char convertedChar = (char)asciiValue;
		        System.out.print(convertedChar);
			}
		
		}
	}
public static void CeaserDecode(String x, int y) {
	for(int i = 0; i < x.length(); i++) {
		if(x.charAt(i)==32) {
			System.out.print(" ");
		}
		else {
		int asciiValue = (x.charAt(i)-y);
	        if (asciiValue < 97) {
	        	asciiValue += 26;
	        }
	        
	        char convertedChar = (char)asciiValue;
	        System.out.print(convertedChar);
		}
	
	}
}
public static void AtBash(String x) {
	for (int y=0; y<x.length(); y++){
    char ch = x.charAt(y);
    int chark = (int) ch;
    int cha = 219-chark;
    char charr = (char) cha;

    if(ch!=32){
      System.out.print(charr);
      }
    else if(ch==32){
      System.out.println(" ");
    }
  }
}

public static void main(String Args[]) {
	Scanner sc = new Scanner(System.in);
	
	int inp4 = 0;
 
	System.out.println("Enter the string you would like to encrypt/decrypt -->");
	String inp1 = sc.nextLine();
			
	System.out.println("What cipher would you like to use? \nEnter A for AtBash & enter C for Caesar -->");
	String inp2 = sc.nextLine();
	

	if(inp2.equalsIgnoreCase("C")||inp2.equalsIgnoreCase("Caesar")) {
		System.out.println("Enter the shift value -->");
		inp4 = sc.nextInt();


	}
	Scanner sca = new Scanner(System.in);
    System.out.println("Would you like to encrypt or decrypt? \nEnter E for encryption and D for decrypion -->");
	String inp3 = sca.nextLine();
	
	
	
	if(inp2.equalsIgnoreCase("C")&&inp3.equalsIgnoreCase("e")){
    CeaserEncode(inp1, inp4);
  }
  if(inp2.equalsIgnoreCase("C")&&inp3.equalsIgnoreCase("d")){
    CeaserDecode(inp1, inp4);
  }
  if(inp2.equalsIgnoreCase("A")){
    AtBash(inp1);
  }
}
}




