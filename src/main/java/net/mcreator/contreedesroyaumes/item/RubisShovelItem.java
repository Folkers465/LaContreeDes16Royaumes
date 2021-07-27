
package net.mcreator.contreedesroyaumes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.contreedesroyaumes.itemgroup.CD16RItemGroup;
import net.mcreator.contreedesroyaumes.ContreeDesRoyaumesModElements;

@ContreeDesRoyaumesModElements.ModElement.Tag
public class RubisShovelItem extends ContreeDesRoyaumesModElements.ModElement {
	@ObjectHolder("contree_des_royaumes:rubis_shovel")
	public static final Item block = null;
	public RubisShovelItem(ContreeDesRoyaumesModElements instance) {
		super(instance, 52);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(RubisItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(CD16RItemGroup.tab)) {
		}.setRegistryName("rubis_shovel"));
	}
}
