import java.util.Scanner;
public class Student101Runner
{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter in your name :: "); 
		String name = scan.nextLine();
		System.out.print(name + ", enter in your grade level :: "); 
		int gradeLevel = scan.nextInt();
		scan.nextLine();
		System.out.print(name + ", enter in your GPA :: "); 
		double gPA = scan.nextDouble();
		scan.nextLine();
		
		System.out.print("\nEnter in a second name :: "); 
		String name2 = scan.nextLine();
		System.out.print(name2 + ", enter in your grade level :: "); 
		int gradeLevel2 = scan.nextInt();
		scan.nextLine();
		System.out.print(name2 + ", enter in your GPA :: "); 
		double gPA2 = scan.nextDouble();
		scan.nextLine();
		
		scan.close();
		Student101 student1 = new Student101(name, gradeLevel, gPA);
		Student101 student2 = new Student101(name2, gradeLevel2, gPA2);
		System.out.println(student1);
		System.out.println(student2);
		
		
		if(student1.equals(student2)) {
			System.out.println("\nThe students are equal");
		}
		else {
			System.out.println("\nThe students are not equal");
		}
	}
}
