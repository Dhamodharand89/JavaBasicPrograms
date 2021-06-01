package com.au.firstmaven;

public class TrimExtraSpaceUsingRegx {

	public static void main(String[] args) {
		String name = " I love India ";
		System.out.println(name.trim());
		System.out.println(name.strip());
		System.out.println(name.stripLeading());
		System.out.println(name.stripTrailing());
		System.out.println(name.stripIndent());
		System.out.println(name.replaceAll("^[ \t]+|[ \t]+$", "*"));
		System.out.println(name.replaceAll("^[ \t]", "*"));
		System.out.println(name.replaceAll("[ \t]+$", "*"));
				

	}

}
