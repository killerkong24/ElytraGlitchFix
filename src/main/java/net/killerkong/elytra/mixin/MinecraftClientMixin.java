package net.killerkong.elytra.mixin;

import net.killerkong.elytra.ElytraFix;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(MinecraftClient.class)
public class MinecraftClientMixin {
	@Inject(at = @At("HEAD"), method = "tick")
	public void onTick(CallbackInfo ci) {
		ElytraFix ef = new ElytraFix();
		ef.ElytrFixer();
	}
}
