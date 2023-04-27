/*
    Kathrine Bedard
    CPSC 1060
    RPG Project
    April 27th, 2023
*/


//this verifys that the location command is a valid command
import java.util.Scanner;

public class Command{
    
    Scanner scnr = new Scanner(System.in);

    private boolean validCommand = true;
    private String nextMove;
    private Route route;

    public void Command(){
        this.nextMove = nextMove;
        this.route = route;
        this.validCommand = validCommand;
    }

    public boolean commandCheck(String nextMove) {
        if ((route.getName()).equalsIgnoreCase("DMV")) {
            while (!((nextMove.equalsIgnoreCase("food place")) || (nextMove.equalsIgnoreCase("coffee place")) || ((nextMove.equalsIgnoreCase("home"))))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            }
            validCommand = true;
        } else if ((route.getName()).equalsIgnoreCase("food place")) {
            while (!((nextMove.equalsIgnoreCase("DMV")) || (nextMove.equalsIgnoreCase("store")))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            } 
            validCommand = true;
        } else if ((route.getName()).equalsIgnoreCase("store")) {
            while (!((nextMove.equalsIgnoreCase("food place") || (nextMove.equalsIgnoreCase("home"))))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            }
            validCommand = true;
        } else if ((route.getName()).equalsIgnoreCase("home")) {
            while (!((nextMove.equalsIgnoreCase("DMV")) || (nextMove.equalsIgnoreCase("store")) || (nextMove.equalsIgnoreCase("home")))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            } 
            validCommand = true;
        } else if ((route.getName()).equalsIgnoreCase("school")) {
            while (!((nextMove.equalsIgnoreCase("coffee place")) || (nextMove.equalsIgnoreCase("home")) || (nextMove.equalsIgnoreCase("library")))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            }
            validCommand = true;
        } else if ((route.getName()).equalsIgnoreCase("library")){
            while (!(nextMove.equalsIgnoreCase("school"))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            }
            validCommand = true; 
        } else if (route.getName().equalsIgnoreCase("coffee place")){
            while (!((nextMove.equalsIgnoreCase("school")) || (nextMove.equalsIgnoreCase("DMV")))) {
                System.out.println("Invalid exit.");
                System.out.println("Please choose an exit");
                nextMove = scnr.nextLine();
                validCommand = false;
            } 
            validCommand = true;
        } else {
            validCommand = true;
        }

        return validCommand;
    }


}