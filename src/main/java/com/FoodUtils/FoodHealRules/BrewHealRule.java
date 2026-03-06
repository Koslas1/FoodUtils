package com.FoodUtils.FoodHealRules;

public class BrewHealRule implements HealRule{

    public BrewHealRule(double pct, int flat){
        this.pct = pct;
        this.flat = flat;
    }

    public int itemBaseHealAmount(int baseHp)
    {
        return (int) Math.floor(baseHp * pct) + flat;
    }

    public int allowedMaxHp(int baseHp)
    {
        return baseHp + itemBaseHealAmount(baseHp);
    }

    double pct;
    int flat;
}
