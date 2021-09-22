
package net.mcreator.idk.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.util.ResourceLocation;
import net.minecraft.item.Rarity;
import net.minecraft.item.MusicDiscItem;
import net.minecraft.item.Item;

import net.mcreator.idk.itemgroup.MusicItemGroup;
import net.mcreator.idk.IdkModElements;

@IdkModElements.ModElement.Tag
public class UnionItem extends IdkModElements.ModElement {
	@ObjectHolder("idk:union")
	public static final Item block = null;
	public UnionItem(IdkModElements instance) {
		super(instance, 13);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new MusicDiscItemCustom());
	}
	public static class MusicDiscItemCustom extends MusicDiscItem {
		public MusicDiscItemCustom() {
			super(0, IdkModElements.sounds.get(new ResourceLocation("idk:disc1")),
					new Item.Properties().group(MusicItemGroup.tab).maxStackSize(1).rarity(Rarity.RARE));
			setRegistryName("union");
		}
	}
}
