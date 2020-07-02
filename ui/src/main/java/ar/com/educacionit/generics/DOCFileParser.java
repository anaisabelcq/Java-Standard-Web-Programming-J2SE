package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.DOC;

public class DOCFileParser extends FileParser<DOC> {

	public DOCFileParser(String sourceFilePath) {
		super(sourceFilePath);
	}

	public DOCFileParser() {
		super();
	}

	@Override
	public DOC parse() {
		return new DOC();
	}

}
