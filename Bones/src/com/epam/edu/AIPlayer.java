package com.epam.edu;

/**
 * Класс игрока-бота
 * 
 * @author Denis
 */
public class AIPlayer extends Player {
	
	public AIPlayer(String name) {
		super("AI" + name);
	}
	
	/**
	 * @see com.epam.edu.Player#throwCube()
	 */
	@Override
	public int throwCube() {
		return cube.getNumber();			
	}
	
	/**
	 * @see com.epam.edu.Player#getCommand()
	 */
	@Override
	public Command getCommand() {
		return Command.THROW;
	}

	/**
	 * Сравнивает игроков по счету в текущем раунде
	 */
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
