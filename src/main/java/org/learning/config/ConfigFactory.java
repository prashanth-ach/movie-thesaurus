package org.learning.config;

import java.io.IOException;
import java.util.Properties;

public class ConfigFactory {

	private static ConfigFactory conf = new ConfigFactory();
	private Properties properties;

	private ConfigFactory() {
		properties = new Properties();
		try {
			properties.load(ConfigFactory.class.getResourceAsStream("/conf/config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static ConfigFactory getConf() {
		return conf;
	}

	public static void main(String[] args) {

	}

}
