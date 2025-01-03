
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.instanthouse.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.Item;

import net.mcreator.instanthouse.item.OakHouseItem;
import net.mcreator.instanthouse.InstanthouseMod;

public class InstanthouseModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InstanthouseMod.MODID);
	public static final RegistryObject<Item> OAK_HOUSE = REGISTRY.register("oak_house", () -> new OakHouseItem());
	// Start of user code block custom items
	// End of user code block custom items
}
