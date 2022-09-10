
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.my.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import net.mcreator.my.block.AsdBlock;
import net.mcreator.my.MyMod;

public class MyModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, MyMod.MODID);
	public static final RegistryObject<Block> ASD = REGISTRY.register("asd", () -> new AsdBlock());
}
