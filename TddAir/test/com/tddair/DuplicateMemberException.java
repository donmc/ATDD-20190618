package com.tddair;

public class DuplicateMemberException extends RuntimeException {
    public DuplicateMemberException() {
    	super("username already exists");
    }
}
