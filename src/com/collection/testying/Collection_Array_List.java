package com.collection.testying;

import java.util.ArrayList;
import java.util.List;

public class Collection_Array_List {

	public static void main(String[] args) {
		System.out.println("ADD");
		List<Integer> a = new ArrayList<Integer>();

		a.add(12);
		a.add(23);
		a.add(45);
		a.add(67);
		a.add(98);
		a.add(2, 32);
		System.out.println(a);

		System.out.println("SIZE");
		int b = a.size();
		System.out.println("" + b);

		System.out.println("CONTAINS");
		boolean D = a.contains(23);
		System.out.println("" + D);

		System.out.println("INDEXOF");
		int F = a.indexOf(45);
		System.out.println("" + F);

		System.out.println("LAST INDEXOF");
		int H = a.lastIndexOf(98);
		System.out.println("" + H);

		System.out.println("INDEXOF UNKNOWN VALUE");
		int J = a.indexOf(99);
		System.out.println("" + J);

		System.out.println("GET");
		Integer L = a.get(0);
		System.out.println("" + L);

		System.out.println("CLEAR");
		a.clear();
		boolean Q = a.isEmpty();
		System.out.println(a);

		System.out.println("IS EMPTY");
		System.out.println("" + Q);

		System.out.println("GET UNKNOWN");
		Integer N = a.get(6);
		System.out.println("" + N);

	}

}
