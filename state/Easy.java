import java.util.*;
/**
 * The easy state (only addition and subtraction and numbers from 1-10)
 * @author Wade Little
 */
public class Easy implements State {
    private ArithemeticGame game;

    public Easy(ArithemeticGame game) {
      this.game =game;
    }
    public int getNum() {
        Random random = new Random();
        int randomNumber = random.nextInt(10) + 1;
        return randomNumber;
    }
    public Operation getOperation() {
        Operation[] operations = {Operation.PLUS , Operation.MINUS };
        Random random = new Random();
        int randomNumber = random.nextInt(1);
        return operations[randomNumber];
    }
    public void increaseDifficulty() {
        System.out.println("Entering Level Medium");
        game.setState(game.getMediumState());
    }
    public void decreaseDifficulty() {
        System.out.println("You need more practice");
    }

}
