package co.com.sophos.certification.challenge.tasks;

import co.com.sophos.certification.challenge.models.BanistmoPdfData;
import co.com.sophos.certification.challenge.util.datamanagement.DataManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.sophos.certification.challenge.userinterfaces.BanistmoUserInterface.PDF_OPCION_SELECCIONADA;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SeleccionarArchivo implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		BanistmoPdfData banistmoData = DataManagement.getBanistmoData();
		actor.attemptsTo(
				Click.on(PDF_OPCION_SELECCIONADA.
						of(banistmoData.getDocumento())));
	}
	
	public static SeleccionarArchivo conNombre() {
		return instrumented(SeleccionarArchivo.class);
	}

}
