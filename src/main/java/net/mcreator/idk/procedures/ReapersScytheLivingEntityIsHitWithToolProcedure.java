package net.mcreator.idk.procedures;

import net.minecraft.potion.EffectInstance;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;

import net.mcreator.idk.potion.VoidedPotionEffect;
import net.mcreator.idk.IdkMod;

import java.util.Map;

public class ReapersScytheLivingEntityIsHitWithToolProcedure {
	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				IdkMod.LOGGER.warn("Failed to load dependency entity for procedure ReapersScytheLivingEntityIsHitWithTool!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		if (entity instanceof LivingEntity)
			((LivingEntity) entity).addPotionEffect(new EffectInstance(VoidedPotionEffect.potion, (int) 2, (int) 1));
	}
}
