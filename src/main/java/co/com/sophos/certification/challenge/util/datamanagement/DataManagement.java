package co.com.sophos.certification.challenge.util.datamanagement;

import java.util.List;

import co.com.sophos.certification.challenge.models.BanistmoPdfData;

public class DataManagement{

	private static BanistmoPdfData banistmoData;

	private DataManagement() {
		throw new IllegalStateException("Interaction class");
	}

	public static BanistmoPdfData getBanistmoData() {
		return banistmoData;
	}

	public static void setBanistmoData(List<String> data) {
		BanistmoPdfData banistmo = new BanistmoPdfData();
		banistmo.setId(data.get(0));
		banistmo.setMenu(data.get(1));
		banistmo.setDocumento(data.get(2));
		banistmo.setRuta(data.get(3));

		DataManagement.banistmoData = banistmo;
	}

}
