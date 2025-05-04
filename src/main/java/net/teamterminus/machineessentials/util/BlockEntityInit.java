package net.teamterminus.machineessentials.util;

import net.minecraft.block.Block;

// i don't want to do block entity in a block class method, sorry calm
public interface BlockEntityInit {
    void init(Block block);
}
