import java.util.Scanner;
//2.a
public class Main {
	
	//2.b
	public static void main (String [] args){
		System.out.println("Hello, what is your name?");

		//2.c
		Scanner scanner = new Scanner (System.in);

		//2.d  Bruger indtaster navn
		String input = scanner.nextLine();

		//2.e  Hilsen og spørger om alder
		System.out.println("Hej " + input + "\n" + "Please type your age");
 

        //2.f Får input og printer deres alder
        int age = scanner.nextInt();
        System.out.println("You are " + age + "years old");

        
        //2.h Beregner hvor mange år der er til pension
        int yearsToRetirement = 67 - age;

        if (yearsToRetirement < 10){
        System.out.println("You have: " + yearsToRetirement + " years left until retirement :) ");
        }else 
        System.out.println("You have: " + yearsToRetirement + " years left until retirement :( ");

	}
}