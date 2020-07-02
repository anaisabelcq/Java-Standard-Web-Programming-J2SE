package ar.com.educacionit.generics.enums;

import java.util.HashMap;
import java.util.Map;

import ar.com.educacionit.generics.CSVFileParse;
import ar.com.educacionit.generics.DOCFileParser;
import ar.com.educacionit.generics.FileParser;
import ar.com.educacionit.generics.TXTFileParser;

public class FileParserFactory {

	static Map<FileTypeEnum,FileParser> mapTypes  = build();
	
	private static Map<FileTypeEnum,FileParser> build() {
		 Map<FileTypeEnum,FileParser> map = new HashMap<FileTypeEnum, FileParser>();
		 map.put(FileTypeEnum.CSV, new CSVFileParse());
		 map.put(FileTypeEnum.DOC, new DOCFileParser());
		 map.put(FileTypeEnum.TXT, new TXTFileParser());
		 return map;
	}
	
	/*
	// STATIC BLOCK
	static {
		 mapTypes = new HashMap<FileTypeEnum, FileParser>();
		 mapTypes.put(FileTypeEnum.CSV, new CSVFileParse());
		 mapTypes.put(FileTypeEnum.DOC, new DOCFileParser());
		 mapTypes.put(FileTypeEnum.TXT, new TXTFileParser());
	}
	*/
	
	public static IParserable getFileParser(FileTypeEnum type) {
		
		if(mapTypes.containsKey(type)) {
			return mapTypes.get(type);
		}
		throw new RuntimeException("No existe parser para " + type.toString());
	}
}
