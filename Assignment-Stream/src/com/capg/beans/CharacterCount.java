package com.capg.beans;

public class CharacterCount {
	
	private int distinctCharacterCount;
	private String name;
	public int getDistinctCharacterCount() {
		return distinctCharacterCount;
	}
	public void setDistinctCharacterCount(int distinctCharacterCount) {
		this.distinctCharacterCount = distinctCharacterCount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public CharacterCount(int distinctCharacterCount, String name) {
		super();
		this.distinctCharacterCount = distinctCharacterCount;
		this.name = name;
	}
	public CharacterCount() {
		super();
	}
	@Override
	public String toString() {
		return "CharacterCount [distinctCharacterCount=" + distinctCharacterCount + ", name=" + name + "]";
	}
	
	
	
}
