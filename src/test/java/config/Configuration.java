package config;

import org.aeonbits.owner.Config;

public interface Configuration extends Config {
	
	@Key("createnewelection.createButton.linktext")
	String getCreateElectionButton();

}
