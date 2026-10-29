package cz.kubass.alloyindustry;

import arc.util.Log;
import cz.kubass.alloyindustry.blocks.AlloyBridge;
import cz.kubass.alloyindustry.blocks.AlloyConveyor;
import cz.kubass.alloyindustry.blocks.LargeKiln;
import cz.kubass.alloyindustry.blocks.MediumSolarPanel;
import mindustry.content.Blocks;
import mindustry.mod.Mod;
import mindustry.world.Block;

public class AlloyIndustryMod extends Mod {

    public static Block alloyConveyor;
    public static Block alloyBridge;
    public static Block largeKiln;
    public static Block mediumSolar;

    public AlloyIndustryMod() {
        Log.info("Alloy Industry mod loaded.");
    }

    @Override
    public void loadContent() {
        Log.info("Loading Alloy Industry content...");

        alloyConveyor = new AlloyConveyor("alloy-conveyor");
        alloyBridge = new AlloyBridge("alloy-bridge");
        largeKiln = new LargeKiln("large-kiln");
        mediumSolar = new MediumSolarPanel("medium-solar-panel");

        if (alloyConveyor instanceof AlloyConveyor conveyor) {
            conveyor.bridgeReplacement = alloyBridge;
            conveyor.junctionReplacement = Blocks.junction;
        }

        alloyConveyor.researchCostMultiplier = 1f;
        alloyBridge.researchCostMultiplier = 1f;
        largeKiln.researchCostMultiplier = 1f;
        mediumSolar.researchCostMultiplier = 1f;
    }
}