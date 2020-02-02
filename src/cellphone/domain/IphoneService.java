package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class IphoneService extends AbstractCellphoneService {

	@Override
	public String typeOfOs() {
		return "iOS";
	}
}
