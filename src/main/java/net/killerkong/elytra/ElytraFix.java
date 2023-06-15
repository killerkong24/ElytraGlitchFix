package net.killerkong.elytra;

import net.minecraft.client.MinecraftClient;


public class ElytraFix {
    public Boolean glitch = false;
    public static MinecraftClient mc = MinecraftClient.getInstance();
    public void ElytrFixer(){
        //runs per tick
        if (mc.player != null && mc.world != null) {
            glitch = false;
            if (mc.player.isOnGround() && mc.player.isFallFlying()) {
                glitch = true;

            }
        }
    }
}
