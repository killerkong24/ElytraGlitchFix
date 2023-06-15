package net.killerkong.elytra.mixin;

import net.killerkong.elytra.ElytraFix;
import net.minecraft.client.input.Input;
import net.minecraft.client.input.KeyboardInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(KeyboardInput.class)
public class KeyboardInputMixin extends Input {
    @Inject(method = "tick", at = @At("TAIL"))
    private void isPressed(boolean slowDown, float f, CallbackInfo ci) {
        ElytraFix ef = new ElytraFix();
        ef.ElytrFixer();
        if (ef.glitch){
            sneaking = true;
        }
    }
}
