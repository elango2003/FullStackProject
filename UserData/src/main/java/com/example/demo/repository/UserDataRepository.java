package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.UserDataModel;

public interface UserDataRepository extends JpaRepository<UserDataModel, Integer> {
//	void deleteByDoorNo(Integer doorno);
	 @Query(value = "SELECT * FROM DOORNO,OWNERNAME WHERE ID = ?1 ", nativeQuery = true)
	 UserDataModel getUserDetail(Integer id);
}
