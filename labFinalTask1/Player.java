package labFinalTask1;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Player extends Football implements AverageAge,AverageGoal {
	private int totalMatch;
	
	public Player() {
		super(null, 0, null, 0);
	}
	public Player(String name, int age, String tournamentName, int totalGoal,int totalMatch) {
		super(name, age, tournamentName, totalGoal);
		// TODO Auto-generated constructor stub
		this.totalMatch=totalMatch;
	}

	@Override
	public double goal(Player[] info) {
		// TODO Auto-generated method stub
		int sum=0;
		double average=0;
		for(int count=0;count<info.length;count++) {
			sum+=info[count].totalGoal;
			
		}
		average=(double)sum/(double)info.length;
		return average;
	}

	@Override
	public void age(Player[] info) {
		// TODO Auto-generated method stub
		
		int sum=0;
		double average=0;
		for(int count=0;count<info.length;count++) {
			sum+=info[count].age;
			
		}
		average=(double)sum/(double)info.length;
		System.out.println(average);
	}

	@Override
	public void seniorPlayer(Player[] info) {
		// TODO Auto-generated method stub
		File fr=new File("senior.txt");
		FileWriter fs ;
		
		for(int count=0;count<info.length;count++) {
			int max=info[0].age;
			int track=0;
			
			
			if(max<info[count].age) {
				max=info[count].age;
				track=count;
				try {
					fs=new FileWriter("senior.txt");
					fs.write(info[track].name+" "+info[track].age+" "+info[track].tournamentName+" "+info[track].totalGoal+" "+info[track].totalMatch);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			}
		}
		
	}

	@Override
	public Player match(Player[] info) {
		// TODO Auto-generated method stub
		File fr=new File("low.txt");
		FileWriter fs ;
		int min=info[0].totalMatch;
		int track=0;
		for(int count=0;count<info.length;count++) {
			
			if(min>info[count].totalMatch) {
				min=info[count].totalMatch;
				track=count;
			}
			
			
			
		
		}
		
		try {
			fs=new FileWriter("low.txt");
			fs.write(info[track].name+" "+info[track].age+" "+info[track].tournamentName+" "+info[track].totalGoal+" "+info[track].totalMatch);
			Player temp=new Player();
			temp.name=info[track].name;
			temp.age=info[track].age;
			temp.tournamentName=info[track].tournamentName;
			temp.totalGoal=info[track].totalGoal;
			temp.totalMatch=info[track].totalMatch;
			return temp;
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return null;
	}
	
	
	

}
