package decorator;

import java.util.ArrayList;

public class Nose extends CharacterDecorator {

    public Nose(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/nose.txt");
        this.integrateDecor(decorLines);
    }
}
