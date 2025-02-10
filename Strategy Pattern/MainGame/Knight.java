package MainGame;

import AttackStrategy.SwingSword;
import CharacterType.CharacterType;
import DefenseStrategy.Barrier;
import DefenseStrategy.Dodge;
import DefenseStrategy.Shield;

public class Knight implements CharacterType
{
    @Override
    public void attack()
    {
        SwingSword swingSword = new SwingSword();
        System.out.println("Knight is " + swingSword.attack());
    }

    @Override
    public void defend()
    {
        Shield shield = new Shield();
        Dodge dodge = new Dodge();
        Barrier barrier = new Barrier();
        System.out.println("Knight is " + shield.defend());
        System.out.println("Knight is " + dodge.defend());
        System.out.println("Knight is " + barrier.defend());
    }
}