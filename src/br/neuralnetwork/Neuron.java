package br.neuralnetwork;

import java.util.Arrays;
import java.util.Random;

public class Neuron {
	
	private int[] weights;
	private int[] inputs;
	private int[] results;
	private int output;
	
	public Neuron() { }
	
	public Neuron(int[] weights) {
		this.weights = weights.clone();
	}
	
	public void mutation() {
		Random r = new Random();
		for (int i = 0; i < weights.length; i++) {
			weights[i] = r.nextInt(2001)-1000;
		}
	}
	
	public int interaction(int[] inputs) {
		if (weights == null) {
			weights = new int[inputs.length];
			this.mutation();
		}
		this.inputs = inputs.clone();
		this.results = new int[inputs.length];
		this.output = 0;
		for (int i = 0; i < weights.length; i++) {
			results[i] = inputs[i] * weights[i];
			output += results[i];
		}
		if (output < 0) 
			output = 0;
		return output;
	}
	
	public int[] getDNA() {
		return weights.clone();
	}
	
	public void logWeights() {
		System.out.println("Neuron [weights: " + Arrays.toString(weights) + " ]");
	}
	
	public void logInputs() {
		System.out.println("Neuron [inputs: " + Arrays.toString(inputs) + " ]");
	}
	
	public void logResults() {
		System.out.println("Neuron [results: " + Arrays.toString(results) + " ]");
	}
	
	public void logOutput() {
		System.out.println("Neuron [output: " + output + " ]");
	}
}
