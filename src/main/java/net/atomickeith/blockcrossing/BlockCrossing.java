package net.atomickeith.blockcrossing;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlockCrossing implements ModInitializer {
	public static final String MOD_ID = "blockcrossing";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		LOGGER.info("Hello Fabric World!");
	}
}