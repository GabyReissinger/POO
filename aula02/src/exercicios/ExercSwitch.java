package exercicios;

public class ExercSwitch {

	public static void main(String[] args) {
		String day = "Tuesday";
		switch (day) {
		case "Monday":
			System.out.println("Week day");
			break;
		case "Tuesday":
			System.out.println("Week day");
			break;
		case "Wendesday":
			System.out.println("Week day");
			break;
		case "Thursday":
			System.out.println("Week day");
			break;
		case "Friday":
			System.out.println("Week day");
			break;
		case "Saturday":
			System.out.println("Weekend");
			break;
		case "Sunday":
			System.out.println("Weekend");
			break;

		default:
			System.out.println("Unknown");
		}

	}

}
