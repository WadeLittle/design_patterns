package decorator;

import java.util.ArrayList;
/**
 * Adds eyes onto a character(potatohead)
 */
public class Eyes extends CharacterDecorator {
    /**
     * Adds eyes onto a character with the eyes.txt file
     * @param character The character you want to add eyes on.
     */
    public Eyes(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/eyes.txt");
        this.integrateDecor(decorLines);
        }
}
