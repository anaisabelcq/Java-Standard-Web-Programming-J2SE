package ar.com.educacionit.generics;

import ar.com.educacionit.generics.filetype.TXT;

public class TXTFileParser extends FileParser<TXT> {

	public TXTFileParser(String sourceFilePath) {
		super(sourceFilePath);
	}

	public TXTFileParser() {
		super();
	}

	@Override
	public TXT parse() {
		
		// File file = new File(this.getSourceFilePath());
		
		//leer archivos
		
		return new TXT();
	}

}
