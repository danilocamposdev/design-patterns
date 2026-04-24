package com.danilocampos.strategy;

public class StealthActions implements Actions {

	@Override
	public void move() {
		System.out.println("Moving stealthily...");
	}

}
