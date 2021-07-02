package game;
import java.util.Scanner;

public class Main {
	static Scanner in = new Scanner(System.in);
	static String[] input;
	public static void main(String[] args) {
		RoomManager rm = new RoomManager();
		rm.init();
		Player player = new Player(rm.startingRoom);
		System.out.println("Welcome to the Home Tour Experience\n\nAs you start your journey, you stand in front of a modern house with a blue and white exterior. Would you like to "
				+ "enter the house?");
		input = in.nextLine().split(" ");
		while(!input[0].equals("QUIT")) {
			printRoom(player);
			System.out.println();
			System.out.println("Enter your command:");
			parse(collectInput(),player);
		}
		System.out.println("Thank You! Please Come Again!");
		
	}
		
	private static void printRoom(Player player) {
		System.out.println();
		System.out.println(player.getCurrentRoom().getName());
		System.out.println();
		System.out.println(player.getCurrentRoom().getLongDescription());
		System.out.println();
		player.getCurrentRoom().getExits();
	}

	private static String[] collectInput() {
		String userIn= in.nextLine();
		String[] input = userIn.split(" ");
		return input;
	}
		
	private static void parse(String[] command, Player player) {
		switch (command[0].toUpperCase()) {
		case "GO":
			if (player.getCurrentRoom().getExit(command[1]) == null) {
				System.out.println("Im Sorry, The Room you are currently in does not have an exit in that direction. Please try typing your command again or type HELP for a list of commands"
						+ " and instructions.");
				System.out.println();
				parse(collectInput(), player);
				break;
			}
			player.setCurrentRoom(player.getCurrentRoom().getExit(command[1]));
			break;
		case "HELP":
			System.out.println(
					"To navigate the house please enter a command (GO [direction of exit]) directions valid directions are [NORTH,EAST,SOUTH,WEST,UP,DOWN]\n"
							+ "to quit the program you may enter [STOP,QUIT,EXIT] no additional command needed");
			parse(collectInput(), player);
			break;
		case "QUIT":
			;
		case "EXIT":
			;
		case "STOP":
			input[0] = "QUIT";
			break;
		default:
			System.out.println(
					"Im Sorry, I didnt quite get your command, please try again or type HELP for a list of commands and instructions.");
			parse(collectInput(), player);
			break;
		}
	}
}
