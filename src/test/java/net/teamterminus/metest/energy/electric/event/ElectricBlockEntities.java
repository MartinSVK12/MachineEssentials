package net.teamterminus.metest.energy.electric.event;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.block.entity.BlockEntityRegisterEvent;
import net.modificationstation.stationapi.api.util.Identifier;
import net.modificationstation.stationapi.api.util.Namespace;
import net.teamterminus.metest.METest;
import net.teamterminus.metest.energy.electric.block.entity.BlockEntityWire;

import static net.teamterminus.metest.METest.NAMESPACE;

public class ElectricBlockEntities {

    @EventListener
    public static void registerBlockEntities(BlockEntityRegisterEvent event) {
        event.register(BlockEntityWire.class, String.valueOf(Identifier.of(NAMESPACE, "wire")));
    }

}
