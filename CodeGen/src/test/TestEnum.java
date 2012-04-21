package uml.test;

import java.lang.reflect.Type;

import uml.java.modeling.interfaces.IMembers;

public enum TestEnum implements IMembers {
	GET_MEMB {public Type getMemberClass(){return this.getClass();}},
	GET_NOT_A_MEMB {public Type getMemberClass(){return null;}}
}
