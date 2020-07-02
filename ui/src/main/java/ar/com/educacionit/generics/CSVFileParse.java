package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.CSV;

public class CSVFileParse extends FileParser<CSV> {

	public CSVFileParse() {
		super();
	}
	public CSVFileParse(String sourceFilePath) {
		super(sourceFilePath);
	}

	public CSV parse() {
		
		return new CSV();
	}

}
