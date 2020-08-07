package com.example.interfaces;

import java.util.List;

import com.example.model.Dog;

public interface DogInter {
	 
		void saveDog(Dog dog);
     
	    List<Dog> findAllDog();
	     
	    void deleteDogById(int id);
	     
	    Dog findById(int id);
	     
	    void updateLogin(Dog dogDetails);
}
