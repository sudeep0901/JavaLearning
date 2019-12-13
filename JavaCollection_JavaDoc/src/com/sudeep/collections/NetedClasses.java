package com.sudeep.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

import com.sudeep.collections.OuterClass.InnerClasss;

public class NetedClasses {

//	static void filter(Collection<?> c) {
//		for(Iterator<?> it = c.iterator();it.hasNext();)
//			if (!cond(it.next()))
//				it.remove();
//	}
	public static void main(String[] args) throws InterruptedException {
		OuterClass emp = new OuterClass();

		OuterClass.InnerClasss inclass = emp.new InnerClasss();

		inclass.setSalaryFather(10000.111);
		inclass.getSalaryFather();
		
		System.out.println(inclass.getSalaryFather());
		
		OuterClass.statiClass staticclass = new OuterClass.statiClass();
		
		staticclass.setStaticString("Static call call method");
		System.out.println(staticclass.getStaticString());
		
		inclass.methodFirstLevel(10);
		
	}

}
