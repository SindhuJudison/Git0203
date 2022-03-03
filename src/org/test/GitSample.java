package org.test;

public class GitSample {
	
	public void gitone() {
    System.out.println("Test one"); 
	}

	public void gittwo() {
    System.out.println("Test two"); 
	}
	
	
	private void gitfour() {
    System.out.println("Test four");
	}
	public static void main(String[] args) {
		GitSample sample =  new GitSample();
		sample.gitone();
		sample.gittwo();
		sample.gitfour();
	}
}
