
package net.mcreator.idk.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.idk.item.VoidShovelItem;
import net.mcreator.idk.IdkModElements;

@IdkModElements.ModElement.Tag
public class VoidItemsItemGroup extends IdkModElements.ModElement {
	public VoidItemsItemGroup(IdkModElements instance) {
		super(instance, 24);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabvoid_items") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(VoidShovelItem.block);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
