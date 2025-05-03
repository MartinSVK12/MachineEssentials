package net.teamterminus.metest;

import com.mojang.datafixers.util.Pair;
import net.mine_diver.unsafeevents.listener.EventListener;
import net.minecraft.block.Block;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.inventory.Inventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.modificationstation.stationapi.api.event.mod.InitEvent;
import net.modificationstation.stationapi.api.mod.entrypoint.EntrypointManager;
import net.modificationstation.stationapi.api.util.Namespace;
import net.modificationstation.stationapi.api.util.math.Direction;
import net.modificationstation.stationapi.api.util.math.Vec3i;
import net.modificationstation.stationapi.api.world.StationFlatteningWorld;
import org.apache.logging.log4j.Logger;
import org.jetbrains.annotations.UnmodifiableView;

import java.lang.invoke.MethodHandles;
import java.util.*;

public class METest {
    static {
        EntrypointManager.registerLookup(MethodHandles.lookup());
    }

    @SuppressWarnings("UnstableApiUsage")
    public static final Namespace NAMESPACE = Namespace.resolve();

    public static final Logger LOGGER = NAMESPACE.getLogger("MachineEssentials|Test");

    @EventListener
    private static void init(InitEvent event) {
        LOGGER.info("Machine Essentials Test Mod initialized.");
    }

}
