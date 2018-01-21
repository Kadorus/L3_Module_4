// Below is a completed program that uses brute force to crack a 9-digit password. 
// On average, the program takes about 0.125 seconds to find the password.
// Your goal is to re-write the algorithm using Threads. Try to shorten the time it takes 
// to find the code to be as little as possible.
// Let's see who can crack the code the fastest!

// Pro-tip: Do not include the creation of the threads as part of the time. 
package threads;

import java.util.Random;

public class BruteForceCracker {
	static long code = (long)(new Random().nextDouble() * 1_000_000_000);
	
	static long startTime;
	static long endTime;
	static float elapsedTime;
	
	public static void main(String[] args) {
		
		Thread t1 = new Thread(()->{
			for(int i = 0; i < 100000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1 = new Thread(()->{
			for(int i = 100000000; i < 200000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1 = new Thread(()->{
			for(int i = 200000000; i < 300000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1 = new Thread(()->{
			for(int i = 300000000; i < 400000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1 = new Thread(()->{
			for(int i = 400000000; i < 500000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1t1 = new Thread(()->{
			for(int i = 500000000; i < 600000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1t1t1 = new Thread(()->{
			for(int i = 600000000; i < 700000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1t1t1t1 = new Thread(()->{
			for(int i = 700000000; i < 800000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1t1t1t1t1 = new Thread(()->{
			for(int i = 800000000; i < 900000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		Thread t1t1t1t1t1t1t1t1t1t1 = new Thread(()->{
			for(int i = 900000000; i < 1000000000; i++) {
				if(checkCode(i)) {
					endTime = System.currentTimeMillis();
					elapsedTime = (float)(endTime - startTime);
					elapsedTime /= 1000.f;
					System.out.println("Total time taken: " + elapsedTime + " seconds");
				}
			}
		});
		
		System.out.println("Starting Brute Force Checker");
		startTime = System.currentTimeMillis();
		
		t1.start();
		t1t1.start();
		t1t1t1.start();
		t1t1t1t1.start();
		t1t1t1t1t1.start();
		t1t1t1t1t1t1.start();
		t1t1t1t1t1t1t1.start();
		t1t1t1t1t1t1t1t1.start();
		t1t1t1t1t1t1t1t1t1.start();
		t1t1t1t1t1t1t1t1t1t1.start();
		
	}
	
	public static boolean checkCode(long p){
		if(p == code){
			return true;
		}else{
			return false;
		}
	}
}
