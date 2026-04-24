package com.danilocampos.facade;

import com.danilocampos.facade.subsystems.cepApi.CepApiService;
import com.danilocampos.facade.subsystems.crm.CrmService;

public class Facede {

	public void migrateClient(String name, String cep) {
		String city = CepApiService.getInstance().getClientCity(cep);
		String state = CepApiService.getInstance().getClientState(cep);
		CrmService.saveClient(name, cep, state, city);
	}
}
