package AdventureGame.game;

import AdventureGame.character.MainCharacter;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    CharacterService characterService;

    public Game(CharacterService characterService){
        this.characterService = characterService;
    }

    public CharacterService getCharacterService() {
        return characterService;
    }

}
