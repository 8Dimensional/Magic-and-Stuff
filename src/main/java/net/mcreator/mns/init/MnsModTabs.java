
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.mns.MnsMod;

public class MnsModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MnsMod.MODID);
	public static final RegistryObject<CreativeModeTab> MAGICAND_STUFF = REGISTRY.register("magicand_stuff",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.mns.magicand_stuff")).icon(() -> new ItemStack(Items.WRITTEN_BOOK)).displayItems((parameters, tabData) -> {
				tabData.accept(MnsModItems.WOODEN_WAND.get());
				tabData.accept(MnsModItems.RESIN.get());
			})

					.build());
}
