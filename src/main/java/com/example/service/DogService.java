package com.example.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.DogDao;
import com.example.interfaces.DogInter;
import com.example.model.Dog;

@Service("dogService")
@Transactional
public class DogService implements DogInter {

	@Autowired
	private DogDao dogDao;
	
	@Override
	public void saveDog(Dog dog) {
		dogDao.saveDog(dog);
	}

	@Override
	public List<Dog> findAllDog() {
		return dogDao.findAllDog();
	}

	@Override
	public void deleteDogById(int id) {
		dogDao.deleteDogById(id);
	}

	@Override
	public Dog findById(int id) {
		return dogDao.findById(id);
	}

	@Override
	public void updateLogin(Dog dogDetails) {
		dogDao.updateLogin(dogDetails);
		
	}

}
