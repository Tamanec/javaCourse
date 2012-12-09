package com.epam.edu;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Класс управления игрой в кости
 * 
 * @author Denis
 */
public class BonesGame {

	/**
	 * Список игроков 
	 */
	private Set<Player> players = new TreeSet<Player>();
	
	/**
	 * Список раундов
	 */
	private List<Round> score = new LinkedList<Round>();
	
	/**
	 * Количество кубиков 
	 */
	private int cubesCount;
	
	/**
	 * Количество раундов
	 */
	private int roundsCount;
	
	/**
	 * Игровой кубик
	 */
	private Cube cube = new Cube(6);		
	
	/**
	 * Определяет параметры игры: количество кубиков, раундов и ботов
	 * 
	 * @param cubesCount  количество кубиков
	 * @param roundsCount количество раундов
	 * @param botCount    количество ботов
	 */
	public BonesGame(int cubesCount, int roundsCount, int botCount) {
		this.cubesCount = cubesCount; 
		this.roundsCount = roundsCount;
		
		for (Integer i = 0; i < botCount; i++) {
			addAI(i.toString());
		}
	}
	
	/**
	 * Запускает игру
	 */
	public void Run() {
		Command command; // игровая команда
		
		do {
			Round round = new Round();
			score.add(round);
			
			round.begin();
			
			command = round.end();
		} while (command != Command.GAME_END);
	}	
	
	/**
	 * Возвращает список раундов с результатами игроков в каждом из них 
	 * 
	 * @return результаты игры
	 */
	public List<Round> getScore() {
		return score;
	}
	
	/**
	 * Добавляет игрока в игру
	 * 
	 * @param player
	 */
	public void addHuman(String name) {
		players.add(new HumanPlayer(name));
	}
	
	/**
	 * Добавляет в игру бота
	 */
	public void addAI(String name) {
		players.add(new AIPlayer(name));
	}
	
	/**
	 * Возвращает список игроков (людей и ботов)
	 * 
	 * @return список игроков
	 */
	public Set<Player> getPlayers() {
		return players;
	}
		
}
