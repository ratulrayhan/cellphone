package cellphone.service;

public abstract class AbstractCellphoneService implements CellphoneService {

	public boolean hasTouchScreen() {
		return true;
	}
}
