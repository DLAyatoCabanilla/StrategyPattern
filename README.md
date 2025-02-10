# Strategy Pattern
Problem scenario:

Suppose we have three types of characters in a MainGame.GameApp:

1. MainGame.Knight: Attacks with a sword; uses 3 strategies to defend (shield, dodge, magic barrier)
2. MainGame.Wizard: Casts spells; uses magic barrier to defend
3. MainGame.Archer: Shoots arrows; uses dodge to to defend

Implement two types of Strategy:
A.  DefenseStrategy.DefenseStrategy
     1. DefenseStrategy.Shield
     2. DefenseStrategy.Dodge
     3. CreateMagic

B.  AttackStrategy.AttackStrategy
     1.  AttackStrategy.CastSpell
     2.  AttackStrategy.ShootArrow
     3.  AttackStrategy.SwingSword  


Refactor the existing codes and provide the UML Diagram:

public class MainGame.Character {
    private String type;

    public MainGame.Character(String type) {
        this.type = type;
    }

    public void attack() {
        if (type.equals("MainGame.Knight")) {
            System.out.println("MainGame.Knight attacks with a sword!");
        } else if (type.equals("MainGame.Wizard")) {
            System.out.println("MainGame.Wizard casts a spell!");
        } else if (type.equals("MainGame.Archer")) {
            System.out.println("MainGame.Archer shoots an arrow!");
        }
    }

    public void defend() {
        if (type.equals("MainGame.Knight")) {
            System.out.println("Using a shield to defend!");
	System.out.println("Dodgin to avoid attack!");
            System.out.println("Creating a magic barrier for defense!"");		

        } else if (type.equals("MainGame.Wizard")) {
            System.out.println("Creating a magic barrier for defense!"");
        } else if (type.equals("MainGame.Archer")) {
            System.out.println("Using a shield to defend!"");
        }
    }
}
