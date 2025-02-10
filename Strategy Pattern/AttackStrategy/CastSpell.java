package AttackStrategy;

import AttackStrategy.AttackStrategy;

public class CastSpell implements AttackStrategy
{
    @Override
    public String attack()
    {
        return "casting a spell!";
    }
}