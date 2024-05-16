package com.Utills;

import java.io.IOException;

public class FileReaderManger {
	private FileReaderManger() {

	}

	public static FileReaderManger getInstance() {
		FileReaderManger reader = new FileReaderManger();
		return reader;

	}

	public ConfigurationReader getInstanceConfig() throws IOException {
		ConfigurationReader Reader = new ConfigurationReader();
		return Reader;

	}

}
