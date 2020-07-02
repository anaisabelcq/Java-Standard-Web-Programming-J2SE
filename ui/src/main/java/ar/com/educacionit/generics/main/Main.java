package ar.com.educacionit.generics.main;

import ar.com.educacionit.generics.enums.FileParserFactory;
import ar.com.educacionit.generics.enums.FileTypeEnum;
import ar.com.educacionit.generics.enums.IParserable;

public class Main {

	public static void main(String[] args) {
		
		String tipoBuscado =  "pdf";
		
		FileTypeEnum enumBuscado = FileTypeEnum.getEnumByString(tipoBuscado);
		
		if(enumBuscado != null) {
			
			IParserable parser = FileParserFactory.getFileParser(enumBuscado);
			
			System.out.println(parser);
		}
	}

}
