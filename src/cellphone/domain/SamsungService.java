package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class SamsungService extends AbstractCellphoneService {

	public SamsungService(Cellphone cellphone) {
		super(cellphone);

	}

	@Override
	public String typeOfOs() {
		String os = "Android";
		return os;
	}

}
