package building;

/**
 *
 * @author BRIDGET GITHINJI
 */
//import java.util.Arrays;

public class Building {

String buildingName;
int buildingFloors;
int floorRooms;
String buildingColour;

public Building(String name, int floors, int roomsPerFloor, String colour){
buildingName = name;
buildingFloors = floors;
floorRooms = roomsPerFloor;
buildingColour = colour;
}

public String getBuildingName(){
return buildingName;
}

public int getBuildingFloors(){
return buildingFloors;
}

public int getBuildingRooms(){
return floorRooms;
}

public String getBuildingColour(){
return buildingColour;
}



    public static void main(String[] args) {
        Building Hospital = new Building("Matter", 2, 6, "green");
        Building School = new Building("Elite", 1, 5, "blue");
        Building Mall = new Building("West", 4, 8, "red");
        Building Apartment = new Building("Redding", 7, 7, "brown");
        Building WaterHq = new Building("Shirtliff", 1, 3, "white");
        
        Building[] townBuildings = new Building[5];
        townBuildings[0] = Hospital;
        townBuildings[1] = School;
        townBuildings[2] = Mall;
        townBuildings[3] = Apartment;
        townBuildings[4] = WaterHq;
        
        for(int i=0; i < townBuildings.length; i++){
           System.out.println(townBuildings[i].getBuildingName()+" is "+
                   townBuildings[i].getBuildingColour()+" and has "+
                   townBuildings[i].getBuildingRooms()+" rooms.");
        }
        
    }
    
}
