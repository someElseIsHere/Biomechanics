package flaxbeard.cyberware.common.organ.type;

import flaxbeard.cyberware.api.OrganType;
import flaxbeard.cyberware.api.registry.OrganTypeRegistry;
import flaxbeard.cyberware.common.CWDamageTypes;
import flaxbeard.cyberware.common.effect.CWEffects;
import flaxbeard.cyberware.common.organ.slot.CWOrganSlots;
import net.minecraft.core.Holder;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.damagesource.DamageSource;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;

import static flaxbeard.cyberware.Cyberware.MODID;

public class CWOrganTypes {
    public static final OrganType HEART = register(
            "heart",
            new OrganType(
                    CWOrganSlots.HEART,
                    true,
                    (player) -> {
                        player.hurt(new DamageSource(new Holder.Direct<>(CWDamageTypes.NO_HEART)), Float.MAX_VALUE);
                    },
                    null
            )
    );
    public static final OrganType EYES = register(
            "eyes",
            new OrganType(
                    CWOrganSlots.EYES,
                    true,
                    (player) -> {
                        player.addEffect(new MobEffectInstance(MobEffects.BLINDNESS, 25, 0, false, false));
                    },
                    null
            )
    );
    public static final OrganType BRAIN = register(
            "brain",
            new OrganType(
                    CWOrganSlots.CRANIUM,
                    true,
                    (player) -> {
                        player.hurt(new DamageSource(new Holder.Direct<>(CWDamageTypes.NO_BRAIN)), Float.MAX_VALUE);
                    },
                    null
            )
    );
    public static final OrganType LUNGS = register(
            "lungs",
            new OrganType(
                    CWOrganSlots.LUNGS,
                    true,
                    (player) -> {
                        player.addEffect(new MobEffectInstance(CWEffects.NO_LUNGS.get(), 1, 0, false, false));
                    },
                    null
            )
    );

    public static OrganType register(String id, OrganType organType) {
        OrganTypeRegistry.register(new ResourceLocation(MODID, id), organType);
        return organType;
    }
    public static void register() {}
}
