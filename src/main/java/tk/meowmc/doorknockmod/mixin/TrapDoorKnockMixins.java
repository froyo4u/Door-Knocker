package tk.meowmc.doorknockmod.mixin;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.sound.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.spongepowered.asm.mixin.Mixin;
import tk.meowmc.doorknockmod.KnockSounds;

@Mixin(TrapdoorBlock.class)
public abstract class TrapDoorKnockMixins extends Block {

    public TrapDoorKnockMixins(Settings settings) {
        super(settings);
    }

    @Override
    public void onBlockBreakStart(BlockState state, World world, BlockPos pos, PlayerEntity player) {
        world.playSound(null, pos, KnockSounds.TRAPDOOR_KNOCK_EVENT, SoundCategory.BLOCKS, 1f, 1f);
    }
}
