package net.teamterminus.metest.energy.electric.block;

import lombok.Getter;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.util.Identifier;
import net.teamterminus.machineessentials.energy.electric.api.WireProperties;
import net.teamterminus.machineessentials.energy.electric.template.ElectricBlock;
import net.teamterminus.machineessentials.network.NetworkType;
import net.teamterminus.metest.energy.electric.block.entity.BlockEntityWire;

public class BlockWire extends ElectricBlock {

    @Getter
    protected final WireProperties properties;

    public BlockWire(Identifier identifier, Material material, WireProperties properties) {
        super(identifier, material);
        this.properties = properties;
    }

    @Override
    protected BlockEntity createBlockEntity() {
        return new BlockEntityWire();
    }

    @Override
    public NetworkType getType() {
        return NetworkType.ELECTRIC;
    }

    @Override
    public void onPlaced(World world, int x, int y, int z) {
        super.onPlaced(world, x, y, z);
        BlockEntityWire wire = (BlockEntityWire) world.getBlockEntity(x,y,z);
        wire.setProperties(properties);
    }
}
