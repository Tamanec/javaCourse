package com.epam.edu;

public class Launcher {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		int[][] test = new int[10][1];
		
		test[0][0] = 1;
		System.out.println(test);
		
		
		
		////////////////////////////////////////////////////////////////////////
		
		Path path = new Path("С:\\Program files\\java\\edutasks\\class1.java");
		
		String extension = path.getExtension();
		String fileName = path.getFileName();
		StringBuilder fullName = path.getFullFileName();
		String fullPath = path.getFullPath();
		String uri = path.getUri();
		
		System.out.println(extension);
		System.out.println(fileName);
		System.out.println(fullName);
		System.out.println(fullPath);
		System.out.println(uri);	
		
	}

}
