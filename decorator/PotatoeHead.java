package decorator;

import java.util.ArrayList;
/**
 * This creates a PotatoeHead character
 */
public class PotatoeHead extends Character {
    /**
     * This class creates a character and reads in a potatohead skeleton into the arraylist
     * @param name The name of the potato head
     */
    public PotatoeHead(String name) {
        super(FileReader.getLines("design_patterns/decorator/txt/potatoe-head.txt"),name);
    }
}
