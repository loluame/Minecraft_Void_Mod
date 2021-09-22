
package net.mcreator.idk.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.idk.item.VoidBladeItem;
import net.mcreator.idk.IdkModElements;

@IdkModElements.ModElement.Tag
public class VoiddedEnchantment extends IdkModElements.ModElement {
	@ObjectHolder("idk:voidded")
	public static final Enchantment enchantment = null;
	public VoiddedEnchantment(IdkModElements instance) {
		super(instance, 9);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("voidded"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.VERY_RARE, EnchantmentType.WEAPON, slots);
		}

		@Override
		public int getMinLevel() {
			return 30;
		}

		@Override
		public int getMaxLevel() {
			return 1;
		}

		@Override
		protected boolean canApplyTogether(Enchantment ench) {
			if (ench == Enchantments.MENDING)
				return true;
			if (ench == Enchantments.SHARPNESS)
				return true;
			return false;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == VoidBladeItem.block)
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return false;
		}

		@Override
		public boolean canGenerateInLoot() {
			return false;
		}

		@Override
		public boolean canVillagerTrade() {
			return false;
		}
	}
}
