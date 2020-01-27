package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class IphoneService extends AbstractCellphoneService {

	public IphoneService(Cellphone cellphone) {
		super(cellphone);

	}

	@Override
	public String typeOfOs() {
		String os = "iOS";
		return os;
	}

}
