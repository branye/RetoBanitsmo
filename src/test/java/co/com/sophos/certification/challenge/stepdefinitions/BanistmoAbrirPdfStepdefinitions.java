package co.com.sophos.certification.challenge.stepdefinitions;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

import java.util.List;

import co.com.sophos.certification.challenge.exceptions.AssertionBanistmo;
import co.com.sophos.certification.challenge.questions.ElPdfSeleccionado;
import co.com.sophos.certification.challenge.tasks.IngresarAlMenu;
import co.com.sophos.certification.challenge.tasks.SeleccionarArchivo;
import co.com.sophos.certification.challenge.util.datamanagement.DataManagement;
import co.com.sophos.certification.challenge.util.driver.CustomDriver;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

public class BanistmoAbrirPdfStepdefinitions {
	
	Actor user = Actor.named("Sophos solution");
	
	@Before
	public void setUpStage() {
		user.can(BrowseTheWeb.with(CustomDriver.chromeDriver().onPageURL("https://www.banistmo.com/wps/portal/banistmo/personas/")));
	}

	@Given("^El usuario ingresa a la pagina de banitsmo$")
	public void elUsuarioIngresaALaPaginaDeBanitsmo(List<String> data) {
		DataManagement.setBanistmoData(data);
	}

	@When("^Ingresa al menu inferior en la opcion tarifario$")
	public void ingresaAlMenuInferiorEnLaOpcionTarifario() {
		user.attemptsTo(IngresarAlMenu.onSearchBar());
	}

	@When("^seleccona la opcion para abrir el pdf de tarifas de cuentas deposito$")
	public void selecconaLaOpcionParaAbrirElPdfDeTarifasDeCuentasDeposito() {
		user.attemptsTo(SeleccionarArchivo.conNombre());
	}

	@Then("^Revisara que el archivo pdf se encuentre abierto con el nombre de este archivo$")
	public void revisaraQueElArchivoPdfSeEncuentreAbiertoConElNombreDeEsteArchivo() {
		user.should(seeThat(ElPdfSeleccionado.SeAbreCorrectamente())
				.orComplainWith(AssertionBanistmo.class, AssertionBanistmo.EL_ARCHIVO_PDF_NO_SE_ABRO_CORRECTAMENTE));
	}
	


}
