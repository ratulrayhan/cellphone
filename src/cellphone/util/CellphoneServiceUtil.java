package cellphone.util;

import java.util.Scanner;

import cellphone.domain.*;
import cellphone.service.CellphoneService;

public class CellphoneServiceUtil {

	private static void checkNullorEmpty(String fieldName, String value) {
		if (value == null || value.isEmpty()) {
			throw new IllegalArgumentException(fieldName + " Value Can't be Null or Empty");
		}
	}

	public static CellphoneService createCellphoneFromUserInput() {

		CellphoneService cellphoneService = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Which Phone You Want to Know About? ");
		String typeOfCellphone = scanner.nextLine();
		checkNullorEmpty("Type of Phone", typeOfCellphone);
		CellphoneType cellphoneType = CellphoneType.fromUserInput(typeOfCellphone);
		scanner.close();
		if (cellphoneType == CellphoneType.INVALID) {
			throw new IllegalArgumentException(
					"The Possible Values of Cellphone Type Can Be " + CellphoneType.IPHONE.getValue() + ","
							+ CellphoneType.SAMSUNG.getValue() + "," + CellphoneType.NOKIA.getValue());
		}
		if (cellphoneType == CellphoneType.IPHONE) {
			cellphoneService = new IphoneService();
		} else if (cellphoneType == CellphoneType.SAMSUNG) {
			cellphoneService = new SamsungService();
		} else if (cellphoneType == CellphoneType.NOKIA) {
			cellphoneService = new NokiaService();
		}
		return cellphoneService;
	}

	public static void priintResult(CellphoneService cellphoneService) {

		System.out.println("Has a Touch Screen Display: " + cellphoneService.hasTouchScreen());
		System.out.println("Operating System: " + cellphoneService.typeOfOs());
	}
}
