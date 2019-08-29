package br.ecosystem;

public class Race implements Ecosystem {
	
	private int distance = 100;
	private int[] track;
	private int playerActive;

	public Race(int amountOfPlayers) {
		this.track = new int[amountOfPlayers];
	}
	
	public static Ecosystem buildEcosystem(int players) {
		return new Race(players);
	}

	@Override
	public int[] interaction(int[] inputs) {
		int[] output = new int[5];
		
		if (track[playerActive] < distance/2) {
			output[1] = 10; output[2] = 5; output[3] = 2; 
		} else {
			if (track[playerActive] < distance*3/4) {
				output[1] = 2; output[2] = 10; output[3] = 5; 
			} else {
				output[1] = 5; output[2] = 2; output[3] = 10;
			}
		}

		if (inputs[0] > 0) {
			output[0] = 1;
			track[playerActive] += output[1];
			output[4] = track[playerActive];
		} else
			if (inputs[1] > 0) {
				output[0] = 2;
				track[playerActive] += output[2];
				output[4] = track[playerActive];
			} else
				if (inputs[2] > 0) {
					output[0] = 3;
					track[playerActive] += output[3];
					output[4] = track[playerActive];
				} else {
					output[0] = 0;
					track[playerActive] += 1;
					output[4] = track[playerActive];
				}
		
		playerActive++;
		if (playerActive >= track.length)
			playerActive = 0;
		
		return output;
	}

	@Override
	public int[] test() {
		int[] winners = new int[track.length];
		
		for (int i = 0; i < track.length; i++) {
			if (track[i] >= distance) {
				winners[i] = 1;
			}
		}
		
		return winners;
	}

}
