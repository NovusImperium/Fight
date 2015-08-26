package ssu.cs360.fight;

public class BattleEffect {
    String stat;
    int modifier;
    int duration;

    BattleEffect(String stat, int modifier, int duration) {
        this.stat = stat;
        this.modifier = modifier;
        this.duration = duration;
    }

    public String getStat() {
        return stat;
    }

    public int getModifier() {
        return modifier;
    }

    public int getDuration() {
        return duration;
    }

    public void decrement() {
        duration--;
    }

    public void reverse(Character character) {
        Ability ability = new Ability();
        ability.SetStatType(stat);
        ability.ReverseCharStat(character, -1 * modifier);
    }
}
