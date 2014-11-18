/**
 * Created by fabricejeannet on 18/11/14.
 */
public class Game {

    public static void main(String [] args) {
        Game game = new Game();
        game.countFromOnetTo(100);
    }

    private void countFromOnetTo(int limit) {
        for (int i = 1; i <= limit; i++) {
            currentNumber = i;
            System.out.println(stringToDisplay());
        }
    }

    public boolean currentNumberIsMultipleOfThree() {
        return currentNumber % 3 == 0;
    }

    public boolean currentNumberIsMultipleOfFive() {
        return currentNumber % 5 == 0;
    }

    public String stringToDisplay() {

        boolean multipleOfThree = currentNumberIsMultipleOfThree();
        boolean multipleOfFive = currentNumberIsMultipleOfFive();
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

        return "" + currentNumber;
    }

    public int currentNumber;
}
