package gay.asoji.ponderminimalreproduction;

import gay.asoji.ponderminimalreproduction.common.PonderMinimalReproductionItemGroup;
import gay.asoji.ponderminimalreproduction.common.PonderMinimalReproductionItems;
import net.fabricmc.api.ModInitializer;

import net.minecraft.resources.ResourceLocation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PonderMinimalReproduction implements ModInitializer {
	public static final String ID = "ponderminimalreproduction";
	public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {
		PonderMinimalReproductionItems.init();
		PonderMinimalReproductionItemGroup.init();
	}

	public static ResourceLocation id(String path) {
		return ResourceLocation.fromNamespaceAndPath(ID, path);
	}
}
