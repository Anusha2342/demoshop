package com.tricentisgenricutility;

import java.io.FileInputStream;

public class Fileutility {
public String getDataFromPropertyFile(String key) {
	FileInputStream fis =new FileInputStream("./src/test/resources");
	return key;
}
}
