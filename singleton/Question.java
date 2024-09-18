package singleton;

import java.lang.reflect.Array;
import java.util.*;

/**
 * This class holds all the contents of a question broken into parts, question,
 * answers, and where the correct answer is in the list of answers
 * 
 * @author Wade Little
 */
public class Question {
    private String question;
    private ArrayList<String> answers;
    private int correctAnswer;

    /**
     * Creates a question based on the given paramaters
     * 
     * @param question      The question to be asked as a string
     * @param correctAnswer The index where the correct answer is found in the array
     *                      of answers
     * @param answers       An array of answers
     */
    public Question(String question, int correctAnswer, String[] answers) {
        this.question = question;
        this.correctAnswer = correctAnswer;
        this.answers = new ArrayList<String>();
        for (int i = 0; i < answers.length; i++) {
            this.answers.add(answers[i]);
        }
    }

    /**
     * Displays the question and its answer choices in an easy to read format
     * 
     * @return The string value of all of the questions contents
     */
    public String toString() {
        String printString = question + "\n" + "1. " + answers.get(0) + "\n2. " + answers.get(1) + "\n3. "
                + answers.get(2) + "\n4. " + answers.get(3);
        return printString;
    }

    /**
     * Compares the users answer choice to the correct answer choice
     * 
     * @param userAnswer The user inputted answer
     * @return True if the user is correct and false if the user is incorrect
     */
    public boolean isCorrect(int userAnswer) {
        if (userAnswer - 1 == correctAnswer) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Gets the correct answer from the arrayList of answers
     * 
     * @return The string of the correct answer
     */
    public String getCorrectAnswer() {
        return answers.get(correctAnswer);
    }
}
