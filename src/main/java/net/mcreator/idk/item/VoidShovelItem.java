
package net.mcreator.idk.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.idk.itemgroup.VoidItemsItemGroup;
import net.mcreator.idk.IdkModElements;

@IdkModElements.ModElement.Tag
public class VoidShovelItem extends IdkModElements.ModElement {
	@ObjectHolder("idk:void_shovel")
	public static final Item block = null;
	public VoidShovelItem(IdkModElements instance) {
		super(instance, 15);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 5000;
			}

			public float getEfficiency() {
				return 100f;
			}

			public float getAttackDamage() {
				return 2f;
			}

			public int getHarvestLevel() {
				return 100000;
			}

			public int getEnchantability() {
				return 1;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(VoiddustItem.block));
			}
		}, 1, -3f, new Item.Properties().group(VoidItemsItemGroup.tab).isImmuneToFire()) {
		}.setRegistryName("void_shovel"));
	}
}
