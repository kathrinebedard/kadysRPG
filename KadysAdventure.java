/*
    Kathrine Bedard
    CPSC 1060
    RPG Project
    April 27th, 2023
*/

import java.util.HashMap;

//this class adds locations to the hashmap
public class KadysAdventure {

    HashMap<String, Route> map;

    //empty constructor
    public void KadysAdventure(){
        map = new HashMap<>();
    }

    //adds the various locations to the hashmap
    public void addLocation(Route route){
        map.put("DMV", route);
        map.put("Food Place", route);
        map.put("Coffee Place", route);
        map.put("Library", route);
        map.put("School", route);
        map.put("Store", route);
        map.put("Home", route);
    }

    //gets the route name from the map
    public Route getRoute(String routeName) {
       return map.get(routeName);
    }
}
