package cellphone.domain;

public class Cellphone {

	private CellphoneType typeOfCellphone;
	private String typeOfOs;
	private boolean hasTouchScreen;

	public Cellphone(CellphoneType typeOfCellphone, String typeOfOs, boolean hasTouchScreen) {
		super();
		this.typeOfCellphone = typeOfCellphone;
		this.typeOfOs = typeOfOs;
		this.hasTouchScreen = hasTouchScreen;
	}

	public Cellphone() {
		super();
	}

	public CellphoneType getTypeOfCellphone() {
		return typeOfCellphone;
	}

	public void setTypeOfCellphone(CellphoneType typeOfCellphone) {
		this.typeOfCellphone = typeOfCellphone;
	}

	public String getTypeOfOs() {
		return typeOfOs;
	}

	public void setTypeOfOs(String typeOfOs) {
		this.typeOfOs = typeOfOs;
	}

	public boolean isHasTouchScreen() {
		return hasTouchScreen;
	}

	public void setHasTouchScreen(boolean hasTouchScreen) {
		this.hasTouchScreen = hasTouchScreen;
	}

}
