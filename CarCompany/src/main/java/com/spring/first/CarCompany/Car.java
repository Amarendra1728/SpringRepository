package com.spring.first.CarCompany;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
private Model model;

public Car()
{
	
}
public Car(Model model)
{
	this.model=model;
}

public Model getModel() {
	return model;
}
@Autowired
public void setModel(Model model) {
	this.model = model;
}
public void carStarted() {
	if(model !=null)
	{
	 model.startMetod();	
	}
	else
	{
		System.out.println("Not Started");
	}
}

}
