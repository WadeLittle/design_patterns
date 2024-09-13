

/**
 * Creates an Arithemetic Game
 * @author Wade Little
 */
public class ArithemeticGame {
    private State easyState;
    private State mediumState;
    private State hardState;
    private State state;
    private int score;

    /**
     * Initializes all of the states and sets the default state to easy. The score starts at 0.
     */
    public ArithemeticGame() {
        this.easyState = new Easy(this);  
        this.mediumState = new Medium(this);
        this.hardState = new Hard(this);
        this.score=0;
        this.state = easyState;
    }
    /**
     * Creates a question
     * @return a question
     */
    public Question getQuestion() {
        Question question = new Question(this.state.getNum(), this.state.getNum(), this.state.getOperation());
        return question;
    }


    /**
     * Increases the score and regulates going into new levels based on score.
     */
    public void increaseScore() {
       if(this.score == 3) {
            state.increaseDifficulty();
        }
        else if(this.score == 6 ) {
            state.increaseDifficulty();
        }
        this.score +=1;
    }
    /**
     * Decreases the score and regulates going into new levels based on score
     */
    public void decreaseScore() {
        if(this.score == 3) {
            state.decreaseDifficulty();
        }
        else if(this.score == 6 ) {
           state.decreaseDifficulty();
        }
         this.score -= 1;
    }

    /**
     * Sets the state
     * @param state A state you want the game to be played at
     */
    public void setState(State state) {
        this.state = state;
    }



    /**
     * Gets the easy State
     * @return a State of Easy
     */
    public State getEasyState() {
        return easyState;
    }

    /**
     * Gets the medium state
     * @return a state of Medium
     */
    public State getMediumState() {
        return mediumState;
    }

    /**
     * Gets the hard state
     * @return a state of Hard
     */
    public State getHardState() {
        return hardState;
    }
    
}
