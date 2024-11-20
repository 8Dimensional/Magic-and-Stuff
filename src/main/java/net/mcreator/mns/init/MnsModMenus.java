
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import net.mcreator.mns.world.inventory.GuidescrollGUIMenu;
import net.mcreator.mns.MnsMod;

public class MnsModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, MnsMod.MODID);
	public static final RegistryObject<MenuType<GuidescrollGUIMenu>> GUIDESCROLL_GUI = REGISTRY.register("guidescroll_gui", () -> IForgeMenuType.create(GuidescrollGUIMenu::new));
}
