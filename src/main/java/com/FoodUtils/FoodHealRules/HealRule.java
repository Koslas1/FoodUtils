package com.FoodUtils.FoodHealRules;

public interface HealRule {

    public int itemBaseHealAmount(int baseHp);
    public int allowedMaxHp(int baseHp);
}
