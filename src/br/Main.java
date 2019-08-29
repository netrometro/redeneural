package br;

public class Main {

	public static void main(String[] args) {
		
		//*// Executando um neurônio e criando uma cópia passando o mesmo input
		long[] inputs = {-123, -23, 23, 123};
		Neuron n1 = new Neuron(inputs.length);
		n1.interaction(inputs);
		n1.logWeights();
		n1.logInputs();
		n1.logResults();
		n1.logOutput();
		long[] dna = n1.getDNA();
		
		Neuron n2 = new Neuron(dna);
		n2.interaction(inputs);
		n2.logWeights();
		n2.logInputs();
		n2.logResults();
		n2.logOutput();
		//*/
		
	}
}
