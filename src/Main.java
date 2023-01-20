import AdventureGame.character.MainCharacter;
import AdventureGame.game.CharacterService;
import AdventureGame.game.Game;

import java.util.Scanner;

public class Main {


    //oyunu başlat
    //karakter seçili değilse karakter seç
    //menüye aktar
        //@@@@@@menü@@@
        //karakter durumu görüntüle
        //safehouse
        //forest
        //Cave
        //river
        //shop
    public static void main(String[] args) {
        Game game = new Game(new CharacterService());
        CharacterService characterService = game.getCharacterService();
        game.getCharacterService().selectCharacter();
    }
}
