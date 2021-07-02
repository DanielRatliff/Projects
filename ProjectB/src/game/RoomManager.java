package game;
import fixtures.Room;

public class RoomManager {
	Room startingRoom;
	Room[] rooms = new Room[10];
//	List<String> directions;
//	List<Room> exits;
	private void init() {
		Room livingRoom = new Room("Living Room","Luxorious Leisure","A spacious living area with furniture that beckons one  to come and lounge for a while. \n"
				+ "The blue and green coloring throughout the room give one feeling of a calmness and refreshment. \n"
				+ "On the east wall next to the stairs is door to a restroom. To the north there is a hallway leading to the kitchen and east to the dining room");
		this.rooms[0] = livingRoom;
		this.startingRoom=livingRoom;
		Room bathroom = new Room("Bathroom","Outstanding Outhouse","The pale green colors make this small restroom with standard furnishings more appealing and not crowded\n"
				+ "from here head north to checkout the garage or east to the living room.");
		this.rooms[1] = bathroom;
		Room diningRoom = new Room("Dining Room", "Excellent Eatery", "You will first notice large picture window with a nice view of the enormous, gorgeous back yard. The dining room has a large family-style\n"
				+ "table with comfortable chairs for lingering after a delicious meal. A door to the north leads to the laundry room and to the west is the living room.");
		this.rooms[2]= diningRoom;
		Room kitchen = new Room("Kitchen","Confined Confectionary","the kitchen has soft white walls, whitish gray granite counter tops, and a robust kitchen island for your meal preparation delight.\n"
				+ "It is equipped with top of the line appliances to ensure your every need and desire in a kitchen is met.\n"
				+ "to the west is the garage and to the east is the laundry room. The living room is to the south");
		this.rooms[3]= kitchen;
		Room laundryRoom = new Room("Laundry Room","Suspensfull Spin-cycle","This is a  medium to large size room with a counter for folding clothes. \n"
				+ "It has a shelf for your laundry and other  cleaning products, and  an area for hanging clothes.\n Even with the appliances large capacity, the remaining space in the room does not feel crowded.\n"
				+ "To the south lies the dining room and to the west is the kitchen");
		this.rooms[4]= laundryRoom;
		Room garage = new Room("Garage","Den of Destruction","The garage to die for ....it is an extremely spacious 2.5 car garage.  THIS is just about every man's dream!\n"
				+ "It has all the tools you will ever need to take apart anything that is not working.  However there is no guarantee that the items will ever\ngo back together,"
				+ "thus there is plenty of room to store any disassembled items.To the east is the kitchen and the south leads to the bathroom");
		this.rooms[5]= garage;
		Room study = new Room("Study","Sleepy Sunroom","The study is an open room concept, With shelves for books and display, and a  large corner window.\n"
				+ "There are two Comfortable and inviting chairs, great for studying,  waiting or taking a well deserved nap. The bright coloring in the room with \nthe window make this a sunny hideaway"
				+ "To the west lies the master bedroom, the south leads to the guest room, and down the stairs lies the living room.");
		this.rooms[6]= study;
		Room masterBedroom = new Room("Master Bedroom","Majestic Mastery","The Large Master Bedroom is  very inviting and easy in the eyes with the blue tones. The room is spacious enough for king size\n"
				+ "bedroom suit with plenty of room to move around comfortably.To the south is the master bedroom and the east leads back to the study.");
		this.rooms[7]= masterBedroom;
		Room masterBathroom = new Room("Master Bathroom","Beautiful Bathroom","The adjoining master bath has a claw foot tub, a standing shower, a toilet,\n"
				+ "a vanity table,  two sinks and a walking closet that is almost a small room with organizers, drawers and space for hanging clothes and\nstorage for shoes."
				+ "there is only one entrance or exit which leads to the master bedroom");
		this.rooms[8]= masterBathroom;
		Room guestBedroom = new Room("Guest Bedroom","Comfy Closet","The Guest Bedroom which has more of a Southwestern colors and motif.\r\n"
				+ "It is a bit smaller than the Master Bedroom, however the queen size bed and matching dressers, do not make the room feel cramped.\n"
				+ "The only exit leads back to the study");
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
	public RoomManager() {
		super();
		this.init();
	}
}
