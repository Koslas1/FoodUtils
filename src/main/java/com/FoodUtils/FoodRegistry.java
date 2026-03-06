package com.FoodUtils;

import static com.FoodUtils.FoodData.addHeal;
import static com.FoodUtils.FoodData.addPercentCeil;
import static com.FoodUtils.FoodData.addBrewStyle;
import static com.FoodUtils.FoodData.addAnglerfish;
import net.runelite.api.gameval.ItemID;

final class FoodRegistry
{
    private FoodRegistry()
    {

    }

    static void register()
    {
        //Fixed Heal
        addHeal(-5,
                ItemID.TBWT_POORLY_COOKED_KARAMBWAN);
        
        addHeal(1,
                ItemID.POTATO,
                ItemID.ONION,
                ItemID.CABBAGE,
                ItemID.POT_OF_CREAM,
                ItemID.BOWL_ONION,
                ItemID.ANCHOVIES,
                ItemID.BOWL_NETTLEWATER,
                ItemID.EQUA_LEAVES,
                ItemID.SWAN_MONKFISH /* Cooked */,
                ItemID.COOKED_CHICKEN_UNDEAD /* Undead */,
                ItemID.COOKED_MEAT_UNDEAD /* Undead */);
        
        addHeal(2,

                ItemID.TOMATO,
                ItemID.BOWL_TOMATO,
                ItemID.BANANA,
                ItemID.TBWT_SLICED_BANANA,
                ItemID.ORANGE,
                ItemID.ORANGE_SLICES,
                ItemID.ORANGE_CHUNKS,
                ItemID.PINEAPPLE_RING,
                ItemID.PINEAPPLE_CHUNKS,
                ItemID.BOWL_CHILLI,
                ItemID.CHEESE,
                ItemID.SPINACH_ROLL,
                ItemID.LEMON,
                ItemID.LEMON_CHUNKS,
                ItemID.LEMON_SLICES,
                ItemID.LIME,
                ItemID.LIME_CHUNKS,
                ItemID.LIME_SLICES,
                ItemID.DWELLBERRIES,
                ItemID.KING_WORM,
                ItemID.BOWL_CARNE,
                ItemID.BOWL_SPICYTOMATO,
                ItemID.MDAUGHTER_WHITE_PEARL_FRUIT);
        
        addHeal(3,
                ItemID.SHRIMP,
                ItemID.COOKED_MEAT,
                ItemID.COOKED_CHICKEN,
                ItemID.BRUT_ROE,
                ItemID.CHOCOLATE_BAR,
                ItemID.COOKED_UGTHANKI_MEAT,
                ItemID.TOADS_LEGS,
                ItemID.BOWL_ONIONTOMATO,
                ItemID.BOWL_SPICYMEAT,
                ItemID.OS_BIRTHDAY_CAKE_SLICE,
                ItemID.LOCUST_MEAT,
                ItemID.BRUTAL_RELICYMS_BALM1,
                ItemID.BRUTAL_RELICYMS_BALM2,
                ItemID.BRUTAL_1DOSEANTIPOISON,
                ItemID.BRUTAL_2DOSEANTIPOISON);

        addHeal(4,
                ItemID.SARDINE,
                ItemID.CAKE,
                ItemID.PARTIAL_CAKE,
                ItemID.CAKE_SLICE,
                ItemID.CHOCOLATY_MILK,
                ItemID.POTATO_BAKED,
                ItemID.EDIBLE_SEAWEED,
                ItemID.MOONLIGHT_MEAD,
                ItemID.KEG_MOONLIGHT_MEAD_4,
                ItemID.KEG_MOONLIGHT_MEAD_3,
                ItemID.KEG_MOONLIGHT_MEAD_2,
                ItemID.KEG_MOONLIGHT_MEAD_1,
                ItemID.MM_MONKEY_NUTS);

        addHeal(5,
                ItemID.BREAD,
                ItemID.HERRING,
                ItemID.CHOCOLATE_CAKE,
                ItemID.PARTIAL_CHOCOLATE_CAKE,
                ItemID.CHOCOLATE_SLICE,
                ItemID.COOKED_RABBIT,
                ItemID.BOWL_CHILLI_CARNE,
                ItemID.BOWL_MUSHROOM_FRIED,
                ItemID.BOWL_ONION_FRIED,
                ItemID.REDBERRY_PIE,
                ItemID.HALF_A_REDBERRY_PIE,
                ItemID.BRUT_CAVIAR,
                ItemID.RAIDS_FISH0_COOKED,
                ItemID.COOKED_MYSTERY_MEAT,
                ItemID.BOWL_EGG_SCRAMBLED,
                ItemID.MM_MONKEY_BAR,
                ItemID.HUNDRED_ILM_TCHIKI_MONKEY_NUTS,
                ItemID.HUNDRED_ILM_TCHIKI_MONKEY_NUT_PASTE,
                ItemID.HUNDRED_ILM_RED_BANANA,
                ItemID.HUNDRED_ILM_SLICED_RED_BANANA);

        addHeal(6,
                ItemID.MACKEREL,
                ItemID.MEAT_PIE,
                ItemID.HALF_A_MEAT_PIE,
                ItemID.RAIDS_BAT0_COOKED,
                ItemID.SPIT_ROASTED_BIRD_MEAT,
                ItemID.SQUARE_SANDWICH,
                ItemID.ROLL,
                ItemID.BAGUETTE,
                ItemID.TRIANGLE_SANDWICH,
                ItemID.GIANT_CARP,
                ItemID.MATURE_MOONLIGHT_MEAD,
                ItemID.KEG_MATURE_MOONLIGHT_MEAD_4,
                ItemID.KEG_MATURE_MOONLIGHT_MEAD_3,
                ItemID.KEG_MATURE_MOONLIGHT_MEAD_2,
                ItemID.KEG_MATURE_MOONLIGHT_MEAD_1,
                ItemID.BIM_STEAK_SANDWICH,
                ItemID.GIANT_FROG_LEGS,
                ItemID.BRUTAL_1DOSE1ANTIDRAGON,
                ItemID.BRUTAL_2DOSE1ANTIDRAGON,
                ItemID.BRUTAL_1DOSE2ANTIDRAGON,
                ItemID.BRUTAL_2DOSE2ANTIDRAGON,
                ItemID.BRUTAL_1DOSE3ANTIDRAGON,
                ItemID.BRUTAL_2DOSE3ANTIDRAGON,
                ItemID.BRUTAL_1DOSE4ANTIDRAGON,
                ItemID.BRUTAL_2DOSE4ANTIDRAGON,
                ItemID.BRUTAL_1DOSE2ANTIPOISON,
                ItemID.BRUTAL_2DOSE2ANTIPOISON,
                ItemID.BRUTAL_ANTIDOTE_1,
                ItemID.BRUTAL_ANTIDOTE_2);

        addHeal(7,
                ItemID.ELID_CHOC_ICE,
                ItemID.TROUT,
                ItemID.COD,
                ItemID.PLAIN_PIZZA,
                ItemID.HALF_PLAIN_PIZZA,
                ItemID.APPLE_PIE,
                ItemID.HALF_AN_APPLE_PIE,
                ItemID.SPIT_ROASTED_RABBIT_MEAT,
                ItemID.PREMADE_CHOCCHIP_CRUNCHIES,
                ItemID.CHOCCHIP_CRUNCHIES,
                ItemID.PREMADE_SPICY_CRUNCHIES,
                ItemID.SPICY_CRUNCHIES);

        addHeal(8,
                ItemID.PIKE,
                ItemID.SPIT_ROASTED_BEAST_MEAT,
                ItemID.MEAT_PIZZA,
                ItemID.HALF_MEAT_PIZZA,
                ItemID.PREMADE_WORM_CRUNCHIES,
                ItemID.WORM_CRUNCHIES,
                ItemID.PREMADE_TOAD_CRUNCHIES,
                ItemID.TOAD_CRUNCHIES,
                ItemID.BOWL_EGG_TOMATO,
                ItemID.RAIDS_BAT1_COOKED,
                ItemID.PEACH,
                ItemID.RAIDS_FISH1_COOKED,
                ItemID.RED_CRAB_MEAT);

        addHeal(9,
                ItemID.PREMADE_PINEAPPLE_PUNCH,
                ItemID.PINEAPPLE_PUNCH,
                ItemID.PREMADE_FRUIT_BLAST,
                ItemID.FRUIT_BLAST,
                ItemID.SALMON,
                ItemID.ANCHOVIE_PIZZA,
                ItemID.HALF_ANCHOVIE_PIZZA);

        addHeal(10,
                ItemID.TUNA,
                ItemID.HUNDRED_PIRATE_GIANT_CRAB_MEAT_5,
                ItemID.BOWL_TUNA,
                ItemID.COOKED_CHOMPY,
                ItemID.PEST_FIELD_RATION,
                ItemID.DRAGONFRUIT,
                ItemID.DEADMAN_STARTER_TUNA /* Deadman Starter Pack */);

        addHeal(11,
                ItemID.HUNTING_FISH_SPECIAL,
                ItemID.STEW,
                ItemID.PINEAPPLE_PIZZA,
                ItemID.HALF_PINEAPPLE_PIZZA,
                ItemID.HUNDRED_PIRATE_FISHCAKE,
                ItemID.PREMADE_VEGETABLE_BATTA,
                ItemID.VEGETABLE_BATTA,
                ItemID.PREMADE_WORM_BATTA,
                ItemID.WORM_BATTA,
                ItemID.PREMADE_TOAD_BATTA,
                ItemID.TOAD_BATTA,
                ItemID.PREMADE_CHEESE_TOM_BATTA,
                ItemID.CHEESE_TOM_BATTA,
                ItemID.PREMADE_FRUIT_BATTA,
                ItemID.FRUIT_BATTA,
                ItemID.BOWL_MUSHROOM_ONION,
                ItemID.RAIDS_BAT2_COOKED,
                ItemID.LAVA_EEL,
                ItemID.RAIDS_FISH2_COOKED,
                ItemID.MM_BANANA_STEW);

        addHeal(12,
                ItemID.LOBSTER,
                ItemID.PREMADE_WORM_HOLE,
                ItemID.WORM_HOLE,
                ItemID.PREMADE_VEG_BALL,
                ItemID.VEG_BALL);

        addHeal(13,
                ItemID.BASS,
                ItemID.BOWL_TUNA_SWEETCORN);

        addHeal(14,
                ItemID.POTATO_BUTTER,
                ItemID.POTATO_CHILLI_CARNE,
                ItemID.SWORDFISH,
                ItemID.RAIDS_BAT3_COOKED,
                ItemID.PUMPKIN,
                ItemID.EASTER_EGG,
                ItemID.RAIDS_FISH3_COOKED,
                ItemID.COOKED_OOMLIE,
                ItemID.BLUE_CRAB_MEAT);

        addHeal(15,
                ItemID.PREMADE_TANGLED_TOADS_LEGS,
                ItemID.TANGLED_TOADS_LEGS,
                ItemID.PREMADE_CHOCOLATE_BOMB,
                ItemID.CHOCOLATE_BOMB,
                ItemID._100_JUBBLY_MEAT_COOKED,
                ItemID.SWORDTIP_SQUID);

        addHeal(16,
                ItemID.MONKFISH,
                ItemID.POTATO_CHEESE,
                ItemID.POTATO_EGG_TOMATO,
                ItemID.GAUNTLET_COMBO_FOOD,
                ItemID.GAUNTLET_COMBO_FOOD_HM);

        addHeal(17,
                ItemID.RAIDS_FISH4_COOKED,
                ItemID.RAIDS_BAT4_COOKED,
                ItemID.GIANT_KRILL,
                ItemID.JUMBO_SQUID);

        addHeal(18,
                ItemID.TBWT_COOKED_KARAMBWAN,
                ItemID.BLIGHTED_KARAMBWAN,
                ItemID.BR_TBWT_COOKED_KARAMBWAN /* LMS */);

        addHeal(19,
                ItemID.CURRY,
                ItemID.UGTHANKI_KEBAB_BAD,
                ItemID.UGTHANKI_KEBAB,
                ItemID.RAINBOW_CRAB_MEAT);

        addHeal(20,
                ItemID.POTATO_MUSHROOM_ONION,
                ItemID.SHARK,
                ItemID.RAIDS_FISH5_COOKED,
                ItemID.RAIDS_BAT5_COOKED,
                ItemID.HUNDRED_ILM_COOKED_STUFFED_SNAKE,
                ItemID.BR_SHARK /* LMS */,
                ItemID.GAUNTLET_FOOD,
                ItemID.EVENT_CORRUPTED_SHARK,
                ItemID.HALIBUT);

        addHeal(21,
                ItemID.SEATURTLE);

        addHeal(22,
                ItemID.MANTARAY,
                ItemID.BLIGHTED_MANTARAY,
                ItemID.DARK_CRAB,
                ItemID.POTATO_TUNA_SWEETCORN);

        addHeal(23,
                ItemID.RAIDS_FISH6_COOKED,
                ItemID.RAIDS_BAT6_COOKED);

        addHeal(24,
                ItemID.MARLIN);

        //Percent Heal
        addPercentCeil(0.06, 0,
                ItemID.STRAWBERRY);

        //Sarabrew style
        addBrewStyle(0.15, 2,
                ItemID.BR_1DOSEPOTIONOFSARADOMIN,
                ItemID.BR_2DOSEPOTIONOFSARADOMIN,
                ItemID.BR_3DOSEPOTIONOFSARADOMIN,
                ItemID.BR_4DOSEPOTIONOFSARADOMIN,
                ItemID.TOA_SUPPLY_HEAL_1,
                ItemID.TOA_SUPPLY_HEAL_2,
                ItemID.TOA_SUPPLY_HEAL_3,
                ItemID.TOA_SUPPLY_HEAL_4
                );
        //Angler
        addAnglerfish(
                ItemID.ANGLERFISH,
                ItemID.BLIGHTED_ANGLERFISH
        );
    }
}