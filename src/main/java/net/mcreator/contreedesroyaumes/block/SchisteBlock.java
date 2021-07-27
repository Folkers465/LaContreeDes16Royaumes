
package net.mcreator.contreedesroyaumes.block;

import net.minecraftforge.registries.ObjectHolder;
import net.minecraftforge.common.ToolType;

import net.minecraft.loot.LootContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.BlockItem;
import net.minecraft.block.material.Material;
import net.minecraft.block.SoundType;
import net.minecraft.block.BlockState;
import net.minecraft.block.Block;

import net.mcreator.contreedesroyaumes.itemgroup.CD16RItemGroup;
import net.mcreator.contreedesroyaumes.ContreeDesRoyaumesModElements;

import java.util.List;
import java.util.Collections;

@ContreeDesRoyaumesModElements.ModElement.Tag
public class SchisteBlock extends ContreeDesRoyaumesModElements.ModElement {
	@ObjectHolder("contree_des_royaumes:schiste")
	public static final Block block = null;
	public SchisteBlock(ContreeDesRoyaumesModElements instance) {
		super(instance, 107);
	}

	@Override
	public void initElements() {
		elements.blocks.add(() -> new CustomBlock());
		elements.items.add(() -> new BlockItem(block, new Item.Properties().group(CD16RItemGroup.tab)).setRegistryName(block.getRegistryName()));
	}
	public static class CustomBlock extends Block {
		public CustomBlock() {
			super(Block.Properties.create(Material.ROCK).sound(SoundType.STONE).hardnessAndResistance(1f, 30f).setLightLevel(s -> 0).harvestLevel(1)
					.harvestTool(ToolType.PICKAXE).setRequiresTool());
			setRegistryName("schiste");
		}

		@Override
		public List<ItemStack> getDrops(BlockState state, LootContext.Builder builder) {
			List<ItemStack> dropsOriginal = super.getDrops(state, builder);
			if (!dropsOriginal.isEmpty())
				return dropsOriginal;
			return Collections.singletonList(new ItemStack(this, 1));
		}
	}
}
