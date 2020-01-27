package cellphone.service;

import cellphone.domain.Cellphone;

public abstract class AbstractCellphoneService implements CellphoneService {

	private Cellphone cellphone;

	public AbstractCellphoneService(Cellphone cellphone) {
		super();
		this.cellphone = cellphone;
	}

	public Cellphone getCellphone() {
		return cellphone;
	}

	public void setCellphone(Cellphone cellphone) {
		this.cellphone = cellphone;
	}

	public boolean hasTouchScreen() {
		return true;
	}

}
