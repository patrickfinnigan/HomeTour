package fixtures;

import game.RoomManager;

public class Room extends Fixture{
	public Room(String name, String shortDescription, String longDescription) {
		super(name, shortDescription, longDescription);
		this.exits = new Room[4];
	}
	
	public Room[] exits;
		
	public Room[] getExits() {
		return exits;
	}
		
	public Room getExit(String direction) {
		 switch (direction) { 
	        case "north": 
	            return this.exits[0]; 
	            break; 
	        case "south": 
	        	return this.exits[1]; 
	            break; 
	        case "east": 
	        	return this.exits[2]; 
	            break; 
	        case "west": 
	        	return this.exits[3]; 
	            break; 

		 } 
	}
}
