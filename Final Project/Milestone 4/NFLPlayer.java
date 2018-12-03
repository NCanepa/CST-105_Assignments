//Noah Canepa, this code is my own
import java.util.ArrayList;

public abstract class NFLPlayer {
	//sets args available to all NFLPlayers
	private String name;
	private int weight;
	private int height;
	private String position;
	private int age;
	//calls NFLPlayer with args
	public NFLPlayer(String name, int weight, int height, String position, int age) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.position = position;
		this.age = age;
	}
	//calls NFLplayer without args
	public NFLPlayer() {
		super();
		System.out.println("no args constructor called");
	}		
//sets name
	public void setName(String name) {
	    this.name = name;
	    }
	
//gets name
	public String getName() {
	     return this.name;
	}
	
//sets weight
	  public void setWeight(int weight) {
	    this.weight = weight;
	 }
	  
//gets weight
	public int getWeight() {
	    return this.weight;
	}
	
//sets height
	 public void setHeight(int height) {
		 this.height = height;
		 }
	 
//gets height
	public int getHeight() {
		return this.height;
		}   
	
//sets position
	public void setPosition(String position) {
	    this.position = position;
	    }
	
//gets position
	public String getPosition() {
	    return this.position;
	} 
	
//sets age
	public void setAge(int age) {
	    this.age = age;
	 }
	
//gets age
	public int getAge() {
	    return this.age;
	}
//Displays players and stats

	public void NFLDriver() {
		System.out.print("Name: " +getName() + " Weight: " + getWeight() + " Height in inches: " + getHeight() +
				" Position played: " + getPosition() + " Age: " + getAge());
}
}
   

