package com.spring.first.AutoWiring;

public class First {
private Second second;
	
public First() {
	
}
public First(Second second)
{
	this.second=second;
	System.out.println("This is First Constructor");
}
public Second getSecond() {
	return second;
}

public void setSecond(Second second) {
	this.second = second;
	System.out.println("This is Second Setter");
}
public void print()
{
	System.out.println(getSecond().getId());
	System.out.println(getSecond().getName());
	
}

}
