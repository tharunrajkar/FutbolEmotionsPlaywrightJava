package com.Utills;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {
	Properties properties = new Properties();

	ConfigurationReader() throws IOException {
		File f = new File(
				"/Users/saranrajraju/Documents/Current Project/FutbolEmotions/src/test/resources/com/config.properties");
		FileInputStream fileInputStream = new FileInputStream(f);
		properties = new Properties();
		properties.load(fileInputStream);

	}

	public String getBrowser() {
		String browser = properties.getProperty("browser");
		return browser;

	}

	public String getURL() {
		String URL = properties.getProperty("url");
		return URL;
	}
}
