package decorator;

import java.util.ArrayList;

public class Mouth extends CharacterDecorator {

    public Mouth(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/mouth.txt");
        this.integrateDecor(decorLines);
    }
}
