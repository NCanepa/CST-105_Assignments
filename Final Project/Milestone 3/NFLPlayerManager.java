

	//Noah Canepa, this is my own code
	import java.util.ArrayList;
	public class NFLPlayerManager {

		String name;
		int weight;
		int height;
		String position;
		int age;
		int tackles;
		int passingYards;
		int receivingYards;
		int rushingYards;
		int touchdowns;
		ArrayList<NFLPlayer>playerArray = new ArrayList<>(20);
			
		public NFLPlayerManager() {
			super();
			System.out.println("no-args constructor called");
			}
		public NFLPlayerManager(String name, int weight, int height, String position, int age,
				int tackles, int passingYards, int receivingYards, 
				int rushingYards, int touchdowns) {
			super();
			this.name = name;
			this.weight = weight;
			this.height = height;
			this.position = position;
			this.age = age;
			this.tackles = tackles;
			this.passingYards = passingYards;
			this.receivingYards = receivingYards;
			this.rushingYards = rushingYards;
			this.touchdowns = touchdowns;
			}

		public void newPlayer() {
			for (int i = 0; i<=20; i++) {
				playerArray.add(new NFLPlayer());
				}
			}
			
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
		    System.out.println(player1.toString() + " " + player2.toString() + " " + player3.toString() + " " + player4.toString() + " " + player5.toString() + " " + player6.toString());
			}

}
