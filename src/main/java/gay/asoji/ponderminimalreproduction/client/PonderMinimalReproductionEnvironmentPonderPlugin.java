package gay.asoji.ponderminimalreproduction.client;

import gay.asoji.ponderminimalreproduction.PonderMinimalReproduction;
import gay.asoji.ponderminimalreproduction.client.ponder.scenes.TestScene;
import gay.asoji.ponderminimalreproduction.common.PonderMinimalReproductionItems;
import net.createmod.ponder.api.registration.PonderPlugin;

import net.createmod.ponder.api.registration.PonderSceneRegistrationHelper;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;

import net.minecraft.server.packs.resources.Resource;

import org.jetbrains.annotations.NotNull;

public class PonderMinimalReproductionEnvironmentPonderPlugin implements PonderPlugin {
	@Override
	@NotNull
	public String getModId() {
		return PonderMinimalReproduction.ID;
	}

	@Override
	public void registerScenes(PonderSceneRegistrationHelper<ResourceLocation> helper) {
		ResourceLocation test = BuiltInRegistries.ITEM.getKey(PonderMinimalReproductionItems.TEST_PONDER_ITEM);

		helper.forComponents(test).addStoryBoard("template", TestScene::testScene);
	}
}
