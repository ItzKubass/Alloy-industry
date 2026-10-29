package cz.kubass.alloyindustry.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.distribution.Conveyor;
import mindustry.world.meta.BuildVisibility;

public class AlloyConveyor extends Conveyor {

    public AlloyConveyor(String name) {
        super(name);

        size = 1;
        health = 75;
        itemCapacity = 5;
        displayedSpeed = 15f;
        speed = 0.125f;

        category = Category.distribution;
        buildVisibility = BuildVisibility.shown;

        requirements(Category.distribution, ItemStack.with(
                Items.copper, 2,
                Items.lead, 2,
                Items.titanium, 2,
                Items.silicon, 1,
                Items.graphite, 1
        ));

        buildCostMultiplier = 0.5f;

        // POZOR: bridgeReplacement a junctionReplacement se nastavují
        // v AlloyIndustryMod.java po vytvoření obou bloků
    }
}