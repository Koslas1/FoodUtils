package com.FoodUtils;


import java.util.HashMap;
import java.util.Map;
import net.runelite.api.ItemID;


public final class FoodData {
    private interface  HealRule
    {
        int baseHeal(int baseHp);
        default int allowedMaxHp(int baseHp)
        {
            return baseHp;
        }
    }
    public static final class FoodInfo
    {
        public final int allowedMaxHp;
        public final int baseHeal;
        public final int effectiveHeal;
        public final int missingToAllowedMax;
        private FoodInfo(int allowedMaxHp, int baseHeal, int effectiveHeal, int missingToAllowedMax)
        {
            this.allowedMaxHp = allowedMaxHp;
            this.baseHeal = baseHeal;
            this.effectiveHeal = effectiveHeal;
            this.missingToAllowedMax = missingToAllowedMax;
        }
    }
    private static final Map<Integer, HealRule> RULES = new HashMap<>();

    static
    {
        FoodRegistry.register();
    }

    private FoodData() {}
    public static FoodInfo calculate(int itemId, int baseHp, int currentHP)
    {
        HealRule rule = RULES.get(itemId);
        if (rule == null)
        {
            return null;
        }

        int allowedMax = rule.allowedMaxHp(baseHp);
        int baseHeal = Math.max(0, rule.baseHeal(baseHp));

        if (baseHeal <= 0)
        {
            return null;
        }

        int missingToAllowedMax = Math.max(0, allowedMax - currentHP);
        int effectiveHeal = Math.min(baseHeal, missingToAllowedMax);

        return new FoodInfo(allowedMax, baseHeal, effectiveHeal, missingToAllowedMax);
    }

    static void addHeal(int heal, int... itemIds)
    {
        addFixed(heal, itemIds);
    }
    private static void addRule(HealRule rule, int... itemIds)
    {
        for (int id : itemIds)
        {
            RULES.put(id, rule);
        }
    }

    private static void addFixed(int heal, int... itemIds)
    {
        addRule(baseHp -> heal, itemIds);
    }

    static void addPercentCeil(double pct, int flat, int... itemIds)
    {
        addRule(baseHp -> (int) Math.ceil(baseHp * pct) + flat, itemIds);
    }

    static void addBrewStyle(double pct, int flat, int... itemIds)
    {
        addRule(new HealRule()
        {
            @Override
            public int baseHeal(int baseHp)
            {

                return (int) Math.floor(baseHp * pct) + flat;
            }

            @Override
            public int allowedMaxHp(int baseHp)
            {
                return baseHp + baseHeal(baseHp);
            }
        }, itemIds);
    }
    static void addAnglerfish(int... itemIds)
    {
        addRule(new HealRule()
        {
            @Override
            public int baseHeal(int baseHp)
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

            @Override
            public int allowedMaxHp(int baseHp)
            {
                // Angler overheal cap is "baseHp + baseHeal"
                return baseHp + baseHeal(baseHp);
            }
        }, itemIds);
    }
}