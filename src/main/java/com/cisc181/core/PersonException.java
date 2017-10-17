package com.cisc181.core;

public class PersonException extends Exception {
	private Person personException;
	
	public PersonException(Person person){
		this.personException = person;
	}
}
