/**
 * Created by fabricejeannet on 18/11/14.
 */
public class Game {

    public static void main(String [] args) {
        Game game = new Game();
        game.countTo(100);
    }

    private void countTo(int limit) {
        for (int i = 1; i <= limit; i++) {
            System.out.println(getStringToDisplayFor(i));
        }
    }

    public boolean isMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    public boolean isMultipleOfFive(int number) {
        return number % 5 == 0;
    }

    public String getStringToDisplayFor(int number) {

        boolean multipleOfThree = isMultipleOfThree(number);
        boolean multipleOfFive = isMultipleOfFive(number);
        boolean multipleOfBoth = multipleOfThree && multipleOfFive;

        if(multipleOfBoth) {
            return "FizzBuzz";
        }

        if(multipleOfThree) {
            return "Fizz";
        }

        if(multipleOfFive) {
            return "Buzz";
        }
        
        return "" + number;
    }
}
