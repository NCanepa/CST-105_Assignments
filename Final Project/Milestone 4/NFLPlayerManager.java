//Noah Canepa, this is my own code
import java.util.ArrayList;
public class NFLPlayerManager {
//creates properties for nfl players
	String position;
	String isOffensive = "YES";
	//creates arrays to store players in
	ArrayList<NFLPlayer>playerArray = new ArrayList<>(20);
	//tests for nor arg constructor
	public NFLPlayerManager() {
		super();
		System.out.println("no-args constructor called");
		}
	//tests for constructor with args
	public NFLPlayerManager(String position) {
		super();
		this.position = position;
		}
//creates new player and adds it to array
	public void newPlayer() {
		for (int i = 0; i<=20; i++) {
			if (isOffensive == "YES")
			playerArray.add(new offensivePlayer());
			}
		    else {
			playerArray.add(new defensivePlayer());
		}
	}
	//creates players and gives them stats and adds them to the array
	public void testDriverMethod(){
		NFLPlayerManager player1 = new NFLPlayerManager("Goku Saiyan", 205, 68,"Quarterback", 35, 50, 476, 852, 421, 17);
		NFLPlayerManager player2 = new NFLPlayerManager("Piccolo Namek", 255, 79,"HalfBack", 37, 85, 45, 87, 154, 3);
		NFLPlayerManager player3 = new NFLPlayerManager("Jiren Trooper", 305, 71 ,"Linebacker", 30, 264, 54, 247, 560, 21);
		NFLPlayerManager player4 = new NFLPlayerManager("name1", 43, 4, "position1", 32, 456, 75, 432, 125, 54);
		NFLPlayerManager player5 = new NFLPlayerManager("name2", 234, 32, "position2", 55, 754, 32, 657, 345, 43);
		NFLPlayerManager player6 = new NFLPlayerManager("name3", 354, 23, "position3", 66, 453, 54, 794, 321, 34);
		player1.newPlayer();
		player2.newPlayer();
		player3.newPlayer();
		player4.newPlayer();
		player5.newPlayer();
		player6.newPlayer();
		//diplays the 6 players that were given stats
	    System.out.println(player1.toString());
	    System.out.println(player2.toString());
	    System.out.println(player3.toString());
	    System.out.println(player4.toString());
	    System.out.println(player5.toString());
	    System.out.println(player6.toString());
		}
}
