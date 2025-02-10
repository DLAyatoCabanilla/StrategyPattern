package MainGame;

import AttackStrategy.CastSpell;
import CharacterType.CharacterType;
import DefenseStrategy.Barrier;

public class Wizard implements CharacterType
{
    @Override
    public void attack()
    {
        CastSpell castSpell= new CastSpell();
        System.out.println("Wizard is " + castSpell.attack());
    }

    @Override
    public void defend()
    {
        Barrier barrier = new Barrier();
        System.out.println("Wizard is " + barrier.defend());
    }
}