package com.danilocampos.strategy;

public class Player {

	private Actions actions;

	public Player(Actions actions) {
		this.actions = actions;
	}

	public void setActions(Actions strategy) {
		this.actions = strategy;
	}

	public void move() {
		actions.move();
	}
}
