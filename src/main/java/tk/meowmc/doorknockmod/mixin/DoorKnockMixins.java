package tk.meowmc.doorknockmod.mixin;

import net.minecraft.block.*;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import tk.meowmc.doorknockmod.KnockSounds;

@Mixin(DoorBlock.class)
public abstract class DoorKnockMixins extends Block {

    public DoorKnockMixins(Settings settings) {
        super(settings);
    }

    @Override
        public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player){
        world.playSound(null, pos, KnockSounds.DOOR_KNOCK_EVENT, SoundCategory.BLOCKS, 1f, 1f);
    }
}
