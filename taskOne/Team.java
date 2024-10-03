import java.util.ArrayList;
public class Team {
	//Instance-variables
	private String teamName;
	private int teamRank;
	private ArrayList <String> playersList = new ArrayList<>();
    private String playerName;

//Constructor
	public Team (String teamName){
        this.teamName = teamName;
	}

     //1.h
	public void setRank (int teamRank){
		this.teamRank = teamRank;
	}


	//1.j
	public String toString(){

		return "Hold: " + teamName + " | Rang: " + teamRank + " | spillere: " + playersList + "\n"; 
	}

	//1.l
	public void addPlayer(String playerName){
		this.playerName = playerName;
		playersList.add(playerName);
		
	}

}