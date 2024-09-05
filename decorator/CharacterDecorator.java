package decorator;

import java.util.*;

public abstract class CharacterDecorator extends Character{
    private Character character;

    public CharacterDecorator(Character character) {
        super(character.lines, character.getName());
        this.character=character;
    }
    protected void integrateDecor(ArrayList<String> decor) {
        for (int i=0;i < lines.size();i++) {
            
            String line ="";
            for (int j=0;j < Math.max(decor.get(i).length(), lines.get(i).length());j++) {
                if (j >= lines.get(i).length()) {
                    line += decor.get(i).charAt(j);
                }
                else if (j >= decor.get(i).length()) {
                    line += lines.get(i).charAt(j);
                }
                else if (decor.get(i).charAt(j) != ' ') {
                    line += decor.get(i).charAt(j);
                }
                else if (lines.get(i).length() > j) {
                    line += lines.get(i).charAt(j);
                }
            }
            lines.set(i, line);
        }
      
    }
}