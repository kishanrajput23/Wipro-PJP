import java.util.*;

public class Q_8 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a color code : ");
        char color = sc.next().charAt(0);

        switch(color) {
			case 'R': System.out.println("R --> RED");
				break;

            case 'B': System.out.println("B --> BLUE");
			    break;

            case 'G': System.out.println("G --> GREEN");
				break;

            case 'O': System.out.println("O --> ORANGE");
				break;

            case 'Y': System.out.println("Y --> YELLOW");
				break;

            case 'W': System.out.println("W --> WHITE");
				break;

		default: System.out.println("Invalid Code");
			break;		
		}
    }
}