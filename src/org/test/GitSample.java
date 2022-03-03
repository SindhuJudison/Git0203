package org.test;

public class GitSample {

	public void gitone() {
		System.out.println("Test one");
	}

	public void gittwo() {
		System.out.println("Test two");
	}

	// <<<<<<< HEAD

	private void gitfour() {
		System.out.println("Test four");
	}

	// =======
	private void gitthree() {
		System.out.println("Test three");
	}

	// >>>>>>> 8d93de035e0df4bb28de67f41624089f565a32dc
	public static void main(String[] args) {
		GitSample sample = new GitSample();
		sample.gitone();
		sample.gittwo();
		// <<<<<<< HEAD
		sample.gitfour();
		// =======
		sample.gitthree();
		// >>>>>>> 8d93de035e0df4bb28de67f41624089f565a32dc
	}
}
