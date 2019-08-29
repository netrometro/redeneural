package br.neuralnetwork;

import java.util.Random;

public class Layer {
	
	private Neuron[] neurons;
	
	public Layer(int amountOfNeurons, int amoutOfInputs) {
		neurons = new Neuron[amountOfNeurons];
		for (int i = 0; i < neurons.length; i++) 
			neurons[i] = new Neuron(amoutOfInputs);
	}
	
	public Layer(long[][] dna) {
		neurons = new Neuron[dna.length];
		for (int i = 0; i < neurons.length; i++) 
			neurons[i] = new Neuron(dna[i]);
	}
	
	public void mutation(int force) {
		Random r = new Random();
		for (int i = 0; i < force; i++) {
			neurons[r.nextInt(neurons.length)].mutation();
		}
	}
	
	public long[] interaction(long[] inputs) {
		long[] output = new long[neurons.length];
		for (int i = 0; i < output.length; i++) {
			output[i] = neurons[i].interaction(inputs);
		}
		return output;
	}
	
	public long[][] getDNA() {
		long[][] dna = new long[neurons.length][neurons[0].getDNA().length];
		for (int i = 0; i < neurons.length; i++) {
			dna[i] = neurons[i].getDNA();
		}
		return dna;
	}
	
	public void logNeuron() {
		System.out.println("Layer <<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
		for (int i = 0; i < neurons.length; i++) {
			neurons[i].logWeights();
			neurons[i].logInputs();
			neurons[i].logResults();
			neurons[i].logOutput();
			System.out.println("----------------------------------------------------\n");
		}
	}
}
