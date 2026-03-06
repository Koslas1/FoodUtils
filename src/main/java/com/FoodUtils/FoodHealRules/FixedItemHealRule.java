package com.FoodUtils.FoodHealRules;

public class FixedItemHealRule implements HealRule{

    public FixedItemHealRule(int itemHealAmount){
        this.itemHealAmount = itemHealAmount;
    }

    public int itemBaseHealAmount(int baseHp)
    {
        return itemHealAmount;
    }

    public int allowedMaxHp(int baseHp)
    {
        return baseHp;
    }

    int itemHealAmount;
}
