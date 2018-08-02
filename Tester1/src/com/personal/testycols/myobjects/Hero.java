package com.personal.testycols.myobjects;

public class Hero {
	
	private String name;
	private String race;
	private Integer level;
	private String heroClass;

	public Hero(String name, String race, Integer level, String heroClass) {
		super();
		this.name = name;
		this.race = race;
		this.level = level;
		this.heroClass = heroClass;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRace() {
		return race;
	}

	public void setRace(String race) {
		this.race = race;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public String getHeroClass() {
		return heroClass;
	}

	public void setHeroClass(String heroClass) {
		this.heroClass = heroClass;
	}
}
