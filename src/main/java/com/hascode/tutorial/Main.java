package com.hascode.tutorial;

import rx.Observable;

public class Main {
	public static void main(final String[] args) {
		String[] names = { "Tim", "Tom", "Susie", "Regina" };
		Observable.from(names).take(3).subscribe(t1 -> {
			System.out.println("processing " + t1);
		});
	}
}
