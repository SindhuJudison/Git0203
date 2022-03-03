package org.test;

public class GitSample {
	
	public void gitone() {
    System.out.println("Test one"); 
	}

	public void gittwo() {
    System.out.println("Test two"); 
	}
	
	private void gitthree() {
    System.out.println("Test three");
	}
	
	public static void main(String[] args) {
		GitSample sample =  new GitSample();
		sample.gitone();
		sample.gittwo();
		sample.gitthree();
	}
}
