package com.danilocampos;

import com.danilocampos.facade.Facede;
import com.danilocampos.singleton.SingletonEager;
import com.danilocampos.singleton.SingletonLazy;
import com.danilocampos.singleton.SingletonLazyHolder;
import com.danilocampos.strategy.Actions;
import com.danilocampos.strategy.HastyActions;
import com.danilocampos.strategy.NormalActions;
import com.danilocampos.strategy.Player;
import com.danilocampos.strategy.StealthActions;

public class Tests {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// Singleton Tests
		System.out.println("Singleton Tests:");

		SingletonLazy singletonLazy = SingletonLazy.getInstance();
		System.out.println(singletonLazy.getInstance());
		singletonLazy = SingletonLazy.getInstance();
		System.out.println(singletonLazy.getInstance());

		SingletonEager singletonEager = SingletonEager.getInstance();
		System.out.println(singletonEager.getInstance());
		singletonEager = SingletonEager.getInstance();
		System.out.println(singletonEager.getInstance());

		SingletonLazyHolder singletonLazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(singletonLazyHolder.getInstance());
		singletonLazyHolder = SingletonLazyHolder.getInstance();
		System.out.println(singletonLazyHolder.getInstance());

		// Strategy Tests

		System.out.println("\nStrategy Tests:");
		Actions normal = new NormalActions();
		Actions hasty = new HastyActions();
		Actions stealth = new StealthActions();
		Player player = new Player(normal);

		player.move();
		player.setActions(hasty);
		player.move();
		player.setActions(stealth);
		player.move();

		// Facede Tests

		System.out.println("\nFacede Tests:");
		Facede facede = new Facede();
		facede.migrateClient("João", "12345678");

	}
}
