package decorator;

import java.util.ArrayList;

public class Eyes extends CharacterDecorator {

        public Eyes(Character character) {
            super(character);
            ArrayList<String> decorLines = FileReader.getLines("design_patterns/decorator/txt/eyes.txt");
            this.integrateDecor(decorLines);
        }
}
