package com.evolution.game;

public class MonoWorld extends World {

	@Override
	Animal makeAnimal(int row, int col, Field field) {
		return new Grazer(row, col, field);
	}
}