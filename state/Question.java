/**
 * Creates a Question to be asked in the arithemetic game
 * @author Wade Little
 */
public class Question {
    private String question;
    private int answer;
    /**
     * Initializes a question and creates the string
     * @param num1 a random number
     * @param num2 a random number
     * @param operation a math operation
     */
    public Question(int num1, int num2, Operation operation) {
        question = num1 + " " + operation.label + " " + num2;
        switch (operation) {
            case PLUS:
                answer = num1 + num2;
                break;
            case MINUS:
                answer = num1 - num2;
                break;
            case MULTIPLY:
                answer = num1 * num2;
                break;
            case DIVIDE:
               answer = num1 / num2;
        }
    }
    /**
     * The question as a string
     * @return The question as a string
     */
    public String toString() {
        return question;
    }
    /**
     * Gets the answer
     * @return the answer to the question
     */
    public int getAnswer() {
        return answer;
    }
    /**
     * Checks to see if the answer is correct
     * @param answer the users answer
     * @return if the users answer is correct
     */
    public boolean isCorrect(int answer) {
        return this.answer == answer;
    }




}
