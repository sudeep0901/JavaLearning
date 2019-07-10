package com.sudeep.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface Customer_annotation {

//	public String anno() ;
	public String anno() default "Default India";
	
//	public String value() default "Default India"; //no need to give name when using annotation simply can provide value directly
//	@Customer_annotation
//	public class EmployeeDefault {
}