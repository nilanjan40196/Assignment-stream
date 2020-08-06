package com.capg.service;

import java.util.HashSet;
import java.util.Set;
import java.util.function.Function;

import com.capg.beans.CharacterCount;

public class Mapper {
	public Function<String, CharacterCount> getDistinctCharactersCount(){
		return s -> {
			Set<Character> crr = new HashSet<>();
			for(char c : s.toCharArray()) {
				crr.add(c);
			}
			return new CharacterCount(crr.size(), s);
		};
	}
}
