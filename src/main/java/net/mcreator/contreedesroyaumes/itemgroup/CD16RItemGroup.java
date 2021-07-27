
package net.mcreator.contreedesroyaumes.itemgroup;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;

import net.mcreator.contreedesroyaumes.item.VibraniumSwordItem;
import net.mcreator.contreedesroyaumes.ContreeDesRoyaumesModElements;

@ContreeDesRoyaumesModElements.ModElement.Tag
public class CD16RItemGroup extends ContreeDesRoyaumesModElements.ModElement {
	public CD16RItemGroup(ContreeDesRoyaumesModElements instance) {
		super(instance, 108);
	}

	@Override
	public void initElements() {
		tab = new ItemGroup("tabcd_16_r") {
			@OnlyIn(Dist.CLIENT)
			@Override
			public ItemStack createIcon() {
				return new ItemStack(VibraniumSwordItem.block, (int) (1));
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundImageName("item_search.png");
	}
	public static ItemGroup tab;
}
