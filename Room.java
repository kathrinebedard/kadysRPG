/*
    Kathrine Bedard
    CPSC 1060
    Lab Section 03
    April 18th, 2023
*/

import java.util.ArrayList;

public class Room {
    String name;
    String description;
    ArrayList<String> exits;
    String nextMove;
    
    /**
     * Initialize a room
     * @param name the name of the room
     * @param description the description of the room
     */
    public Room(String nextMove){
        this.name = nextMove;
        //this.description = description;
    }

    //Generate getters and setters for the names and descriptions
    public void setName(String nextMove){
        this.name = nextMove;
    }

    public String getName(){
        return name;
    }

    public void setDescription(){
        if (name.equalsIgnoreCase("guest room")) {
            this.description = "Guest Room: A room filled with numerous torture devices. Who said anything about welcome guests?";
        } else if (name.equalsIgnoreCase("library")) {
            this.description = "Library: Better version of the study. It has all of the different books that one may want. Make sure that you stay quiet or the mean librarian will slap you!";
        } else if (name.equalsIgnoreCase("kitchen")) {
            this.description = "Kitchen: This amazing culinary art studio has it all: cheese cellar, wine racks, and a 16 stove burner. With its pizza oven, it makes for the perfect Italian getaway.";
        } else if (name.equalsIgnoreCase("study")) {
            this.description = "Study: Do you love being disturbed while working? This room has it all. It is the central hub to the whole house. It has a giant wall of computers and amazing lighting, but doors that exit out into numerous different rooms.";
        } else if (name.equalsIgnoreCase("holodeck")) {
            this.description = "Holodeck: A room that can disguise itself in a variety of ways. Experience a lush, humid rainforest, a speakeasy of the 1920’s, or the dungeons of Cooper Library.";
        } else if (name.equalsIgnoreCase("trophy room")) {
            this.description = "Trophy Room: Spacious room with oak wood as far as the eye can see, shelves filled to the brim with trophies and obscure collections, it really makes you wonder who they belong to.";
        } else if (name.equalsIgnoreCase("bedroom")) {
            this.description = "Bedroom: A lavished bed adorns the center of this room, with long curtains, beautiful rugs, and gilded furniture acting as little details to truly make this a great bedroom.";
        }
    }
    
    public String getDescription(){
        return description;
    }
    
    /**
     * Adds an exit to the room
     * @param exit room name of the exit to be added to the room
     */

    //String exit

    public void addExit(String name){
        if (name.equalsIgnoreCase("study")) {
            exits = new ArrayList<String>();
            exits.add("Kitchen");
            exits.add("Library");   
            exits.add("Bedroom");      
        } else if (name.equalsIgnoreCase("kitchen")) {
            exits = new ArrayList<String>();
            exits.add("Study");
            exits.add("Guest Room");
        } else if (name.equalsIgnoreCase("Guest room")) {
            exits = new ArrayList<String>();
            exits.add("Kitchen");
        } else if (name.equalsIgnoreCase("bedroom")){
            exits = new ArrayList<String>();
            exits.add("Study");
            exits.add("Trophy Room");
        } else if (name.equalsIgnoreCase("library")){
            exits = new ArrayList<String>();
            exits.add("Holodeck");
            exits.add("Trophy Room");
            exits.add("Study");
        } else if (name.equalsIgnoreCase("holodeck")){
            exits = new ArrayList<String>();
            exits.add("Library");
        } else if (name.equalsIgnoreCase("Trophy Room")){
            exits = new ArrayList<String>();
            exits.add("Bedroom");
            exits.add("Library");
        } 
    }

    /**
     * List all of the rooms as a string
     * @return returns all of the names of the rooms on new lines
     */
    
    String exitChoices; 

    public void listExits(){
        for (String exit : exits){
            System.out.println(exit);
        }
    }

    /**
     * Generates a string representation of the room using the name and description and lists all of the exits.
     */
    String finalString;
    
    public String toString(){
      return finalString; 
    }
}
