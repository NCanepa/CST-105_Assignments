//Noah Canepa, this is my work
public class defensivePlayer extends NFLPlayer{
	private int tackles;
	//creates defensive players with args from NFLPlayer class as well as this one
	public defensivePlayer(String name, int weight, int height, String position, int age, int tackles) {
		super(name, weight, height, position, age);
		this.tackles = tackles;
	}
	public defensivePlayer() {
		super();
	}

	//overrides toString method to fit defensive players
	public String toString() {
		return "Name:" + getName() + " " + "Weight: " + getWeight() + " " + "Height: " + getHeight() + " " + "Position: " +
				getPosition() + " " + "Age: " + getAge() + " " + " Tackles: " + tackles;
	}
	public void setTackles(int tackles) {
		this.tackles = tackles;
		}
		
//gets tackles
	public int getTackles() {
		return this.tackles;
	}
}