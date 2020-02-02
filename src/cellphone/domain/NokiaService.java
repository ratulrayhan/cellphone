package cellphone.domain;

import cellphone.service.AbstractCellphoneService;

public class NokiaService extends AbstractCellphoneService {

	@Override
	public String typeOfOs() {
		return "WindowsOs";
	}
}
