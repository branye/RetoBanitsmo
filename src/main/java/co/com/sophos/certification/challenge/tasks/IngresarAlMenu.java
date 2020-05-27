package co.com.sophos.certification.challenge.tasks;

import co.com.sophos.certification.challenge.models.BanistmoPdfData;
import co.com.sophos.certification.challenge.util.datamanagement.DataManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import java.util.concurrent.TimeUnit;

import static co.com.sophos.certification.challenge.userinterfaces.BanistmoUserInterface.OPCION_MENU_INFERIOR;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarAlMenu implements Task{

	@Override
	public <T extends Actor> void performAs(T actor) {
		BanistmoPdfData banistmoData = DataManagement.getBanistmoData();
		OPCION_MENU_INFERIOR.of(banistmoData.getMenu()).resolveFor(actor).
				waitUntilPresent().
				withTimeoutOf(10, TimeUnit.SECONDS);

		actor.attemptsTo(
				Click.on(OPCION_MENU_INFERIOR.of(banistmoData.getMenu())));
		
	}
	
	public static IngresarAlMenu onSearchBar() {
		return instrumented(IngresarAlMenu.class);
	}

}
