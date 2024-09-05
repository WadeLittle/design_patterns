package decorator;
import java.util.ArrayList;

/**
 * Creates a character that has  a name and an arraylist of strings that can be printed or modified by the CharacterDecorator
 */
public abstract class Character {
    private String name;
    protected ArrayList<String> lines;
    /**
     * Creates/Initializes a character
     * @param lines The ArrayList that holds the skeleton/original form of the character
     * @param name The name of the character
     */
    public Character(ArrayList<String> lines, String name ) {
        this.name = name;
        this.lines=lines;
    }
    /**
     * Gets the characters name
     * @return The characters name
     */
    public String getName() {
        return name;
    }
    /**
     * Displays the character
     */
    public String toString() {
        StringBuilder finalChar = new StringBuilder();
        for (String line : lines) {
            finalChar.append(line).append("\n");
        }
        return finalChar.toString();
    }
}
