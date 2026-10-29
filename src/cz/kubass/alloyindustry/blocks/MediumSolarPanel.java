package cz.kubass.alloyindustry.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.power.SolarGenerator;
import mindustry.world.meta.BuildVisibility;

public class MediumSolarPanel extends SolarGenerator {

    public MediumSolarPanel(String name) {
        super(name);

        size = 2;
        health = 160;  // mezi malým (40) a velkým (450)

        // Výkon: 36/s = 0.6 za tick
        powerProduction = 0.6f;

        category = Category.power;
        buildVisibility = BuildVisibility.shown;

        // Náklady: mezi malým (10/8) a velkým (60/70/15)
        requirements(Category.power, ItemStack.with(
                Items.copper, 25,
                Items.lead, 20,
                Items.silicon, 5
        ));

        buildCostMultiplier = 0.5f;
    }
}