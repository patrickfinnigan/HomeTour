package game;

import fixtures.Room;

public class RoomManager {

	Room startingRoom;
	private Room[] rooms;

	public void init() {
	    Room foyer = new Room(
			"The Foyer",
			"a small foyer",
			"The small entryway of a neo-colonial house. A dining room is open to the south, where a large table can be seen." + 
			"\n" + "The hardwood floor leads west into doorway." + 
			"\n" + "To the north is a small room, where you can see a piano.");
	    	this.startingRoom = foyer;
			this.rooms[0] = foyer;

		Room diningRoom = new Room(
			"The Dining Room",
			"a dining room with a large table",
			"This is where the description of a dining room will go.");
			this.rooms[1] = diningRoom; 
			
			
	        foyer.exits[1] = diningRoom;
	        diningRoom.exits[0] = foyer;
	        
	}
}
