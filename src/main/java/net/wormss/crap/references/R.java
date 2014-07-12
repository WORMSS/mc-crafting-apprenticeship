package net.wormss.crap.references;

public final class R {
	private static final String PACKAGE = "net.wormss.crap";
	public static final class mod {
		public static final String ID = "CrAp";
		private static final String id = ID.toLowerCase();
		public static final String NAME = "Crafting Apprenticeship";
		public static final String VERSION = "1.7.10-1.0";
		public static final String GUI_FACTORY = PACKAGE + ".client.gui.GuiFactory";
	}

	public static final class proxy {
		public static final String CLIENT = PACKAGE + ".proxy.ClientProxy";
		public static final String SERVER = PACKAGE + ".proxy.ServerProxy";
	}

	public static final class config {
		public static final String VALUE = "configValue";
	}
	
	public static final class tabs {
		private static final String PREFIX = mod.id + ":";
		private static final String POSTFIX = ".name";
		public static final String general = PREFIX + "general" + POSTFIX;
	}
}

	