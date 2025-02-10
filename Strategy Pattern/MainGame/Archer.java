package MainGame;

import AttackStrategy.ShootArrow;
import CharacterType.CharacterType;
import DefenseStrategy.Shield;

public class Archer implements CharacterType
{
    @Override
    public void attack()
    {
        ShootArrow shootArrow= new ShootArrow();
        System.out.println("Archer is " + shootArrow.attack());
    }

    @Override
    public void defend()
    {
        Shield shield = new Shield();
        System.out.println("Archer is " + shield.defend());
    }
}