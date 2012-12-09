package com.epam.edu;

/**
 * Класс игрока-человека
 * 
 * @author Denis
 */
public class HumanPlayer extends Player {
	
	HumanPlayer(String name) {
		super(name);
	}
	
	/**
	 * @see com.epam.edu.Player#throwCube()
	 */
	@Override
	public int throwCube() {
		return cube.getNumber();			
	}
	
	@Override
	public Command getCommand() {
		// ... получаем команду
		return Command.THROW;
	}

	@Override
	public int compareTo(Player other) {
		Round round = score.get(score.size());
		int selfScore = round.getPlayerScore(this);
		int otherScore = round.getPlayerScore(other);
		
		if (selfScore == otherScore) {
			return 0;
		}
		
		return (selfScore < otherScore) ? -1 : 1;
	}
	
}