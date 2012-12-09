package com.epam.edu;

/**
 * Класс для работы с результатами игроков
 * @author Denis
 */
public class Result implements Comparable<Result> {
	
	/**
	 * Игрок бросивший кости
	 */
	private Player player;
		
	/**
	 * Количество набранных очков
	 */
	private int score;
	
	public Result(Player player, int score) {
		this.player = player;
		this.score = score;
	}

	public Player getPlayer() {
		return player;
	}

	public void setPlayer(Player player) {
		this.player = player;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * Сравнивает результаты по счету
	 */
	@Override
	public int compareTo(Result other) {
		if (this.score == other.score) {
			return 0;
		} 
		
		return (this.score < other.score) ? -1 : 1;
	}

}
