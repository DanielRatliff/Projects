import java.util.Scanner;
public class ProjectA {
	public static void main(String[] args) {
		String menu = "1.Miles(mi) to Kilometers(km)\n2.Pounds(lbs) to Kilograms(kg)\n3.Gallons(gal) to Liters(L)\n4.Quit";
		Scanner in = new Scanner(System.in);
		String[] menuSelection = input(in,menu);
		while(Integer.parseInt(menuSelection[0]) !=4) {
			switch(Integer.parseInt(menuSelection[0])) {
			case 1:
				MilesToKilometers(menuSelection[1],Double.parseDouble(menuSelection[2]));
				break;
			case 2:
				PoundsToKilograms(menuSelection[1],Double.parseDouble(menuSelection[2]));
				break;
			case 3:
				GallonsToLiters(menuSelection[1],Double.parseDouble(menuSelection[2]));
				break;
			default:
				System.out.println("Im sorry the value you entered was not understood please try again");;
			}
			menuSelection = input(in,menu);
		}
		System.out.println("Thank you! Please come again!");
	}
	public static String[] input(Scanner in, String menu) {
		System.out.println(menu);
		System.out.println("Which conversion would you like to use today? please enter a number, unit, amount ex.(2,lbs,#). To Quit enter(4,4,4)");
		String userIn = in.nextLine();
		String[] inArr = userIn.split(",");
		while(inArr.length != 3 ) {
			System.out.println("Sorry, your input was not in the correct format. Please try again ");
			userIn = in.nextLine();
			inArr = userIn.split(",");
		}
		return inArr;
	}
	public static void MilesToKilometers(String unit,Double amount) {
		Double convert;
		if(unit.toLowerCase().equals("mi")) {
			convert = amount * 1.609;
			System.out.println(amount + "mi = " + convert + "km");
		}else {
			convert = amount /1.609;
			System.out.println(amount + "km = " + convert + "mi");
		}
	}
	public static void PoundsToKilograms(String unit,Double amount) {
		Double convert;
		if(unit.toLowerCase().equals("lbs")){
			convert= amount / 2.205;
			System.out.println(amount + "lbs = " + convert + "kg");
		}else {
			convert = amount * 2.205;
			System.out.println(amount + "kg = " + convert + "lbs");
		}
	}
	public static void GallonsToLiters(String unit,Double amount) {
		Double convert;
		if(unit.toLowerCase().equals("gal")){
			convert = amount * 3.785;
			System.out.println(amount+ "gal = " + convert + "l");
		}else {
			convert = amount / 3.785;
			System.out.println(amount + "l = " + convert +"gal");
		}
	}

}
