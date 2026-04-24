package com.danilocampos.facade.subsystems.crm;

public class CrmService {

	private CrmService() {
	}

	public static void saveClient(String name, String cep, String state, String city) {
		System.out.println("Client saved on CRM system:");
		System.out.println("name: " + name);
		System.out.println("cep: " + cep);
		System.out.println("state: " + state);
		System.out.println("city: " + city);
	}
}
