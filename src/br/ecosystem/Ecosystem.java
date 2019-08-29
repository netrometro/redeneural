package br.ecosystem;

public interface Ecosystem {
	
	Ecosystem buildEcosystem(int amountOfPlayers);
	int[] interaction(int[] inputs);
	int[] test();
	
}
