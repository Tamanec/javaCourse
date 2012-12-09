package com.epam.edu;

public class Path {

	private String fullPath;
	private char delimiter = '\\';
	private int extensionStart;
	private int fileNameStart;
	private StringBuilder fullFileName = new StringBuilder();

	public Path(String fullPath) {
		this.fullPath = fullPath.replace('/', '\\');
		init();
	}

	public String getExtension() {
		return fullPath.substring(extensionStart + 1);
	}

	public String getFileName() {
		return fullPath.substring(fileNameStart + 1, extensionStart);
	}

	public StringBuilder getFullFileName() {
		return fullFileName;
	}

	public String getFullPath() {
		return fullPath;
	}

	public String getUri() {
		return fullPath.substring(fullPath.indexOf(delimiter) + 1);
	}

	public void setSrc(String src) {
		this.fullPath = src;
		init();
	}

	private void init() {
		extensionStart = fullPath.lastIndexOf('.');
		fileNameStart = fullPath.lastIndexOf(delimiter);
		fullFileName.append(getFileName()).append('.').append(getExtension());
	}

}
