package decorator;

import java.util.ArrayList;

public class Hat extends CharacterDecorator {

    public Hat(Character character) {
        super(character);
        ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/hat.txt");
        this.integrateDecor(decorLines);
    }

}
