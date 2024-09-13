import java.util.*;
/**
 * The hard state (numbers between 1-50 and all operations)
 * @author Wade Little
 */
public class Hard implements State{

    private ArithemeticGame game;

    public Hard(ArithemeticGame game) {
       this.game = game;
    }
    public int getNum() {
        Random random = new Random();
        int randomNumber = random.nextInt(50) + 1;
        return randomNumber;
    }
    public Operation getOperation() {
        Operation[] operations = {Operation.MULTIPLY,Operation.DIVIDE , Operation.PLUS , Operation.MINUS };
        Random random = new Random();
        int randomNumber = random.nextInt(3);
        return operations[randomNumber];
    }
    public void increaseDifficulty() {
        System.out.println("Wow you're good!!");
    }
    public void decreaseDifficulty() {
        System.out.println("Entering level medium");
        game.setState(game.getMediumState());
    }
}
