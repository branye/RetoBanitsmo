package co.com.sophos.certification.challenge.exceptions;

public class ConstantTypeClass {
	
	public static final String UTILITY_CLASS = "Utility Class";

	private ConstantTypeClass() {
		throw new IllegalStateException(UTILITY_CLASS);
	}
}
