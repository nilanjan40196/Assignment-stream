package com.capg.service;

import java.util.function.Predicate;

public class Filter {
	
	public Predicate<String> nameStartingWithPrefix(String prefix){
		return s-> {
			return s.substring(0,2).equalsIgnoreCase(prefix);
		};
	}
}
