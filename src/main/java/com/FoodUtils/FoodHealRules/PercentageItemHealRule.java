package com.FoodUtils.FoodHealRules;

public class PercentageItemHealRule implements HealRule{

    public PercentageItemHealRule(double pct, int flat){
        this.pct = pct;
        this.flat = flat;
    }

    public int itemBaseHealAmount(int baseHp)
    {
        return (int) Math.ceil(baseHp * pct) + flat;
    }

    public int allowedMaxHp(int baseHp)
    {
        return baseHp;
    }

    double pct;
    int flat;
}
