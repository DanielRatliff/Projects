package game;

import fixtures.Room;
//Class used to keep track of the current room for game purposes
public class Player {
	Room currentRoom;
	

	public Player(Room currentRoom) {
		super();
		this.currentRoom = currentRoom;
	}

	public Room getCurrentRoom() {
		return currentRoom;
	}

	public void setCurrentRoom(Room currentRoom) {
		this.currentRoom = currentRoom;
	}
	
}
