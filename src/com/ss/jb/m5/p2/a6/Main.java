package com.ss.jb.m5.p2.a6;

public class Main {

	public static void main(String[] args) {
		SampleSingleton instance = SampleSingleton.getInstance();
		System.out.println(instance.getConn());
		
		Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                SampleSingleton instance1 = SampleSingleton.getInstance();
                System.out.println(instance1.getConn());
            }
        };
        
        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                SampleSingleton instance2 = SampleSingleton.getInstance();
                System.out.println(instance2.getConn());
            }
        };
        
        Runnable runnable3 = new Runnable() {
            @Override
            public void run() {
                SampleSingleton instance3 = SampleSingleton.getInstance();
                System.out.println(instance3.getConn());
            }
        };
        
        (new Thread(runnable1)).start();
        (new Thread(runnable2)).start();
        (new Thread(runnable3)).start();
        
        System.out.println("SampleSingleton instance count: " + SampleSingleton.instanceCount);
        System.out.println("SampleSingleton get instance call count: " + SampleSingleton.callCount);
	}
}
