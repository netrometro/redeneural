package br;

import java.util.Arrays;

import br.ecosystem.Ecosystem;
import br.ecosystem.Race;
import br.evolution.Evolution;
import br.neuralnetwork.Layer;
import br.neuralnetwork.NeuralNetwork;
import br.neuralnetwork.Neuron;

public class Main {

	public static void main(String[] args) {
		
		//*// Evolução: Utiliza o ecosistema para selecionar o mais forte, reproduz ele, seleciona novamente e assim por diante por um número determinado de gerações
		int[] structure = {4,3};
		int population = 10;
		Ecosystem ecosystem = new Race(population);
		
		Evolution evo = new Evolution(population, structure, ecosystem);
		int[] output = new int[5];
		int[][][] dna = evo.generate(10, output);
		
		System.out.println("Winner [ " +  Arrays.toString(dna) + " ]");
		//*/
		
		
		
		/*// O ecosistemas é uma corrida de 0 a 100 unidades com dois pilotos
		int[] structure = {4,3};
		NeuralNetwork piloto1 = new NeuralNetwork(structure);
		NeuralNetwork piloto2 = new NeuralNetwork(structure);
		
		Ecosystem F1 = Race.getInstance(2);
		int[] output1 = new int[5];
		int[] output2 = new int[5];
		
		boolean flag = true;
		while (flag) {
			output1 = F1.interaction(piloto1.interaction(output1));
			output2 = F1.interaction(piloto2.interaction(output2));

			System.out.println("Race [ " + Arrays.toString(output1) + " ]");
			System.out.println("Race [ " + Arrays.toString(output2) + " ]");
			System.out.println();
			
			int[] winner = F1.test();
			for (int i = 0; i < winner.length; i++) {
				if (winner[i] > 0) flag = false;
			}
		}
		piloto1.log();
		piloto2.log();
		
		
		//*/
		
		//int[] inputs = {-123, -23, 23};
		
		/*// Criando uma Rede Neural, copiando uma Rede Neural e mutando.
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
