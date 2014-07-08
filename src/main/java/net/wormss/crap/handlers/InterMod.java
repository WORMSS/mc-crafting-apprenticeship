package net.wormss.crap.handlers;

import net.wormss.crap.references.R;
import net.wormss.crap.references.Strings;
import cpw.mods.fml.common.event.FMLInterModComms;

public class InterMod {
	public static class version_checker {
		private static final String NAME = "VersionChecker";
		private static final String ADD_VERSION_CHECK = "addVersionCheck";
		
		public static void addVersionCheck() {
			FMLInterModComms.sendRuntimeMessage(R.mod.ID, NAME, ADD_VERSION_CHECK, Strings.url.VERSION_CHECKER);
		}
	}
}
