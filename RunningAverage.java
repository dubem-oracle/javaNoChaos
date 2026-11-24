import java.util.Scanner;
public class RunningAverage{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);

	int sum = 0;
	int count = 0;

	while (true){
	    number = Number(prompt("Enter a number (-1 to stop): "));
	    if (number === -1){
		  break;
	    }
	    if (number >= 0){
	    sum += number;
	    count++;
	    }
	    
	    
	    average = sum / count;
	    
	    System.out.println("Average: " + average);
	    
    		
	}
	}
}
    

