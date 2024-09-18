package singleton;

import java.util.*;

public class TriviaGame {

    private static TriviaGame triviaGame;
    private int score;
    private int numGames;
    private Random rand;
    private ArrayList<Question> questions;

    private TriviaGame() {
        this.score = 0;
        this.numGames = 0;
        this.questions = DataLoader.getTriviaQuestions();
        this.rand = new Random();
    }

    public static TriviaGame getInstance() {
        if (triviaGame == null) {
            triviaGame = new TriviaGame();
        }
        return triviaGame;
    }

    public Question getQuestion() {
        if (hasMoreQuestions() == false) {
            return null;
        } else
            return questions.get(rand.nextInt());
    }

    public boolean hasMoreQuestions() {
        if (questions.size() >= 1) {
            return true;
        } else {
            return false;
        }
    }

    public void winRound() {
        this.score++;
        this.numGames++;
    }

    public void loseRound() {
        this.numGames++;
    }

    public String getScores() {
        return String.valueOf(this.score) + "/" + String.valueOf(this.numGames);
    }

}
