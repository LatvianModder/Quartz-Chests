package dev.latvian.mods.quartzchests.item;

import dev.latvian.mods.quartzchests.QuartzChests;
import dev.latvian.mods.quartzchests.block.QuartzChestsBlocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * @author LatvianModder
 */
public class QuartzChestsItems
{
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "quartzchests");
	public static final ItemGroup ITEM_GROUP = new ItemGroup("quartzchests")
	{
		@Override
		@OnlyIn(Dist.CLIENT)
		public ItemStack createIcon()
		{
			return new ItemStack(CHEST.get());
		}
	};

	public static final RegistryObject<Item> CHEST = ITEMS.register("chest", () -> {
		Item.Properties properties = new Item.Properties().group(ITEM_GROUP).maxStackSize(16);
		QuartzChests.proxy.setISTER(properties);
		return new BlockItem(QuartzChestsBlocks.CHEST.get(), properties);
	});

	public static final RegistryObject<Item> UPGRADE = ITEMS.register("upgrade", () -> new Item(new Item.Properties().group(ITEM_GROUP)));
	public static final RegistryObject<Item> KEEP_INVENTORY_UPGRADE = ITEMS.register("keep_inventory_upgrade", () -> new Item(new Item.Properties().group(ITEM_GROUP)));
	public static final RegistryObject<Item> GLOWING_TEXT_UPGRADE = ITEMS.register("glowing_text_upgrade", () -> new Item(new Item.Properties().group(ITEM_GROUP)));
	public static final RegistryObject<Item> BOLD_TEXT_UPGRADE = ITEMS.register("bold_text_upgrade", () -> new Item(new Item.Properties().group(ITEM_GROUP)));
	public static final RegistryObject<Item> ITALIC_TEXT_UPGRADE = ITEMS.register("italic_text_upgrade", () -> new Item(new Item.Properties().group(ITEM_GROUP)));
}