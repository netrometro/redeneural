package br.evolution;

import java.util.Arrays;

import br.ecosystem.Ecosystem;
import br.neuralnetwork.NeuralNetwork;

public class Evolution {

	private NeuralNetwork[] population;
	private Ecosystem ecosystem;
	
	public Evolution(int population, int[] structure, Ecosystem ecosystem) {
		this.ecosystem = ecosystem;
		this.population = new NeuralNetwork[population];
		createCreatures(structure);
	}
	
	private void createCreatures(int[] structure) {
		for (int i = 0; i < population.length; i++) {
			population[i] = new NeuralNetwork(structure);
		}
	}
	
	public int[][][] generate(int generations, int[] output) {
		int[][][] dna = null;
		
		for (int i = 0; i < generations; i++) {
			
			int[][] outputs = new int[population.length][output.length];
			for (int o = 0; o < outputs.length; o++) {
				outputs[o] = output.clone();
			}
			
			System.out.println("Generation: " + (i+1) + " ###################################################");
			ecosystem = ecosystem.getInstance(population.length);
			
			int round = 1;
			race:
			while (true) {
				//System.out.println("Round " + round++);
				for (int j = 0; j < population.length; j++) {
					//System.out.println("Race before [ " + Arrays.toString(outputs[j]) + " ]");
					outputs[j] = ecosystem.interaction(population[j].interaction(outputs[j]));
					//System.out.println("Race after  [ " + Arrays.toString(outputs[j]) + " ]");
					
					int[] win = ecosystem.test();
					//System.out.println("Test [ " + Arrays.toString(win) + " ]\n");
					for (int k = 0; k < win.length; k++) {
						if (win[k] > 0) {
							dna = population[k].getDNA();
							System.out.println("Winner: " + k + " DNA: " + Arrays.deepToString(dna));
							break race;
						}
					}
				}
			}
		}
		
		return dna;
	}
}
