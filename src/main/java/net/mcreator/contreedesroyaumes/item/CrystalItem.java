
package net.mcreator.contreedesroyaumes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.contreedesroyaumes.itemgroup.CD16RItemGroup;
import net.mcreator.contreedesroyaumes.ContreeDesRoyaumesModElements;

@ContreeDesRoyaumesModElements.ModElement.Tag
public class CrystalItem extends ContreeDesRoyaumesModElements.ModElement {
	@ObjectHolder("contree_des_royaumes:crystal")
	public static final Item block = null;
	public CrystalItem(ContreeDesRoyaumesModElements instance) {
		super(instance, 85);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(CD16RItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("crystal");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
