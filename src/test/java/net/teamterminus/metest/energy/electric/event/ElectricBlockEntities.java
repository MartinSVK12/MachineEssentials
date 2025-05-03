package net.teamterminus.metest.energy.electric.event;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.block.entity.BlockEntityRegisterEvent;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.teamterminus.metest.energy.electric.block.entity.BlockEntityWire;

public class ElectricBlockEntities {

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    @EventListener
    public static void registerBlockEntities(BlockEntityRegisterEvent event) {
        event.register(BlockEntityWire.class, String.valueOf(Identifier.of(NAMESPACE, "wire")));
    }

}
