package com.cxytiandi.hystrix_native_demo.demo1;

import com.netflix.hystrix.strategy.concurrency.HystrixRequestContext;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws InterruptedException, ExecutionException {
		HystrixRequestContext context = HystrixRequestContext.initializeContext();
		String result = new MyHystrixCommand("yinjihuan").execute(); 
		System.out.println(result);

		Future<String> future = new MyHystrixCommand("yinjihuan").queue();
		System.out.println(future.get());
		context.shutdown();

	}
}
