package net.mcreator.legions.procedures;

import net.minecraft.potion.Effects;
import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.legions.LegionsModElements;

import java.util.Map;

@LegionsModElements.ModElement.Tag
public class EnderSwordToolInInventoryTickProcedure extends LegionsModElements.ModElement {
	public EnderSwordToolInInventoryTickProcedure(LegionsModElements instance) {
		super(instance, 28);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				System.err.println("Failed to load dependency entity for procedure EnderSwordToolInInventoryTick!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(Effects.HEALTH_BOOST, (int) 1e+163, (int) 4));
	}
}
