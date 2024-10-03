import java.util.ArrayList;
public class Main {
	

	public static void main(String [] args){
       ArrayList <Team> teamsList = new ArrayList <> ();


        //1.g
	    Team bravo = new Team ("Bravo");
	    Team alpha = new Team ("Alpha");
	    Team charlie = new Team ("Charlie");
	    Team echo = new Team ("Echo");
           Team foxtrot = new Team ("Foxtrot");
	    Team golf = new Team ("Golf");

	    teamsList.add(bravo);
	    teamsList.add(alpha);
	    teamsList.add(charlie);
	    teamsList.add(echo);
	    teamsList.add(foxtrot);
	    teamsList.add(golf);



        //1.i
       bravo.setRank(2);
       alpha.setRank(5);
	//bravo.toString();
	//System.out.println(bravo);

        //1.k
        bravo.addPlayer("Jens");
        bravo.addPlayer("Dennis");
        golf.addPlayer("David");

       System.out.println(teamsList);
       
      
  

    }
}