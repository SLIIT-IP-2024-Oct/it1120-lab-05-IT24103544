import java.util.Scanner;
public class IT24103544Lab5Q1.java{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int first,second,third,smallest,largest;
		System.out.print("Number 1 : ");
		first = scanner.nextInt();
		System.out.print("Number 2 : ");
		second = scanner.nextInt();
		System.out.print("Number 3 : ");
		third = scanner.nextInt();
	
		smallest = firstNumber;
		largest = secondNumber;
		
		if(second < smallest)
			smallest = second;
		else if(third < smallest)
			smallest = third;

		if(second > largest)
			largest = second;
		else if(third > largest)
			largest = third;
		
		System.out.println(first + " " + second + " " + third);
		System.out.println("Smallest : " + smallest );
		System.out.println("Largest : " + largest);
		
	}
} 