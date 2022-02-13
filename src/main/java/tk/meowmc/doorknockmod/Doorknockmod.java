package tk.meowmc.doorknockmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;

public class Doorknockmod implements ModInitializer {

    @Override
    public void onInitialize() {

        Registry.register(Registry.SOUND_EVENT, KnockSounds.DOOR_KNOCK, KnockSounds.DOOR_KNOCK_EVENT);
        Registry.register(Registry.SOUND_EVENT, KnockSounds.TRAPDOOR_KNOCK, KnockSounds.TRAPDOOR_KNOCK_EVENT);
   }
}
