public class testClass{ 
	public static void main (String args[]) {		
		offensivePlayer OffNFLobject1 = new offensivePlayer();
		OffNFLobject1.setName("Bardock");
		System.out.println(OffNFLobject1.getName());
		
		defensivePlayer DefNFLobject1 = new defensivePlayer();
		DefNFLobject1.setName("Broly");
		System.out.println(DefNFLobject1.getName());
		
		NFLPlayer OffNFLobject2 = new offensivePlayer();
		OffNFLobject2.setName("Nappa");
		System.out.println(OffNFLobject2.getName());
		
		NFLPlayer DefNFLobject2 = new defensivePlayer();
		DefNFLobject2.setName("Vegeta");
		System.out.println(DefNFLobject2.getName());
	}
}