
public class Lesson2AssignmentTip {

	public static void main(String[] args) {
		System.out.println("    Bill Amount ($)\t15% Tip\t\t18% Tip\t\t20% Tip");
		System.out.println("    -----------  \t_______\t\t_______\t\t___________");
		
		for(int i=50; i<105; i+=5) {
			System.out.printf("\t%d\t\t%f\t%f\t%f\n", i, i*.15, i*.18, i*.2);
		}
				
	}
}
