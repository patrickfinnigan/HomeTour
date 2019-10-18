//I apologize for the unfinished code, I have only just started using Java and I was not
//experienced enough to get a full grasp of how it works to get this project working.
//I hope I can be able to work with Java more with Revature in the future.

package game;

import java.util.Scanner;
import fixtures.Room;

public class Main {
	
	public static void main(String[] args) {
	    RoomManager roomMgr = new RoomManager();
	    roomMgr.init();

	    Player player = new Player();
	    player.currentRoom = roomMgr.startingRoom;
	}
	
		
	private static void printRoom(Player player) {
		System.out.print(player.currentRoom.name);
		System.out.print(player.currentRoom.longDescription);
		for (Room e : player.currentRoom.exits);
		
	}

	private static String[] collectInput() {
		
		for (int i = 0; i < args.length; i++)
            System.out.println("Argument #" + i + " " + args[i]);

		Scanner in = new Scanner(System.in);

	}
		
	private static void parse(String[] command, Player player) {
		
	}
}
