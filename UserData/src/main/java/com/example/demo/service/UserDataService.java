package com.example.demo.service;

import java.util.List;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.model.UserDataModel;

public interface UserDataService {
	public List<UserDataModel> getUser();
	public String postUser(UserDataDTO userdatadto);
	public String deleteUser(Integer id);
	public String putUser(UserDataDTO userdatadto);
}
