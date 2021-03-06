
package net.mcreator.legions.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;
import net.minecraft.item.AxeItem;

import net.mcreator.legions.LegionsModElements;

@LegionsModElements.ModElement.Tag
public class CeriuliumAxeItem extends LegionsModElements.ModElement {
	@ObjectHolder("legions:ceriulium_axe")
	public static final Item block = null;
	public CeriuliumAxeItem(LegionsModElements instance) {
		super(instance, 12);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new AxeItem(new IItemTier() {
			public int getMaxUses() {
				return 4000;
			}

			public float getEfficiency() {
				return 9f;
			}

			public float getAttackDamage() {
				return 12f;
			}

			public int getHarvestLevel() {
				return 9;
			}

			public int getEnchantability() {
				return 25;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(CeriuliumIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(ItemGroup.TOOLS)) {
		}.setRegistryName("ceriulium_axe"));
	}
}
