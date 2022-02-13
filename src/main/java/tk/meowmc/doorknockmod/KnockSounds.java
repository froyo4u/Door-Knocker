package tk.meowmc.doorknockmod;

import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class KnockSounds {
    public static final Identifier DOOR_KNOCK = new Identifier("doorknockmod:door_knock");
    public static SoundEvent DOOR_KNOCK_EVENT = new SoundEvent(DOOR_KNOCK);
    public static final Identifier TRAPDOOR_KNOCK = new Identifier("doorknockmod:trapdoor_knock");
    public static SoundEvent TRAPDOOR_KNOCK_EVENT = new SoundEvent(TRAPDOOR_KNOCK);
}
