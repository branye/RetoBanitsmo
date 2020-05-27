package co.com.sophos.certification.challenge.questions;


import co.com.sophos.certification.challenge.models.BanistmoPdfData;
import co.com.sophos.certification.challenge.util.datamanagement.DataManagement;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.junit.Assert;

import static co.com.sophos.certification.challenge.userinterfaces.BanistmoUserInterface.URL_ARCHIVO_PDF;
import static org.hamcrest.core.IsEqual.equalTo;

public class ElPdfSeleccionado implements Question<Boolean>{

	@Override
	public Boolean answeredBy(Actor actor) {
		BanistmoPdfData banistmopData = DataManagement.getBanistmoData();
			Assert.assertThat(URL_ARCHIVO_PDF.of(banistmopData.getRuta()).resolveFor(actor).isVisible(),
					equalTo(Boolean.TRUE));

		return true;
	}
	
	public static ElPdfSeleccionado SeAbreCorrectamente() {
		return new ElPdfSeleccionado();
	}

}
