package br;

import br.neuralnetwork.Layer;
import br.neuralnetwork.NeuralNetwork;
import br.neuralnetwork.Neuron;

public class Main {

	public static void main(String[] args) {
		int[] inputs = {-123, -23, 23};
		
		//*// Criando uma Rede Neural, copiando uma Rede Neural e mutando.
		int[] structure = {4,3};
		NeuralNetwork nn1 = new NeuralNetwork(structure);
		nn1.interaction(inputs);
		int[][][] dnaNN1 = nn1.getDNA();
		nn1.log();
		
		NeuralNetwork nn2 = new NeuralNetwork(dnaNN1);
		nn2.interaction(inputs);
		nn2.log();
		
		nn2.mutation(2); // force = 2 é a metade dos neurônios de uma camada, arredondado para baixo.
		nn2.interaction(inputs);
		nn2.log();
		
		//*/
		
		
		/*// Criando uma layer, copiando uma layer e mutando
		Layer l1 = new Layer(3);
		l1.interaction(inputs);
		int[][] dnaL1 = l1.getDNA();
		l1.logNeuron();
		
		Layer l2 = new Layer(dnaL1);
		l2.interaction(inputs);
		l2.logNeuron();
		
		l2.mutation(2);
		l2.interaction(inputs);
		l2.logNeuron();
		//*/
		
		
		/*// Executando um neurônio e criando uma cópia passando o mesmo input
		Neuron n1 = new Neuron();
		n1.interaction(inputs);
		n1.logWeights();
		n1.logInputs();
		n1.logResults();
		n1.logOutput();
		
		int[] dnaN1 = n1.getDNA();
		
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
