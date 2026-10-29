package cz.kubass.alloyindustry.blocks;

import mindustry.content.Items;
import mindustry.type.Category;
import mindustry.type.ItemStack;
import mindustry.world.blocks.distribution.BufferedItemBridge;
import mindustry.world.meta.BuildVisibility;
import mindustry.world.meta.Stat;
import mindustry.world.meta.StatUnit;

public class AlloyBridge extends BufferedItemBridge {

    public AlloyBridge(String name) {
        super(name);

        size = 1;
        health = 50;
        range = 5;  // mezera 4 bloky

        // Rychlost přenosu
        speed = 60f;
        displayedSpeed = 15f;
        bufferCapacity = 50;

        // Přepravní čas - nižší = rychlejší
        transportTime = 1f;

        category = Category.distribution;
        buildVisibility = BuildVisibility.shown;

        requirements(Category.distribution, ItemStack.with(
                Items.copper, 10,
                Items.lead, 10,
                Items.titanium, 7,
                Items.silicon, 5
        ));
    }

    @Override
    public void setStats() {
        // Nevoláme super.setStats(), protože by přidal 60/s z ItemBridge
        // a pak 15/s z BufferedItemBridge - dvakrát.
        // Místo toho přidáme jen jednu hodnotu.

        // Nejdřív základní statistiky z Block (bez ItemBridge)
        super.setStats();

        // Odstraníme automaticky přidanou hodnotu z ItemBridge (60/transportTime)
        stats.remove(Stat.itemsMoved);

        // Přidáme jen naši zobrazenou hodnotu
        stats.add(Stat.itemsMoved, displayedSpeed, StatUnit.itemsSecond);
    }
}