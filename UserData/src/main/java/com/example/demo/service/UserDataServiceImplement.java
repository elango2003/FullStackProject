package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.annotations.DialectOverride.OverridesAnnotation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.model.UserDataModel;
import com.example.demo.repository.UserDataRepository;

import jakarta.transaction.Transactional;
@Service
public class UserDataServiceImplement implements UserDataService {
	@Autowired
	private UserDataRepository userdatarepository;
	private UserDataDTO userdatadto;
//	@Override
//	public List<UserDataModel> getUser(){
//		List<UserDataModel> usermodel = userdatarepository.findAll();
//		return usermodel;
//	}
	
	@Override
	public List<UserDataModel> getUser() {
		List<UserDataModel> userdatamodel = userdatarepository.findAll();
		return userdatamodel;
	}
	@Transactional
	@Override
	public String postUser(UserDataDTO userdatadto) {
	    UserDataModel userdatamodel = new UserDataModel();
	    userdatamodel.setId(userdatadto.getId());  // Optional: if ID should be auto-generated, avoid setting it
	    userdatamodel.setOwner(userdatadto.getOwner());
	    userdatamodel.setDoorNo(userdatadto.getDoorNo());
	    userdatarepository.save(userdatamodel);  // Saving to the repository
	    return "Success";
	}
	@Transactional
	@Override
	public String deleteUser(Integer id) {
		Optional<UserDataModel> userOptional = userdatarepository.findById(id);
		userdatarepository.deleteById(id);
		return "Deleted Successfully";
	}
	@Transactional 
	@Override
	public String putUser(UserDataDTO userdatadto) {
		Optional<UserDataModel> optionalUserData = userdatarepository.findById(userdatadto.getId());
		UserDataModel userdatamodel = optionalUserData.get();
		userdatamodel.setOwner(userdatadto.getOwner());
		userdatamodel.setDoorNo(userdatadto.getDoorNo());
		return "Updated successfully";
	}
}
