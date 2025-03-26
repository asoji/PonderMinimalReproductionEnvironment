package gay.asoji.ponderminimalreproduction.common;

import gay.asoji.ponderminimalreproduction.PonderMinimalReproduction;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

import java.util.Objects;

public class PonderMinimalReproductionItemGroup {
	 public static final ResourceKey<CreativeModeTab> ITEM_GROUP_KEY = ResourceKey.create(BuiltInRegistries.CREATIVE_MODE_TAB.key(), ResourceLocation.fromNamespaceAndPath(PonderMinimalReproduction.ID, "item_group"));
	 public static final CreativeModeTab ITEM_GROUP = FabricItemGroup.builder()
			 .icon(() -> new ItemStack(PonderMinimalReproductionItems.TEST_PONDER_ITEM))
			 .title(Component.literal("Ponder Minimal Reproduction"))
			 .build();

	 public static void init() {
		 Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, ITEM_GROUP_KEY, ITEM_GROUP);

		 ItemGroupEvents.modifyEntriesEvent(ITEM_GROUP_KEY).register(itemGroup -> {
			 itemGroup.prepend(PonderMinimalReproductionItems.TEST_PONDER_ITEM);
		 });
	 }
}
