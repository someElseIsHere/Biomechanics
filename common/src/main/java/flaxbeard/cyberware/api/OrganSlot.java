package flaxbeard.cyberware.api;

import net.minecraft.resources.ResourceLocation;

public class OrganSlot {
    public ResourceLocation icon;
    public OrganSlot(ResourceLocation resourceLocation){
        this.icon = new ResourceLocation(
                resourceLocation.getNamespace(), "textures/gui/organ_slots/" + resourceLocation.getPath() + ".png"
        );
    }
}