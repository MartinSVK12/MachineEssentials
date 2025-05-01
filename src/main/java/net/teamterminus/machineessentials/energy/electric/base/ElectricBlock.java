package net.teamterminus.machineessentials.energy.electric.base;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.modificationstation.stationapi.api.template.block.TemplateBlockWithEntity;
import net.modificationstation.stationapi.api.util.Identifier;

public abstract class ElectricBlock extends TemplateBlockWithEntity {

    public ElectricBlock(Identifier identifier, Material material) {
        super(identifier, material);
    }

}
