import java.util.ArrayList;

//4.e
public class Main{



	public static void main (String [] args){
     //4.f 
    ArrayList <String> actions = new ArrayList <>();
    actions.add("1) Start game");
    actions.add("2) Resume game");
    actions.add("3) Pause game");
    actions.add("4) End game");

    //4. g
    GameMenu gameMenu = new GameMenu (actions);

    //4. i
    //gameMenu.displayMenu();

    //5. d
    String userChoice = gameMenu.getAction();
     
    //5. g  
    int userChoiceAsInt = Integer.parseInt(userChoice);

    
    doAction(userChoiceAsInt);

	}


	//5. e
	public static void doAction (int action){ 
     //5. f
     switch (action){
     case 1:
     	System.out.println("Starting the game now");
     	break;

     case 2:
     	System.out.println("Fetching previously saved game data");
     	break;

     case 3:
     	System.out.println("Game paused");
     	break;

     case 4:
     	System.out.println("Ending game");
     	break;
       }
	}
}