package com.bgsoftware.wildstacker.nms.v1_19_R1.mappings.net.minecraft.world.level.block.state;

import com.bgsoftware.common.remaps.Remap;
import com.bgsoftware.wildstacker.nms.v1_19_R1.mappings.MappedObject;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class IBlockData extends MappedObject<net.minecraft.world.level.block.state.IBlockData> {

    public IBlockData(net.minecraft.world.level.block.state.IBlockData handle) {
        super(handle);
    }

    @Remap(classPath = "net.minecraft.world.level.block.state.BlockBehaviour$BlockStateBase",
            name = "getBlock",
            type = Remap.Type.METHOD,
            remappedName = "b")
    public Block getBlock() {
        return handle.b();
    }

    @Remap(classPath = "net.minecraft.world.level.block.state.BlockBehaviour$BlockStateBase",
            name = "is",
            type = Remap.Type.METHOD,
            remappedName = "a")
    public boolean is(TagKey<Block> tag) {
        return handle.a(tag);
    }

    @Remap(classPath = "net.minecraft.world.level.block.state.BlockBehaviour$BlockStateBase",
            name = "isAir",
            type = Remap.Type.METHOD,
            remappedName = "h")
    public boolean isAir() {
        return handle.h();
    }

}
