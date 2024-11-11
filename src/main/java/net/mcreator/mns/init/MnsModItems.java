
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.mns.item.WoodenWandItem;
import net.mcreator.mns.MnsMod;

public class MnsModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, MnsMod.MODID);
	public static final RegistryObject<Item> WOODEN_WAND = REGISTRY.register("wooden_wand", () -> new WoodenWandItem());
	// Start of user code block custom items
	// End of user code block custom items
}
