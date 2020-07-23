package com.triumvirate.lmnts.init;

import com.triumvirate.lmnts.LMNts;
import com.triumvirate.lmnts.LMNts.ModItemGroup;

import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, LMNts.MOD_ID);
	
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", () -> new Item(new Item.Properties().group(ModItemGroup.lmnts).maxStackSize(64)));
}
