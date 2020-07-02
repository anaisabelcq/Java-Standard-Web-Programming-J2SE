package ar.com.educacionit.generics;

import ar.com.educacionit.generics.enums.IParserable;

public abstract class FileParser<T> implements IParserable{

	private String sourceFilePath;
	
	public FileParser() {
	}
	
	public FileParser(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}
	
	public abstract T parse();

	public String getSourceFilePath() {
		return sourceFilePath;
	}

	public void setSourceFilePath(String sourceFilePath) {
		this.sourceFilePath = sourceFilePath;
	}
}
