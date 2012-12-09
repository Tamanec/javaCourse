package com.epam.edu;

/**
 * Класс игрока
 * 
 * @author
 */
abstract public class Player implements Comparable<Player>{
	
	/**
	 * Имя игрока
	 */
	protected String name;
	
	/**
	 * Количество побед 
	 */
	protected int winsCount;
	
	public Player(String name) {
		this.setName(name);
	}
	
	/**
	 * Получает команду от игрока
	 * 
	 * @return идентификатор команды
	 */
	abstract public Command getCommand();
	
	/**
	 * Кидает кубик
	 * 
	 * @return результат броска
	 */
	abstract public int throwCube();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getWinsCount() {
		return winsCount;
	}

	public void setWinsCount(int winsCount) {
		this.winsCount = winsCount;
	}

}
