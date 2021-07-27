
package net.mcreator.contreedesroyaumes.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.contreedesroyaumes.itemgroup.CD16RItemGroup;
import net.mcreator.contreedesroyaumes.ContreeDesRoyaumesModElements;

@ContreeDesRoyaumesModElements.ModElement.Tag
public class SaphirAxeItem extends ContreeDesRoyaumesModElements.ModElement {
	@ObjectHolder("contree_des_royaumes:saphir_axe")
	public static final Item block = null;
	public SaphirAxeItem(ContreeDesRoyaumesModElements instance) {
		super(instance, 71);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
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
				return Ingredient.fromStacks(new ItemStack(SaphirItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(CD16RItemGroup.tab)) {
		}.setRegistryName("saphir_axe"));
	}
}
