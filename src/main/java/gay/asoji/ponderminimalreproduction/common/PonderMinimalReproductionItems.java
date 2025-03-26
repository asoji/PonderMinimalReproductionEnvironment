package gay.asoji.ponderminimalreproduction.common;

import gay.asoji.ponderminimalreproduction.PonderMinimalReproduction;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;

public class PonderMinimalReproductionItems {
	public static final Item TEST_PONDER_ITEM = register(new Item(new Item.Properties()), "test_ponder");

	public static Item register(Item item, String name) {
		ResourceLocation itemId = ResourceLocation.fromNamespaceAndPath(PonderMinimalReproduction.ID, name);
		return Registry.register(BuiltInRegistries.ITEM, itemId, item);
	}

	public static void init() { }
}
