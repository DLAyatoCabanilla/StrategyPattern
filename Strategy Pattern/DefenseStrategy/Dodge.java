package DefenseStrategy;

import DefenseStrategy.DefenseStrategy;

public class Dodge implements DefenseStrategy
{
    @Override
    public String defend()
    {
        return "Dodgin to avoid attack!";
    }
}