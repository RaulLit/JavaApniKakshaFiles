package oops.interfaces;

public abstract interface Youtuber extends VideoEditor{
	
	int x = 5;
	
	abstract void makeVideo();
	
	default void uploadVideo() {		//You can instantiate a method in an interface using default keyword in java 8 and above.
		System.out.println("The video is uploading");
	}
	
	// This can create a diamond problem. You can avoid it by overriding it in the main class.
}
