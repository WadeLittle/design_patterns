import java.util.*;

/**
 * The medium state (numbers from 1-25 and only addition, subtraction, and division)
 * @author Wade Little
 */
public class Medium implements State {
    private ArithemeticGame game;

    public Medium(ArithemeticGame game) {
       this.game = game;
    }
    public int getNum() {
        Random random = new Random();
        int randomNumber = random.nextInt(25) + 1;
        return randomNumber;
    }
    public Operation getOperation() {
        Operation[] operations = {Operation.MULTIPLY,Operation.PLUS , Operation.MINUS };
        Random random = new Random();
        int randomNumber = random.nextInt(2);
        return operations[randomNumber];
    }
    public void increaseDifficulty() {
        System.out.println("Entering level hard");
        game.setState(game.getHardState());
    }
    public void decreaseDifficulty() {
        System.out.println("Entering level easy");
        game.setState(game.getEasyState());
    }

}
