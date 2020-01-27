package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class NokiaService extends AbstractCellphoneService {

	public NokiaService(Cellphone cellphone) {
		super(cellphone);

	}

	@Override
	public String typeOfOs() {
		String os = "WindowsOs";
		return os;

	}

}
