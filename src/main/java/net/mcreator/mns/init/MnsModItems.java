
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.mns.item.WoodenWandItem;
import net.mcreator.mns.item.SpellTomeItem;
import net.mcreator.mns.item.ResinItem;
import net.mcreator.mns.MnsMod;

public class MnsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MnsMod.MODID);
	public static final RegistryObject<Item> WOODEN_WAND = REGISTRY.register("wooden_wand", () -> new WoodenWandItem());
	public static final RegistryObject<Item> RESIN = REGISTRY.register("resin", () -> new ResinItem());
	public static final RegistryObject<Item> PITCHERPOD = block(MnsModBlocks.PITCHERPOD);
	public static final RegistryObject<Item> SPELL_TOME = REGISTRY.register("spell_tome", () -> new SpellTomeItem());

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
