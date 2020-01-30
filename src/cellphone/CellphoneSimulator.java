package cellphone;

import cellphone.service.CellphoneService;
import cellphone.util.CellphoneServiceUtil;

public class CellphoneSimulator {

	public static void main(String[] args) {
		try {
			CellphoneService cellphoneFromUserInput = CellphoneServiceUtil.createCellphoneFromUserInput();
			CellphoneServiceUtil.priintResult(cellphoneFromUserInput);
		} catch (Exception e) {
			System.out.println(e.getMessage());

		} finally {
			System.out.println();
			System.out.println("Program Execution is Completed");
		}
	}
}
