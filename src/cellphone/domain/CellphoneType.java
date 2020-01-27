package cellphone.domain;

public enum CellphoneType {

	IPHONE("iPhone"), SAMSUNG("Samsung"), NOKIA("Nokia"), INVALID("Invalid");

	private String value;

	CellphoneType(String val) {
		value = val;
	}

	public static CellphoneType fromUserInput(String i_phone) {
		CellphoneType[] cellphoneTypeArr = CellphoneType.values();
		for (CellphoneType cellphoneType : cellphoneTypeArr) {
			if (cellphoneType.value.equalsIgnoreCase(i_phone)) {
				return cellphoneType;
			}
		}
		return INVALID;
	}

	public String getValue() {
		return value;
	}

}
