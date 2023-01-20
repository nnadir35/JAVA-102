package AdventureGame.game;

import AdventureGame.character.GameCharacter;
import AdventureGame.character.MainCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CharacterService{
    static List<MainCharacter> mainCharacterList = new ArrayList<>();
    public List<MainCharacter> getMainCharacterList() {
        return mainCharacterList;
    }
    MainCharacter selectedMainCharacter = null;

    public MainCharacter getSelectedMainCharacter() {
        return selectedMainCharacter;
    }

    public void setSelectedMainCharacter(MainCharacter selectedMainCharacter) {
        this.selectedMainCharacter = selectedMainCharacter;
    }

    static {
        mainCharacterList.add(new MainCharacter("Samuray",5,21,15));
        mainCharacterList.add(new MainCharacter("Okçu",7,18,20));
        mainCharacterList.add(new MainCharacter("Şövalye",8,24,5));
    }

    public void showCharacterStats(GameCharacter character){
        System.out.println(character.getId()+": "+"name: " + character.getName()
                +"  "+"damage: " + character.getDamage()+"  "+"health: "
                + character.getHealth()+"   "+"money: " + character.getMoney());

    }

    public void selectCharacter(){
        Scanner myObj = new Scanner(System.in);
        for (MainCharacter character : getMainCharacterList()) {
            showCharacterStats(character);
        }
        int input = 0;
        while (input > 3 || input < 1) {
            input = myObj.nextInt();
            if (input > 3 || input < 1){
                System.out.println("düzgün giriş yap");
            }
        }
        int selectedCharacterIndex = input;
        myObj.close();
        setSelectedMainCharacter(getMainCharacterList().get(selectedCharacterIndex-1));
        System.out.println("selected character:  "+selectedMainCharacter.toString());
    }
}
