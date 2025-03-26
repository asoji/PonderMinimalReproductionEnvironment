package gay.asoji.ponderminimalreproduction.client;

import net.createmod.ponder.foundation.PonderIndex;
import net.fabricmc.api.ClientModInitializer;

public class PonderMinimalReproductionClient implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		PonderIndex.addPlugin(new PonderMinimalReproductionEnvironmentPonderPlugin());
	}
}
