package decorator;

import java.util.ArrayList;
/**
 * @author Wade Little
 * Adds a hat to a character(potatohead)
 **/
public class Hat extends CharacterDecorator {
    /**
     * Adds a hat to the character with the hat.txt file
     * @param character The character you want to add a hat to
     */
    public Hat(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/hat.txt");
        this.integrateDecor(decorLines);
    }

}