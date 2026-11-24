import java.util.Scanner;
public class EvenCharacterChecker{
	public static void main(String[] args){
		
	Scanner input = new Scanner(System.in);

	System.out.print("Enter a word: ");
	String word = input.nextLine;
	int counter = 1;
	for (letter of word) {
		if (counter % 2 == 0) {
		System.out.println(letter);
	}
	counter += 1;
	}
