package ssu.cs360.fight;

public class DebuffAbility extends Ability {

    public DebuffAbility() {
        this.actionType = ActionType.DEBUFF;
    }

    public int Execute(Character source, Character target) {
        Dice d20 = new Dice(20);
        int attackRoll = d20.Roll() + source.getAttack();
        int modifier = 0;

        attackRoll += source.getAttack();

        if (attackRoll >= target.getDefense() + target.getEvade()) {
            Dice d3 = new Dice(3);
            duration = d3.Roll() + 1;
            modifier = -1 * (d3.Roll() + 1);
            SetCharStat(target, statType, GetCharStat(target, statType) + modifier);
        } else {
            duration = 0;
            modifier = 0;
        }

        return modifier;
    }
}
