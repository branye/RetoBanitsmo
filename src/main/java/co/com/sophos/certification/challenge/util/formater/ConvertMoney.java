package co.com.sophos.certification.challenge.util.formater;

import co.com.sophos.certification.challenge.exceptions.ConstantTypeClass;

public class ConvertMoney {

	private ConvertMoney() {
		throw new IllegalStateException(ConstantTypeClass.UTILITY_CLASS);
	}
	
	public static String toStringer(String value) {
		return value.replace("S/ ", "");
	}
}
