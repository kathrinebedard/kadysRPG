/*
    Kathrine Bedard
    CPSC 1060
    RPG Project
    April 27th, 2023
*/

import java.util.ArrayList;

public class Route {
    String description;
    ArrayList<String> locations;
    String nextMove;
    
    public Route(String nextMove){
        this.nextMove = nextMove;
    }

    //Generate getters and setters for the names and descriptions
    public void setName(String nextMove){
        this.nextMove = nextMove;
    }

    public String getName(){
        return nextMove;
    }

    public void setDescription(){
        if (nextMove.equalsIgnoreCase("food place")) {
            this.description = "Food Place: once you get your liscence you can pick up a side job with UberEats";
        } else if (nextMove.equalsIgnoreCase("library")) {
            this.description = "Library: Could be helpful to drive yourself here to study more";
        } else if (nextMove.equalsIgnoreCase("school")) {
            this.description = "School: Flex on all your school friends that you can now drive";
        } else if (nextMove.equalsIgnoreCase("home")) {
            this.description = "Home: Be careful parking your car in the driveway.";
        } else if (nextMove.equalsIgnoreCase("Coffee place")) {
            this.description = "Coffee Place: it is most ideal to stop at Dunkin before school for a bev.";
        } else if (nextMove.equalsIgnoreCase("store")) {
            this.description = "Store: once you can drive, it is inevitable that your mom will make you do errands";
        } else if (nextMove.equalsIgnoreCase("DMV")) {
            this.description = "DMV: our starting and ending location. Will you pass your driving test?";
        }
    }
    
    public String getDescription(){
        return description;
    }

    public void addLocation(String nextMove){
        if (nextMove.equalsIgnoreCase("food place")) {
            locations = new ArrayList<String>();
            locations.add("DMV");
            locations.add("Store");      
        } else if (nextMove.equalsIgnoreCase("store")) {
            locations = new ArrayList<String>();
            locations.add("Food Place");
            locations.add("Home");
        } else if (nextMove.equalsIgnoreCase("Home")) {
            locations = new ArrayList<String>();
            locations.add("Store");
            locations.add("DMV");
            locations.add("School");
        } else if (nextMove.equalsIgnoreCase("school")){
            locations = new ArrayList<String>();
            locations.add("Home");
            locations.add("Coffee Place");
            locations.add("Library");
        } else if (nextMove.equalsIgnoreCase("library")){
            locations = new ArrayList<String>();
            locations.add("School");
        } else if (nextMove.equalsIgnoreCase("coffee place")){
            locations = new ArrayList<String>();
            locations.add("School");
            locations.add("DMV");
        } else if (nextMove.equalsIgnoreCase("DMV")){
            locations = new ArrayList<String>();
            locations.add("Home");
            locations.add("Food Place");
            locations.add("Coffee Place");
        } 
    }
    
    String locationChoices; 

    public void listLocations(){
        for (int i = 0; i < locations.size(); i++){
            System.out.println(locations.get(i));
        }
    }

    /**
     * Generates a string representation of the route using the name and description and lists all of the exits.
     */
    String finalString;
    
    public String toString(){
      return finalString; 
    }
}
