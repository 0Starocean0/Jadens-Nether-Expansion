package net.jadenxgamer.netherexp.mixin.block;

import net.minecraft.core.BlockPos;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.BaseFireBlock;
import net.minecraft.world.level.block.state.BlockState;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(BaseFireBlock.class)
public class BaseFireBlockMixin {

    @Inject(
            method = "animateTick",
            at = @At(value = "HEAD"),
            cancellable = true
    )
    private void netherexp$animateTick(BlockState state, Level level, BlockPos pos, RandomSource random, CallbackInfo cir) {
    }
}
