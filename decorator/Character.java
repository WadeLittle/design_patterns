package decorator;
import java.util.ArrayList;


public abstract class Character {
    private String name;
    protected ArrayList<String> lines;

    public Character(ArrayList<String> lines, String name ) {
        this.name = name;
        this.lines=lines;
    }

    public String getName() {
        return name;
    }
    
    public String toString() {
        StringBuilder finalChar = new StringBuilder();
        for (String line : lines) {
            finalChar.append(line).append("\n");
        }
        return finalChar.toString();
    }
}
