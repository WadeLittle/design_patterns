package decorator;

import java.util.ArrayList;
/**
 * Integrates a nose onto a character(potatohead)
 */
public class Nose extends CharacterDecorator {
    /**
     * Adds a nose to the specified character from the nose.txt file
     * @param character The character you want to add a nose to.
     */
    public Nose(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/nose.txt");
        this.integrateDecor(decorLines);
    }
}
