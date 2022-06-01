package Student;
import java.util.Scanner;
public class test {
	
	public static void main(String[] args)

	{
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of questions right");
		int numRight = scanner.nextInt();
		System.out.println("Enter number of total questions");
		int totalQuestions = scanner.nextInt();
		int percentage = numRight/totalQuestions;
		System.out.println(percentage);
}


}
