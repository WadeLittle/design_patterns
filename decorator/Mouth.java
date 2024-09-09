package decorator;

import java.util.ArrayList;
/**
 * @author Wade Little
 * Integrates a mouth onto a character(potatohead)
 */
public class Mouth extends CharacterDecorator {
    /**
     * Integrates a mouth onto a character with the mouth.txt file.
     * @param character The character you want to add a mouth to.
     */
    public Mouth(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/mouth.txt");
        this.integrateDecor(decorLines);
    }
}