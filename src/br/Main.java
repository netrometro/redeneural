package br;

import br.neuralnetwork.Layer;

public class Main {

	public static void main(String[] args) {
		long[] inputs = {-123, -23, 23};
		
		
		//*// Criando uma layer, copiando uma layer e mutando
		Layer l1 = new Layer(3, inputs.length);
		l1.interaction(inputs);
		long[][] dnaL1 = l1.getDNA();
		l1.logNeuron();
		
		Layer l2 = new Layer(dnaL1);
		l2.interaction(inputs);
		l2.logNeuron();
		
		l2.mutation(2);
		l2.interaction(inputs);
		l2.logNeuron();
		//*/
		
		
		/*// Executando um neurônio e criando uma cópia passando o mesmo input
		Neuron n1 = new Neuron(inputs.length);
		n1.interaction(inputs);
		n1.logWeights();
		n1.logInputs();
		n1.logResults();
		n1.logOutput();
		long[] dnaN1 = n1.getDNA();
		
		Neuron n2 = new Neuron(dnaN1);
		n2.interaction(inputs);
		n2.logWeights();
		n2.logInputs();
		n2.logResults();
		n2.logOutput();
		
		n2.mutation();
		n2.interaction(inputs);
		n2.logWeights();
		n2.logInputs();
		n2.logResults();
		n2.logOutput();
		//*/
	}
}
