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
			if (isOffensive == "YES") {
			playerArray.add(new offensivePlayer());
			}
		else {
			playerArray.add(new defensivePlayer());
		}
		}
	}
}
