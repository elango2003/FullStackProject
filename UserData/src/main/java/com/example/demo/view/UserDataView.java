package com.example.demo.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDataDTO;
import com.example.demo.model.UserDataModel;
import com.example.demo.repository.UserDataRepository;
import com.example.demo.service.UserDataService;

@RestController
@CrossOrigin(origins = { "*" })
public class UserDataView {
	@Autowired
	private UserDataService userdataservice;
	@Autowired
	private UserDataRepository userdatarepository;
	@GetMapping("/begin")
	public List<UserDataModel> getUser(){
		return userdataservice.getUser();
	}
    @PostMapping("/create")
    public @ResponseBody String addNewUser(@RequestBody UserDataDTO userdatadto) {
    	return userdataservice.postUser(userdatadto);
    }
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Integer id) {
    	return userdataservice.deleteUser(id);
    }
    @PutMapping("/update")
    public String putUser(@RequestBody UserDataDTO userdatadto) {
    	return userdataservice.putUser(userdatadto);
    }
}
