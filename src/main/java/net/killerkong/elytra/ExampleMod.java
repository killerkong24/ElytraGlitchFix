package net.killerkong.elytra;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ExampleMod implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("ElytraFix");

	@Override
	public void onInitialize() {
		LOGGER.info("Elytra Glitch Fixed");
	}
}
