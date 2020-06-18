import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Convention {
	public static int[] happinessArr;
	public static int[] weightArr;
	public static int maxHappiness;
	public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(new File("convention.dat"));
		int numTimes = scan.nextInt();
		for(int i = 0; i < numTimes; i++) {
			int numItems = scan.nextInt();
			int maxWeight = scan.nextInt();
			happinessArr = new int[numItems];
			weightArr = new int[numItems];
			maxHappiness = 0;
			for(int k = 0; k < numItems; k++) {
				happinessArr[k] = scan.nextInt();
			}
			for(int k = 0; k < numItems; k++) {
				weightArr[k] = scan.nextInt();
			}
			for(int k = 0; k < numItems; k++) {
				knapsack(maxWeight, k, 0, 0);
			}
			System.out.println(maxHappiness);
		}
	} 
	public static int knapsack(int maxWeight, int index, int currentWeight, int currentHappiness) {
		currentWeight += weightArr[index];
		if(currentWeight > maxWeight) {
			return currentHappiness;
		}
		else {
			 currentHappiness += happinessArr[index];
			 index++;
			 for(int i = index; i < weightArr.length; i++) {
				 int iterationHappiness = knapsack(maxWeight, i, currentWeight, currentHappiness);
				 if(iterationHappiness > maxHappiness) {
					 maxHappiness = iterationHappiness;
				 }
			 }
		}
		return currentHappiness;
	}
}
