package net.jadenxgamer.netherexp.particle;

import net.fabricmc.fabric.api.particle.v1.FabricParticleTypes;
import net.jadenxgamer.netherexp.NetherExp;
import net.minecraft.particle.DefaultParticleType;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModParticles {

    // Particles
    public static final DefaultParticleType ENIGMA_PARTICLE = FabricParticleTypes.simple();
    public static final DefaultParticleType SMALL_SOUL_FLAME = FabricParticleTypes.simple();
    public static final DefaultParticleType GOLD_GLIMMER = FabricParticleTypes.simple();
    public static final DefaultParticleType REDSTONE_SPARK = FabricParticleTypes.simple();
    public static final DefaultParticleType FALLING_NETHER_WART = FabricParticleTypes.simple();
    public static final DefaultParticleType FALLING_WARPED_WART = FabricParticleTypes.simple();
    public static final DefaultParticleType FALLING_SHROOMLIGHT = FabricParticleTypes.simple();
    public static final DefaultParticleType FALLING_SHROOMNIGHT = FabricParticleTypes.simple();
    public static final DefaultParticleType RISING_SHROOMNIGHT = FabricParticleTypes.simple();
    public static final DefaultParticleType CRIMSON_SMOG = FabricParticleTypes.simple();
    public static final DefaultParticleType WARPED_SMOG = FabricParticleTypes.simple();
    public static final DefaultParticleType BLACK_SMOKE = FabricParticleTypes.simple();
    public static final DefaultParticleType WHITE_SMOKE = FabricParticleTypes.simple();
    public static final DefaultParticleType RED_SMOKE = FabricParticleTypes.simple();
    public static final DefaultParticleType SOUL_EMBER = FabricParticleTypes.simple();

    // Registering Particles
    public static void registerParticles() {
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "enigma_spore"),
                ENIGMA_PARTICLE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "small_soul_flame"),
                SMALL_SOUL_FLAME);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "gold_glimmer"),
                GOLD_GLIMMER);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "redstone_spark"),
                REDSTONE_SPARK);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "falling_nether_wart"),
                FALLING_NETHER_WART);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "falling_warped_wart"),
                FALLING_WARPED_WART);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "falling_shroomlight"),
                FALLING_SHROOMLIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "falling_shroomnight"),
                FALLING_SHROOMNIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "rising_shroomnight"),
                RISING_SHROOMNIGHT);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "crimson_smog"),
                CRIMSON_SMOG);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "warped_smog"),
                WARPED_SMOG);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "black_smoke"),
                BLACK_SMOKE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "white_smoke"),
                WHITE_SMOKE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "red_smoke"),
                RED_SMOKE);
        Registry.register(Registries.PARTICLE_TYPE, new Identifier(NetherExp.MOD_ID, "soul_ember"),
                SOUL_EMBER);

        NetherExp.LOGGER.debug("Registering Particles for " + NetherExp.MOD_ID);
    }
}
