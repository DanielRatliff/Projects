/**
 * 
 * @author Daniel Ratliff
 *
 */
package fixtures;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class Room extends Fixtures {
	private Map<String,Room> exits = new HashMap<String,Room>();
	//NORTH, SOUTH, EAST, WEST, UP, DOWN
	public Room(String name, String shortDescription,String longDescription) {
		super(name, shortDescription, longDescription);
	}
	public void addExit(String direction,Room exit) {
		exits.put(direction.toUpperCase(), exit);
	}
	public void addExits(String direction1,Room exit1, String direction2,Room exit2) {
		this.addExit(direction2, exit2);
		this.addExit(direction1, exit1);
	}
	public void addExits(String direction1,Room exit1, String direction2,Room exit2, String direction3,Room exit3) {
		this.addExit(direction3, exit3);
		this.addExit(direction2, exit2);
		this.addExit(direction1, exit1);
	}
	public void getExits() {
		for(String key: exits.keySet()) {
			System.out.println(key + ": " + exits.get(key).getShortDescription());
		}
	}
	public Room getExit(String direction) {
		if(exits.containsKey(direction.toUpperCase()))
			return exits.get(direction.toUpperCase());
		return null;	
	}
	
}
