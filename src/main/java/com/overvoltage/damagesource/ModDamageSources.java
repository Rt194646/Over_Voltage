package com.overvoltage.damagesource;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.damagesource.DamageType;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;


public final class ModDamageSources {

    public static DamageSource create(Level level, ResourceKey<DamageType> key) {
        return new DamageSource(level.registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(key));
    }

    private static DamageSource create(Entity attacker, Entity directEntity, ResourceKey<DamageType> key) {
        return new DamageSource(
                attacker.level().registryAccess().registryOrThrow(Registries.DAMAGE_TYPE).getHolderOrThrow(key),
                directEntity,
                attacker
        );
    }

    public static DamageSource nuclearBlast(Level level) { return create(level, ModDamageTypes.NUCLEAR_BLAST); }
    public static DamageSource radiation(Level level) { return create(level, ModDamageTypes.RADIATION); }
    public static DamageSource acid(Level level) { return create(level, ModDamageTypes.ACID); }
    public static DamageSource rubble(Level level) { return create(level, ModDamageTypes.RUBBLE); }
    public static DamageSource blackHole(Level level) { return create(level, ModDamageTypes.BLACK_HOLE); }
    public static DamageSource meteorite(Level level) { return create(level, ModDamageTypes.METEORITE); }
    public static DamageSource building(Level level) { return create(level, ModDamageTypes.BUILDING); }
    public static DamageSource cloud(Level level) { return create(level, ModDamageTypes.CLOUD); }
    public static DamageSource electricity(Level level) { return create(level, ModDamageTypes.ELECTRICITY); }
    public static DamageSource exhaust(Level level) { return create(level, ModDamageTypes.EXHAUST); }
    public static DamageSource spikes(Level level) { return create(level, ModDamageTypes.SPIKES); }
    public static DamageSource monoxide(Level level) { return create(level, ModDamageTypes.MONOXIDE); }
    public static DamageSource asbestos(Level level) { return create(level, ModDamageTypes.ASBESTOS); }
    public static DamageSource blacklung(Level level) { return create(level, ModDamageTypes.BLACKLUNG); }
    public static DamageSource vacuum(Level level) { return create(level, ModDamageTypes.VACUUM); }
    public static DamageSource microwave(Level level) { return create(level, ModDamageTypes.MICROWAVE); }

    public static DamageSource revolverBullet(Level level) { return create(level, ModDamageTypes.REVOLVER_BULLET); }
    public static DamageSource chopperBullet(Level level) { return create(level, ModDamageTypes.CHOPPER_BULLET); }
    public static DamageSource tau(Level level) { return create(level, ModDamageTypes.TAU); }
    public static DamageSource plasma(Level level) { return create(level, ModDamageTypes.PLASMA); }
    public static DamageSource laser(Level level) { return create(level, ModDamageTypes.LASER); }
    public static DamageSource flamethrower(Level level) { return create(level, ModDamageTypes.FLAMETHROWER); }

    public static DamageSource electrified(Level level) { return create(level, ModDamageTypes.ELECTRIFIED); }
    public static DamageSource acidPlayer(Level level) { return create(level, ModDamageTypes.ACID_PLAYER); }
}
