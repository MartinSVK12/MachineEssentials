package net.teamterminus.metest.energy.electric.event;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.modificationstation.stationapi.api.event.registry.BlockRegistryEvent;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.teamterminus.machineessentials.energy.electric.api.WireProperties;
import net.teamterminus.metest.energy.electric.block.BlockWire;
import net.teamterminus.metest.energy.electric.util.TestWireMaterials;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import static net.teamterminus.metest.METest.NAMESPACE;

public class ElectricBlocks {

    public static BlockWire wire;

    @EventListener
    public static void registerBlocks(BlockRegistryEvent event){
        wire = (BlockWire) new BlockWire(Identifier.of(NAMESPACE,"wire"), Material.METAL, new WireProperties(1,false, true, TestWireMaterials.test))
                .setTranslationKey(NAMESPACE, "wire")
                .setHardness(1)
                .setResistance(5);;
    }

    public static Block makeBlock(String id, Class<? extends Block> clazz){
        try {
            Constructor<? extends Block> c = clazz.getDeclaredConstructor(Identifier.class, Material.class);

            return c.newInstance(Identifier.of(NAMESPACE, id), Material.STONE).setTranslationKey(NAMESPACE, id).setHardness(1).setResistance(5);
        } catch (NoSuchMethodException | InvocationTargetException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

}
