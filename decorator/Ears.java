package decorator;

import java.io.File;
import java.util.ArrayList;

public class Ears extends CharacterDecorator {

    public Ears(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/ears.txt");
        this.integrateDecor(decorLines);
    }
}
