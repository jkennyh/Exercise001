import java.util.Scanner;

public class Exercise001 {
	
	public static void main(String[] args) {
		System.out.print("Put your name: ");
		
		String name = getName();
		String frame = calculateFrame(name);
		
		showNameWithFrame(name, frame);
	}
	
	private static String getName() {
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		scan.close();
		return name;
	}
	
	private static String calculateFrame(String name) {
		int nameSize = name.length();
		String frame = "+";
		
		for(int i = 0; i < nameSize + 2; ++i)
			frame += "-";
		frame += "+";
		
		return frame;
	}

	private static void showNameWithFrame(String name, String frame) {
		System.out.println(frame);
		System.out.println("| " + name + " |");
		System.out.println(frame);
	}

}
