import java.util.Scanner;
public class MovieListII {

    public static void main(String[] args) {
	    // Create a scanner object
        Scanner in = new Scanner(System.in);

        // Declare the necessary variables
        String movie;
        String [] movies = new String [100];
        final String SENTINEL = "q";
        String userInput = "";

        // Initialize the index to the first element in the array
        int index = 0;


        while (!userInput.equals(SENTINEL)){

            // Prompt and read-in movie title
            System.out.println("Enter the name of your favorite movie (press q to quit): ");
            userInput = in.nextLine();
            if (!userInput.equalsIgnoreCase(SENTINEL)) {
                movie = userInput;
                movies[index] = movie;

                // Validate that the title entered is not already in the array
                for (int i = 0; i < index; i++) {
                    while (movies[i].equalsIgnoreCase(movie)) {
                        System.out.println("This movie exists in the list. Enter another movie:");
                        movie = in.nextLine();
                        movies[index] = movie;
                    }
                }

                // Increase the index to the next place in the array
                index++;
            }
            else {
                userInput = SENTINEL;
            }
        }
        // Output the titles in the array to the screen
            for (int i = 0; i < index; i++) {
                    System.out.println(movies[i]);
                }
    }
}
