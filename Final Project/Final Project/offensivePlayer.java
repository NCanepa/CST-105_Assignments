//Noah Canepa, this is my work
public class offensivePlayer extends NFLPlayer{
	private int passingYards;
	private int receivingYards;
	private int rushingYards;
	private int touchdowns;
	public offensivePlayer() {
		super();
		System.out.println("Constructor Called");
	}
	//creates offensive player using args from NFLPlayer class as well as this class
	public offensivePlayer(String name, int weight, int height, String position, int age, int passingYards,
			int receivingYards, int rushingYards, int touchdowns) {
		super(name, weight, height, position, age);
		this.passingYards = passingYards;
		this.receivingYards = receivingYards;
		this.rushingYards = rushingYards;
		this.touchdowns = touchdowns;			
	}
	//override toString method in order for it to fit with offensive players
	public String toString() {
		return "Name:" + getName() + " " + "Weight: " + getWeight() + " " + "Height: " + getHeight() + " " + "Position: " +
				getPosition() + " " + "Age: " + getAge() + " " + " Passing Yards: " +
				passingYards + " Receiving Yards: " + receivingYards + " Rushing Yards: " +
				rushingYards + " Touchdowns: " + touchdowns;
	}
	//sets passing yards
		public void setPassingYards(int passingYards) {
			this.passingYards = passingYards;
			}
		
	//gets passing yards
		public int getPassingYards() {
			return this.passingYards;
		}
		
	//sets receiving yards
		public void setReceivingYards(int receivingYards) {
			this.receivingYards = receivingYards;
		}
		
	//gets receiving yards
		public int getReceivingYards() {
			return this.receivingYards;
		}
		
	//sets rushing yards
		public void setRushingYards(int rushingYards) {
			this.rushingYards = rushingYards;
			}
		
	//gets rushing yards
		public int getRushingYards() {
			return this.rushingYards;
		}
		
	//sets touchdowns
		public void setTouchdowns(int touchdowns) {
			this.touchdowns = touchdowns;
			 }
		
	//gets touchdowns
		public int getTouchdowns() {
			return this.touchdowns;
			}
		
}