/**
 * A state is a level of the arithemetic game
 * @author Wade Little
 */
public interface State {
    /**
     * Gets a random number based on states difficulty
     * @return a random number
     */
    public int getNum();
    /**
     * Gets a random Operation
     * @return a Random Operation
     */
    public Operation getOperation();
    /**
     * Increases difficulty to the next level
     */
    public void increaseDifficulty();
    /**
     * Decreases difficulty to the lower level
     */
    public void decreaseDifficulty();
}
