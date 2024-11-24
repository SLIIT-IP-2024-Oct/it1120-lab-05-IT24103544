import java.util.Scanner; 
public class IT24103544Lab5Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 
        System.out.print("Enter number of members: ");
        
        int noOfMembers = input.nextInt(); 
        if (noOfMembers < 0) {
            System.out.println("Input must be 0 or greater.");
            return;
        }

        String prize;
        
        switch (noOfMembers) {
            case 0:
                prize = "No prize";
                break;
            case 1:
                prize = "Pen";
                break;
            case 2:
                prize = "Umbrella";
                break;
            case 3:
                prize = "Bag";
                break;
            case 4:
                prize = "Travelling chair";
                break;
            default:
                prize = "Headphone";
                break;
        }

        
        System.out.println("Prize: " + prize);
    }
}