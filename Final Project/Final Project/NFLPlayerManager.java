//Noah Canepa, this is my own code
import java.util.ArrayList;
public class NFLPlayerManager {
//creates properties for nfl players
	String position;
	boolean isOffensive = true;
	//creates arrays to store players in
	ArrayList<NFLPlayer>playerArray = new ArrayList<>(20);
	//tests for nor arg constructor
	public NFLPlayerManager() {
		super();
		System.out.println("no-args constructor called");
		this.newPlayer();
		}
	//tests for constructor with args
	public NFLPlayerManager(String position) {
		super();
		this.position = position;
		this.newPlayer();
		}
//creates new player and adds it to array
	public void newPlayer() {
		playerArray.add(new offensivePlayer("Bardock Saiyan", 203, 69,"Wide Reciever", 28, 48, 354, 148, 32));
		playerArray.add(new offensivePlayer("Nappa Saiyan", 312, 74, "Center", 31, 46, 53, 254, 7));
		playerArray.add(new offensivePlayer("Piccolo Namek", 225, 73, "Tight End", 29, 104, 333, 104, 21));
		playerArray.add(new defensivePlayer("Frieza Cold", 195, 61, "Corner Back", 26, 154));
		playerArray.add(new defensivePlayer("Jiren Trooper", 276, 72, "Middle Linebacker", 28, 304));
	}
}
