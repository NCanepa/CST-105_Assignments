//Noah Canepa, this code is my own
public class NFLPlayer {

private String name;
private int weight;
private int height;
private String position;
private int age;
private int tackles;
private int passingYards;
private int receivingYards;
private int rushingYards;
private int touchdowns;

public void NewPlayerTest() {}

		public NFLPlayer(String newName, int newWeight, int newHeight, String newPosition, int newAge,
				int newTackles, int newPassingYards, int newRecievingYards, 
				int newRushingYards, int newTouchdowns) {
			
//the follwoing gets stats for every property		
name = newName;
weight = newWeight;
height = newHeight;
position = newPosition;
age = newAge;
tackles = newTackles;
passingYards = newPassingYards;
receivingYards = newRecievingYards;
rushingYards = newRushingYards;
touchdowns = newTouchdowns;
	}
		
//sets name
	public void setName(String newName) {
	    this.name = newName;
	    }
	
//gets name
	public String getName() {
	     return this.name;
	}
	
//sets weight
	  public void setWeight(int newWeight) {
	    this.weight = newWeight;
	 }
	  
//gets weight
	public int getWeight() {
	    return this.weight;
	}
	
//sets height
	 public void setHeight(int newHeight) {
		 this.height = newHeight;
		 }
	 
//gets height
	public int getHeight() {
		return this.height;
		}   
	
//sets position
	public void setPosition(String newPosition) {
	    this.position = newPosition;
	    }
	
//gets position
	public String getPosition() {
	    return this.position;
	} 
	
//sets age
	public void setAge(int newAge) {
	    this.age = newAge;
	 }
	
//gets age
	public int getAge() {
	    return this.age;
	}
	
//sets tackles
	public void setTackles(int newTackles) {
		this.tackles = newTackles;
	}
	
//gets tackles
	public int getTackles() {
		return this.tackles;
	}
	
//sets passing yards
	public void setPassingYards(int newPassingYards) {
		this.passingYards = newPassingYards;
		}
	
//gets passing yards
	public int getPassingYards() {
		return this.passingYards;
	}
	
//sets receiving yards
	public void setReceivingYards(int newReceivingYards) {
		this.receivingYards = newReceivingYards;
	}
	
//gets receiving yards
	public int getReceivingYards() {
		return this.receivingYards;
	}
	
//sets rushing yards
	public void setRushingYards(int newRushingYards) {
		this.rushingYards = newRushingYards;
		}
	
//gets rushing yards
	public int getRushingYards() {
		return this.rushingYards;
	}
	
//sets touchdowns
	public void setTouchdowns(int newTouchdowns) {
		this.touchdowns = newTouchdowns;
		 }
	
//gets touchdowns
	public int getTouchdowns() {
		return this.touchdowns;
		}
//Displays players and stats
public void NFLDriver() {
	System.out.print("Name: " +getName() + " Weight: " + getWeight() + " Height in inches: " + getHeight() +
			" Position played: " + getPosition() + " Age: " + getAge() + " Total Tackles: "
			+ getTackles() + " Total Passing Yards: " + getPassingYards() + " Total RecievingYards: " +
			 getReceivingYards() + " Total Rushing Yards: " + getRushingYards() +
			 " Total Touchdowns: " + getTouchdowns());
}
    }
   

