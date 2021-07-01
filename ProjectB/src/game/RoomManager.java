package game;

import java.util.List;

import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms = new Room[10];
//	List<String> directions;
//	List<Room> exits;
	public void init() {
		Room livingRoom = new Room("Living Room","a place of leasure","This room contains two couches and a chair sat around a small coffee table \n");
		this.rooms[0] = livingRoom;
		this.startingRoom=livingRoom;
		Room bathroom = new Room("Bathroom","a peaceful restroom","smallest bathroom of the house, still contains necessary amenities");
		this.rooms[1] = bathroom;
		Room diningRoom = new Room("Dining Room", "an excellent eatery", "room contains large family-style table and chairs,great company and great food");
		this.rooms[2]= diningRoom;
		Room kitchen = new Room("Kitchen","a confined confectionary","the perfect kitchen always stocked with what you need to create your favorite treats");
		this.rooms[3]= kitchen;
		Room laundryRoom = new Room("Laundry Room","a suspensfull spin cycle","a perfectly sized room fit with the 'fixins' for cleaning your cloths");
		this.rooms[4]= laundryRoom;
		Room garage = new Room("Garage","the den of destruction","spacious garage containg every tool youll ever need to tear apart whatever isnt working to 'fix' it \n"
				+ "*disclaimer* things might not go back together");
		this.rooms[5]= garage;
		Room study = new Room("Study","sleepy sunroom","This room has a large corner window with a pair of comfy chairs, great place for studing,reading or...\n"
				+ "or taking a well earned nap");
		this.rooms[6]= study;
		Room masterBedroom = new Room("Master Bedroom","mystery of magic","contains a bed that is always the perfect size, firmness and temperature for your needs");
		this.rooms[7]= masterBedroom;
		Room masterBathroom = new Room("Master Bathroom","beautiful Bathroom","Largest Bathroom of the house contains a claw-foot tub,Standing shower,two sinks \n"
				+ "and a vanity set for those who might enjoy.");
		this.rooms[8]= masterBathroom;
		Room guestBedroom = new Room("Guest Bedroom","comfy closet","No, its not actually a closet but it is a small room to lend to a friend or family member for"
				+ "a few nights");
		this.rooms[9]= guestBedroom;
		livingRoom.addExits("North", kitchen, "east", diningRoom, "west", bathroom);
		livingRoom.addExit("up", study);
		bathroom.addExits("West", livingRoom, "north",garage);
		diningRoom.addExits("west", livingRoom, "north", laundryRoom);
		kitchen.addExits("east",laundryRoom, "south", livingRoom, "west",garage);
		laundryRoom.addExits("east", kitchen, "south",diningRoom);
		garage.addExits("east", kitchen,"south", bathroom);
		study.addExits("east", masterBedroom,"south",guestBedroom,"down", livingRoom);
		masterBedroom.addExits("south", masterBathroom,"west", study);
		masterBathroom.addExit("north", masterBedroom);
		guestBedroom.addExit("north", study);
	}
}
