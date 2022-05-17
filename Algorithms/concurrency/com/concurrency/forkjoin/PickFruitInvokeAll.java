package com.concurrency.forkjoin;

import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;

public class PickFruitInvokeAll {

	public static void main(String[] args) {

		Appletree[] garden = Appletree.newTreeGarden(6);
		
		
		Callable<Void> picker1 = createApplePicker(garden, 0, 3, "manoj");
		Callable<Void> picker2 = createApplePicker(garden, 3, 6, "vikram");
		
		//This provides best performance in most cases
		ForkJoinPool.commonPool().invokeAll(Arrays.asList(picker1, picker2));
		
		System.out.println("All fruits are collected");
		

	}

	public static Callable<Void> createApplePicker(Appletree[] appleTrees,int fromIndex,int toIndex, String workerName){
		
		
		return ()->{
			
			for(int i=fromIndex; i<toIndex;i++) {
				appleTrees[i].pickApples(workerName);
			}
			return null;	
			
		};
		
		
		
		
	}

}
