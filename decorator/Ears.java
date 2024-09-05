package decorator;

import java.io.File;
import java.util.ArrayList;
/**
 * Adds ears onto a character(potatohead)
 */
public class Ears extends CharacterDecorator {
    /**
     * Adds Ears onto the character with ears.txt
     * @param character The character you want to add ears on
     */
    public Ears(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/ears.txt");
        this.integrateDecor(decorLines);
    }
}
