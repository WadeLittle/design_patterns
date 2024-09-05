package decorator;

import java.util.ArrayList;

public class PotatoeHead extends Character {

    public PotatoeHead(String name) {
        super(FileReader.getLines("design_patterns/decorator/txt/potatoe-head.txt"),name);
    }
}
