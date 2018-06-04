import java.util.Scanner;
public class MovieListII {

    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
	String [] movies = new String [100];
	final String SENTINEL = "q";
	String userInput = "";
	int index = 0;

	while (!userInput.equals(SENTINEL)){
        System.out.println("Enter the name of your favorite movie (press q to quit): ");
        userInput = in.nextLine();
        if (!userInput.toLowerCase().equals(SENTINEL)) {
            movies[index] = userInput;
            index++;
        }
        else {
            userInput = SENTINEL;
        }
    }
    for (int i = 0; i < index; i++) {
            System.out.println(movies[i]);
        }
    }
}
