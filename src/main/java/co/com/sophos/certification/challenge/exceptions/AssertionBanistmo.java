package co.com.sophos.certification.challenge.exceptions;

public class AssertionBanistmo extends AssertionError{
	
	private static final long serialVersionUID = 1L;
	
	public static final String EL_ARCHIVO_PDF_NO_SE_ABRO_CORRECTAMENTE = "El archivo seleccionado con el nombre otorgado no  ha sido encontrado o no se pudo abrir el archhivo correctamente.";

	public AssertionBanistmo(String message) {
		super(message);
	}
	
	public AssertionBanistmo(String message, Throwable cause) {
		super(message, cause);
	}
	
}
