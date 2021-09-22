
package net.mcreator.idk.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.idk.itemgroup.VoidItemsItemGroup;
import net.mcreator.idk.IdkModElements;

@IdkModElements.ModElement.Tag
public class VoidAxe1Item extends IdkModElements.ModElement {
	@ObjectHolder("idk:void_axe_1")
	public static final Item block = null;
	public VoidAxe1Item(IdkModElements instance) {
		super(instance, 47);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 10000;
			}

			public float getEfficiency() {
				return 20f;
			}

			public float getAttackDamage() {
				return 18f;
			}

			public int getHarvestLevel() {
				return 10;
			}

			public int getEnchantability() {
				return 2;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(VoidIngotItem.block));
			}
		}, 1, -3f, new Item.Properties().group(VoidItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("void_axe_1"));
	}
}
