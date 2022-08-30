package labFinalTask1;
public class Main {

	public static void main(String[] args) {
		
		Player p1=new Player("Shakib", 20, "bpl", 24, 11);
		Player p2=new Player("Tamim", 21, "bpl", 26, 12);
		Player p3=new Player("Rahim", 22, "bpl", 27, 13);
		Player p4=new Player("Niloy", 24, "bpl", 23, 14);
		Player p5=new Player("Emon", 25, "bpl", 29, 15);
		Player callplayer=new Player();
		Player[] player= {p1,p2,p3,p4,p5};
		
		callplayer.seniorPlayer(player);
		double d=callplayer.goal(player);
		System.out.println(d);
		callplayer.age(player);
		callplayer.match(player);
		callplayer.match(player);
	}

}
