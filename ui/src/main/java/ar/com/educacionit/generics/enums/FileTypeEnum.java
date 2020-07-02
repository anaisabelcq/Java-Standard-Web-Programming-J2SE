package ar.com.educacionit.generics.enums;

/**
 * Inmutable
 * @author CX PC
 *
 */
public enum FileTypeEnum {

	//defino los enums
	CSV("csv"), TXT("txt"), DOC("doc"), PDF("pdf");
	
	private String type;
	
	private FileTypeEnum(String type) {
		this.type = type;
	}

	public String getType() {
		return type;
	}
	
	public static FileTypeEnum getEnumByString(String type) {
		
		FileTypeEnum[] types = FileTypeEnum.values();
		
		FileTypeEnum enumType = null;
		
		for(FileTypeEnum taux : types) {
			if(taux.getType().equals(type)) {
				enumType = taux;
			}
		}
		return enumType;
	}
}
