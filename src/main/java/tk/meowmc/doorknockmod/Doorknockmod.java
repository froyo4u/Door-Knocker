package tk.meowmc.doorknockmod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.event.player.AttackBlockCallback;
import net.minecraft.block.*;
import net.minecraft.sound.SoundCategory;
import net.minecraft.tag.BlockTags;
import net.minecraft.util.ActionResult;
import net.minecraft.util.registry.Registry;

import java.util.List;

public class Doorknockmod implements ModInitializer {

    @Override
    public void onInitialize() {

        Registry.register(Registry.SOUND_EVENT, KnockSounds.DOOR_KNOCK, KnockSounds.DOOR_KNOCK_EVENT);
        Registry.register(Registry.SOUND_EVENT, KnockSounds.TRAPDOOR_KNOCK, KnockSounds.TRAPDOOR_KNOCK_EVENT);

        AttackBlockCallback.EVENT.register((player, world, hand, pos, direction) ->
        {
            BlockState state = world.getBlockState(pos);
            List<Block> doors = List.of(Blocks.DARK_OAK_DOOR, Blocks.OAK_DOOR, Blocks.ACACIA_DOOR, Blocks.BIRCH_DOOR, Blocks.IRON_DOOR, Blocks.CRIMSON_DOOR, Blocks.WARPED_DOOR, Blocks.SPRUCE_DOOR);
            List<Block> trapDoors = List.of(Blocks.ACACIA_TRAPDOOR, Blocks.BIRCH_TRAPDOOR, Blocks.CRIMSON_TRAPDOOR, Blocks.DARK_OAK_TRAPDOOR, Blocks.IRON_TRAPDOOR, Blocks.JUNGLE_TRAPDOOR, Blocks.OAK_TRAPDOOR, Blocks.SPRUCE_TRAPDOOR, Blocks.WARPED_TRAPDOOR);
            if (!player.isSpectator() && BlockTags.DOORS.contains(state.getBlock()))
                world.playSound(null, pos, KnockSounds.DOOR_KNOCK_EVENT, SoundCategory.BLOCKS, 1f, 1f);
            if (!player.isSpectator() && BlockTags.TRAPDOORS.contains(state.getBlock()))
                world.playSound(null, pos, KnockSounds.TRAPDOOR_KNOCK_EVENT, SoundCategory.BLOCKS, 1f, 1f);


            return ActionResult.PASS;
        });
   }
}
