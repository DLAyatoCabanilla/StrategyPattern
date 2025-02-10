package MainGame;

import CharacterType.CharacterType;

public class Character
{
    private CharacterType type;

    public Character(CharacterType type)
    {
        this.type = type;
    }
    public void attack()
    {
        type.attack();
    }
    public void defend()
    {
        type.defend();
    }
}