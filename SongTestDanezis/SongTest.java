import java.util.Scanner;

public class SongTest {

	public static void main(String[] args) {

		Singer frank = new Singer ("Frank Sinatra");
		Singer wham = new Singer ("Wham!");
		Singer mariah = new Singer ("Mariah Carey");
		Singer chris = new Singer ("Chris Rea");
		Singer sia = new Singer ("Sia");
		

		new Song ("All I Want for Christmas Is You",mariah,"https://www.youtube.com/watch?v=yXQViqx6GMY" );
		new Song ("White Christmas",frank, "https://www.youtube.com/watch?v=q_XzZNCDWCA" );
		new Song ("Last Christmas",wham, "https://www.youtube.com/watch?v=E8gmARGvPlI" );
		new Song ("Driving home for christmas",chris, "https://www.youtube.com/watch?v=EvDxSW8mzvU");
		new Song ("Santa's Coming For Us",sia, "https://www.youtube.com/watch?v=V3EYjVPRClU" );
		new Song ("Let It Snow! Let It Snow! Let It Snow!",frank, "https://www.youtube.com/watch?v=vGRC2LYmHfU" );

		
		Scanner  scanner = new Scanner (System.in);

		System.out.println("****************  Welcome to our DMST Christmas Music Application **************** ");
		while (true){
			System.out.println("Menu:                         ");
			System.out.println("Type 1 to display singers' list                         ");
			System.out.println("Type 2 to display songs' list                           ");
			System.out.println("Type 3 to display Frank's Sinatra available songs       ");

			System.out.print("    Type here: ");
			int choice = scanner.nextInt();

			if(choice==1){	//εκτύπωση της λίστας τραγουδιστών
				System.out.println("\n   ** Display Singers' List **     ");
				for (Singer si:Singer.singer) {
					if(si!=null)
						System.out.println(si.toString());
				}
			}
			else if(choice==3){	//εκτύπωση των τραγουδιών του Frank Sinatra
				int counter=0;
				System.out.println("\n   ** Display Frank's Sinatra Song List **     ");
				for (Song so:Song.songs){

					if(so!=null && so.getSinger().equals(frank)){
						counter++;
					}

				}
				System.out.println("   "+counter +" songs are found: ");
				for (Song so:Song.songs){

					if(so!=null && so.getSinger().equals(frank)){
						System.out.println(so.toString());
					}

				}
			}else if (choice==2) {
				System.out.println("\n   ** Display Songs' List **     ");
				for (Song si:Song.songs) {
					if(si!=null)
						System.out.println(si.toString());
				}
				
				
			}
			else System.out.println("Sorry, wrong input try again");
			System.out.println("*********************************************************************************** ");
			System.out.println();
			System.out.println(); 
		}
	}
}