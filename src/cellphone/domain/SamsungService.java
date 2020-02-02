package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class SamsungService extends AbstractCellphoneService {

	@Override
	public String typeOfOs() {
		return "Android";
	}
}
