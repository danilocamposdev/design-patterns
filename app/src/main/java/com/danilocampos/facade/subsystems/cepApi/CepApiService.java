package com.danilocampos.facade.subsystems.cepApi;

public class CepApiService {

	private static CepApiService instance = new CepApiService();

	private CepApiService() {
	}

	public static CepApiService getInstance() {
		return instance;
	}

	public String getClientState(String cep) {
		return "StateY";

	}

	public String getClientCity(String cep) {
		return "CityZ";
	}

}
