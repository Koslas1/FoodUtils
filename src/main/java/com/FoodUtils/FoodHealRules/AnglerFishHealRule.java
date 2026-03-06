package com.FoodUtils.FoodHealRules;

public class AnglerFishHealRule implements HealRule  {

    public int itemBaseHealAmount(int baseHp)
    {
        // Anglerfish heal scales with base HP and caps at 22.
        int c;

        if (baseHp >= 93)      c = 13;   // makes 99 -> floor(9) + 13 = 22
        else if (baseHp >= 83) c = 12;
        else if (baseHp >= 73) c = 11;
        else if (baseHp >= 63) c = 10;
        else if (baseHp >= 53) c = 9;
        else if (baseHp >= 43) c = 8;
        else if (baseHp >= 33) c = 7;
        else if (baseHp >= 23) c = 6;
        else                   c = 5;

        int heal = (baseHp / 10) + c;
        return Math.min(22, heal);
    }

    public int allowedMaxHp(int baseHp)
    {
        // Angler overheal cap is "baseHp + baseHeal"
        return baseHp + itemBaseHealAmount(baseHp);
    }
}
