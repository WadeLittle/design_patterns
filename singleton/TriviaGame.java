package singleton;

import java.util.*;

/**
 * Creates the Trivia Game and only allows there to be one created
 * 
 * @author Wade Little
 */
public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    /**
     * Private initiliaztion of the Trivia Game and sets the variabes to their
     * default values.
     */
    private TriviaGame() {
        this.score = 0;
        this.numGames = 0;
        this.questions = DataLoader.getTriviaQuestions();
        this.rand = new Random();
    }

    /**
     * Creates an instance of the TriviaGame if one isn't made yet otherwise it
     * returns the already created trivia game
     * 
     * @return The instance of the TriviaGame
     */
    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    /**
     * Gets a random question from the arrayList of questions
     * 
     * @return A random question
     */
    public Question getQuestion() {
        if (hasMoreQuestions() == false) {
            return null;
        } else
            return questions.remove(rand.nextInt(questions.size()));
    }

    /**
     * Lets us know if there is any questions left to be asked
     * 
     * @return True if there is more questions and false if there is no more
     *         questions in the questions arrayList
     */
    public boolean hasMoreQuestions() {
        if (questions.size() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Increses the score and number of games played
     */
    public void winRound() {
        this.score++;
        this.numGames++;
    }

    /**
     * Only increases the number of games played
     */
    public void loseRound() {
        this.numGames++;
    }

    /**
     * Gets the score (score/numGames) played
     * 
     * @return A string with an easy to read format of the score
     */
    public String getScores() {
        return "You scored " + String.valueOf(this.score) + "/" + String.valueOf(this.numGames);
    }

}
