package com.FoodUtils;

import com.FoodUtils.FoodHealRules.*;

public final class FoodData {

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

    public final FoodRuleData foodRuleData;

    public FoodData() {

        this.foodRuleData = new FoodRuleData();
    }
    public  FoodInfo calculate(int itemId, int baseHp, int currentHP)
    {
        HealRule rule = foodRuleData.getRuleForItemId(itemId);
        if (rule == null)
        {
            return null;
        }

        int allowedMax = rule.allowedMaxHp(baseHp);
        int itemBaseHeal = Math.max(0, rule.itemBaseHealAmount(baseHp));

        if (itemBaseHeal <= 0)
        {
            return null;
        }

        int missingToAllowedMax = Math.max(0, allowedMax - currentHP);
        int effectiveHeal = Math.min(itemBaseHeal, missingToAllowedMax);

        return new FoodInfo(allowedMax, itemBaseHeal, effectiveHeal, missingToAllowedMax);
    }
}