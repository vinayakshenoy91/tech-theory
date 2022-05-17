package com.concurrency.forkjoin;

import java.util.concurrent.TimeUnit;

public class Appletree {
	
	private String label;
	private int numberOfApples;
	
	public Appletree(String label) {
		this.label = label;
		this.numberOfApples=3;
		
	}
	
	
	
	public static Appletree[] newTreeGarden(int size) {
		
		Appletree[] appleTrees = new Appletree[size];
		
	    for(int i=0;i<appleTrees.length;i++) {
	    	appleTrees[i]=new Appletree("#"+i);
	    }
		
		return appleTrees;
		
	}
	
	
	public int pickApples(String workerName) {
		
		
		System.out.println(workerName+"picking apples from "+label);
		
		
		try {
			TimeUnit.SECONDS.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		return numberOfApples;
		
		
		
		
		
	}

}
