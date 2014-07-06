package net.wormss.craftingapprenticeship.client.gui;

import net.minecraft.client.gui.GuiScreen;
import net.wormss.craftingapprenticeship.handlers.ConfigHandler;
import net.wormss.craftingapprenticeship.references.R;
import cpw.mods.fml.client.config.GuiConfig;

public class GuiMainScreenConfig extends GuiConfig {

	public GuiMainScreenConfig(GuiScreen parentScreen) {
		super(
			parentScreen,
			ConfigHandler.getGuiElements(),
			R.mod.ID,
			false,
			false,
			getAbridgedConfigPath(ConfigHandler.configPath())
		);
	}

}
