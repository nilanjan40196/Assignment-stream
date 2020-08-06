package com.capg.ui;

import java.util.Arrays;
import java.util.List;

import com.capg.service.Filter;
import com.capg.service.Mapper;

public class Main {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("aaryanna","aayanna","alassandra","airianna","allanna","annabelle","annabella","anastasia","anastashia","allyanna","allianna");
		list.stream().filter(new Filter().nameStartingWithPrefix("aa")).map(new Mapper().getDistinctCharactersCount()).forEach(System.out::println);
	}

}
