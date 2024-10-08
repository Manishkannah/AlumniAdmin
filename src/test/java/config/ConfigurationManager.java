package config;

import org.aeonbits.owner.ConfigCache;

public class ConfigurationManager {
	
	
	public static Configuration readConfig() {
		
		return	ConfigCache.getOrCreate(Configuration.class);
		
		
	}

}
