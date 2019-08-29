package br;

import java.util.Arrays;
import java.util.Random;

public class Neuron {
	
	private long[] weights;
	private long[] inputs;
	private long[] results;
	private long output;
	
	public Neuron(int amoutOfInputs) {
		weights = new long[amoutOfInputs];
		this.mutation();
	}

	public Neuron(long[] weights) {
		this.weights = weights.clone();
	}
	
	public void mutation() {
		Random r = new Random();
		for (int i = 0; i < weights.length; i++) {
			weights[i] = r.nextInt(2001)-1000;
		}
	}
	
	public long interaction(long[] inputs) {
		this.inputs = inputs.clone();
		this.results = new long[inputs.length];
		long output = 0;
		for (int i = 0; i < weights.length; i++) {
			results[i] = inputs[i] * weights[i];
			output += results[i];
		}
		if (output < 0) 
			output = 0;
		return output;
	}
	
	public long[] getDNA() {
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
