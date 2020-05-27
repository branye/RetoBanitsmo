package co.com.sophos.certification.challenge.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BanistmoUserInterface {
	
	public static final Target OPCION_MENU_INFERIOR = Target.the("Elemento del menu inferior para acceder a la opcion")
			.located(By.xpath("//*/ul[@class='check-list']/li/a[text()='{0}']"));
	public static final Target PDF_OPCION_SELECCIONADA = Target.the("Icono para abrir el pdf seleccionado")
			.located(By.xpath("(//*/table[@class='table-responsive']/tbody/tr/td/span[text()='{0}']/ancestor::tr)/td[2]/span"));
	public static final Target URL_ARCHIVO_PDF = Target.the("Elemento visible cuendo se abre correctamente el archivo pdf").
			located(By.xpath("//*/embed[@src='{0}']"));



}
