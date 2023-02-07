package com.chikoritalover.caffeinated;

import com.chikoritalover.caffeinated.registry.*;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Caffeinated implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MODID = "caffeinated";
	public static final Logger LOGGER = LoggerFactory.getLogger("modid");

	@Override
	public void onInitialize() {
		ModBannerPatterns.initAndGetDefault(Registry.BANNER_PATTERN);
		ModBlocks.register();
		ModBlocks.registerFlammableBlocks();
		ModCauldronBehavior.register();
		ModItems.register();
		ModItems.registerCompostingChances();
		ModParticleTypes.register();
		ModPlacedFeatures.register();
		ModSoundEvents.register();
		ModStatusEffects.register();
		ModTradeOffers.register();
	}
}
