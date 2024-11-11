
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.mns.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.mns.block.PitcherpodBlock;
import net.mcreator.mns.MnsMod;

public class MnsModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MnsMod.MODID);
	public static final RegistryObject<Block> PITCHERPOD = REGISTRY.register("pitcherpod", () -> new PitcherpodBlock());
	// Start of user code block custom blocks
	// End of user code block custom blocks
}
