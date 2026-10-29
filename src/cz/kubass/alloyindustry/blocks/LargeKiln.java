package cz.kubass.alloyindustry.blocks;

import mindustry.content.Fx;
import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.production.GenericCrafter;
import mindustry.world.draw.DrawDefault;
import mindustry.world.meta.BuildVisibility;

public class LargeKiln extends GenericCrafter {

    public LargeKiln(String name) {
        super(name);

        size = 3;
        health = 360;
        itemCapacity = 20;

        // 17 ticků = 0.2833s → 3.53 metaglass/s
        craftTime = 17f;

        // Efekty
        craftEffect = Fx.smeltsmoke;
        updateEffect = Fx.pulverizeSmall;
        updateEffectChance = 0.05f;

        // Spotřeba energie: 210/s = 3.5 za tick
        consumePower(3.5f);

        // Spotřeba surovin
        consumeItems(
                ItemStack.with(
                        Items.lead, 1,
                        Items.sand, 1
                )
        );

        // Výstup
        outputItem = new ItemStack(Items.metaglass, 1);

        // Kategorie
        category = Category.crafting;
        buildVisibility = BuildVisibility.shown;

        requirements(Category.crafting, ItemStack.with(
                Items.copper, 120,
                Items.lead, 60,
                Items.graphite, 60,
                Items.silicon, 40
        ));

        buildCostMultiplier = 0.75f;

        // Vzhled
        drawer = new DrawDefault();
    }
}