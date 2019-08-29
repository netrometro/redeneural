package br.ecosystem;

public interface Ecosystem {
	
	Ecosystem getInstance(int players);
	int[] interaction(int[] inputs);
	int[] test();
	
}
