package net.myuraakun.ailurus.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.myuraakun.ailurus.Ailurus;

public class ModItemGroup {
	public static final ItemGroup NATURAL = FabricItemGroupBuilder.build(new Identifier(Ailurus.MOD_ID, "natural"),
			() -> new ItemStack(ModItems.HEMP));
}
