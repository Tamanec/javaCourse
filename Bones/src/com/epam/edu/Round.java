package com.epam.edu;

import java.util.Set;
import java.util.TreeSet;

/**
 * Класс для хранения результатов раунда
 * 
 * @author Denis
 */
public class Round {
	
	/**
	 * Список результатов игроков
	 */
	private Set<Result> results = new TreeSet<Result>();
	
	/**
	 * Команда для игры 
	 */
	private Command command = Command.PLAY;
	
	/**
	 * Начинаем раунд, все игроки кидают кубики 
	 * результаты записываются в results  
	 */
	public void begin() {
		int score;
		
		for (Player player : players) {				
			for (int i = 0; i < cubesCount; i++) {
				score += player.throwCube();
			}
			
			storeResult(new Result(player, score));
		}
	}
	
	/**
	 * Завершает раунд и передает игре команду
	 * 
	 * @return	команда для игры
	 */
	public Command end() {
		return command;	
	}
	
	/**
	 * Сохраняем результат броска
	 * 
	 * @param result
	 */
	private void storeResult(Result result) {
		results.add(result);
	}
		
	/**
	 * Возвращает счет игрока в данном раунде
	 * Если игрок еще не бросал кости возвращает 0
	 * 
	 * @param player	Игрок
	 * @return			Счет игрока в данном раунде
	 */
	public int getPlayerScore(Player player) {
		// ищем счет в списке результатов
		return 0;
	}
	
}