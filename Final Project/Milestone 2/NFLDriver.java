
public class NFLDriver {

/*NFLplayer order is (Name, Wieght, Height, Position, Age,
 *  Tackles, PassingYards, Rushing Yards, Receiving Yards, Touchdowns
 */
    public static void main(String[] args) {
        NFLPlayer NFLPlayer1;
        NFLPlayer1 = new NFLPlayer("Goku Saiyan", 205, 68,"Quarterback", 35, 50, 476, 852, 421, 17);
        NFLPlayer1.NFLDriver();
       
    }
    static {
        NFLPlayer NFLPlayer2;
        NFLPlayer2 = new NFLPlayer("Piccolo Namek", 255, 79,"HalfBack", 37, 85, 45, 87, 154, 3);
        NFLPlayer2.NFLDriver();
        System.out.println();
    }
    static {
        NFLPlayer NFLPlayer3;
        NFLPlayer3 = new NFLPlayer("Jiren Trooper", 305, 71 ,"Linebacker", 30, 264, 54, 247, 560, 21);
        NFLPlayer3.NFLDriver();
        System.out.println();
    }
}