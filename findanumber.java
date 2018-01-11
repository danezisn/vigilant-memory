import java.util.Scanner;
public class findanumber {
	public static void main (String args []) {

Scanner scanner = new Scanner (System.in);
System.out.println ("Vale MO");
int mo = scanner.nextInt();

while(mo<0 || mo>10) {
	System.out.println ("Lathos...try again");
	mo =scanner.nextInt();
}

if (mo>=8 && mo<=10) {
	System.out.println ("Aristos");
}
	 else if (mo <-7 && mo>=5){
		System.out.println ("Kalos");
	}
		else {System.out.println ("kalos");}

}
}

