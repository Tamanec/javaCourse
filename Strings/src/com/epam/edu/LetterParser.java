package com.epam.edu;

public class LetterParser {

	private String target;
	private int[] letterEntries;
	
	public LetterParser(String target) {
		this.target = target;		
	}
	
	public int[] getEntries() {
		if (letterEntries == null) {
			letterEntries = new int[target.length()];
			
			for (int i = 0; i < target.length(); i++) {
				if (target.charAt(i)) {
					
				}
			}
			
			letterEntries['a'] = 0;
		} 
		
		return letterEntries;
	}
	
}
