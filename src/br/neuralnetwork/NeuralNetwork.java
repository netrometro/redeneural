package br.neuralnetwork;

public class NeuralNetwork {

	private Layer[] layers;
	
	public NeuralNetwork(int[] amountOfNeuronsPerLayer) {
		layers = new Layer[amountOfNeuronsPerLayer.length];
		for (int i = 0; i < layers.length; i++) {
			layers[i] = new Layer(amountOfNeuronsPerLayer[i]);
		}
	}
	
	public NeuralNetwork(int[][][] dna) {
		layers = new Layer[dna.length];
		for (int i = 0; i < layers.length; i++) {
			layers[i] = new Layer(dna[i]);
		}
	}
	
	public void mutation(int force) {
		for (int i = 0; i < layers.length; i++) {
			layers[i].mutation(force);
		}
	}
	
	public int[] interaction(int[] inputs) {
		int[] output = inputs.clone();
		for (int i = 0; i < layers.length; i++) {
			output = layers[i].interaction(output);
		}
		return output;
	}
	
	public int[][][] getDNA() {
		int[][][] dna = new int[layers.length][layers[0].getDNA().length][layers[0].getDNA()[0].length];
		for (int i = 0; i < layers.length; i++) {
			dna[i] = layers[i].getDNA();
		}
		return dna;
	}
	
	public void log() {
		System.out.println("Neural Network ########################################################");
		for (int i = 0; i < layers.length; i++) {
			layers[i].logNeuron();
		}
	}
}
