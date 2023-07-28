package com.ordana.bbs.mixins;

import com.ordana.bbs.ModSoundTypes;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin(Block.class)
public abstract class SoundsMixin {
    @Shadow
    protected abstract Block asBlock();

    @Inject(method = "getSoundType", at = @At("TAIL"), cancellable = true)
    private void getSoundGroupMixin(CallbackInfoReturnable<SoundType> cir){
        cir.setReturnValue(ModSoundTypes.assignSounds(this.asBlock(), cir));
    }
}