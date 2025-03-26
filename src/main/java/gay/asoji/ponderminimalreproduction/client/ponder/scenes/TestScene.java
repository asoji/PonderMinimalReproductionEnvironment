package gay.asoji.ponderminimalreproduction.client.ponder.scenes;

import net.createmod.ponder.api.scene.SceneBuilder;
import net.createmod.ponder.api.scene.SceneBuildingUtil;
import net.minecraft.core.Direction;

public class TestScene {
	public static void testScene(SceneBuilder scene, SceneBuildingUtil util) {
		// Scene setup as a template
		scene.title("test_scene", "Test");
		scene.configureBasePlate(0, 0, 5);
		scene.world().showSection(util.select().layersFrom(0), Direction.DOWN);
		scene.setNextUpEnabled(false);
		scene.idle(20);
	}
}
