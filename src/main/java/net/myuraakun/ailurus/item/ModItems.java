package net.myuraakun.ailurus.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.myuraakun.ailurus.Ailurus;

public class ModItems {

	public static final Item HEMP = registerItem("hemp", new Item(new FabricItemSettings().group(ModItemGroup.NATURAL)));
	public static final Item HEMP_SEEDS = registerItem("hemp_seeds", new Item(new FabricItemSettings().group(ModItemGroup.NATURAL)));
	public static final Item HEMP_BUDS = registerItem("hemp_buds", new Item(new FabricItemSettings().group(ModItemGroup.NATURAL)));
	public static final Item HEMP_BUDS_DRY = registerItem("hemp_buds_dry", new Item(new FabricItemSettings().group(ModItemGroup.NATURAL)));
	public static final Item HEMP_FABRIC = registerItem("hemp_fabric", new Item(new FabricItemSettings().group(ModItemGroup.NATURAL)));

	private static Item registerItem(String name, Item item) {
		return Registry.register(Registry.ITEM, new Identifier(Ailurus.MOD_ID, name), item);
	}

	public static void registerModItems() {
		Ailurus.LOGGER.info("registering items for " + Ailurus.MOD_ID);
	}
}
