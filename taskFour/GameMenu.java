import java.util.ArrayList;
import java.util.Scanner;
//4.a
public class GameMenu{
	//4.b
	private ArrayList <String> actions = new ArrayList <>();

  //4. c  Konstruktøren
  public GameMenu (ArrayList <String> actions){
  	//4. d
  	this.actions = actions;
  }

  //4. h
  public void displayMenu(){
  for (String i: actions){
  	System.out.println(i);
     }
  }

  //5. a
  public String getAction(){
  	System.out.println("Type a number to choose an action");
  	displayMenu();
  //5. b
  	Scanner scanner = new Scanner(System.in);
  	String choice = scanner.nextLine();
  	return choice;
  }


}