package net.teamterminus.metest.energy.electric.event;

import net.mine_diver.unsafeevents.listener.EventListener;
import net.modificationstation.stationapi.api.event.registry.ItemRegistryEvent;
import net.modificationstation.stationapi.api.util.Namespace;

public class ElectricItems {

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    @EventListener
    public void registerItems(ItemRegistryEvent event) {

    }

}
