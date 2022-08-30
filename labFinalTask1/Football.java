package labFinalTask1;
public abstract class Football {

	protected String name;
	protected int age;
	protected String tournamentName;
	protected int totalGoal;
	
	public Football(String name, int age, String tournamentName, int totalGoal) {
		super();
		this.name = name;
		this.age = age;
		this.tournamentName = tournamentName;
		this.totalGoal = totalGoal;
	}
	
	public abstract void seniorPlayer(Player[]info);
	public abstract Player match(Player[]info);
	
}
