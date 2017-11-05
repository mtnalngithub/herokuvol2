package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.Address;

@RestController
public class HomeController {

	public static final String HOME_ADRES = "/address";
	
	@RequestMapping("/")
	public String homePage(){
		return "home...";
	}
	
	@RequestMapping(HOME_ADRES)
	public String address(){
		return "address...";
	}
	
	@RequestMapping("getAddress")
	public Address getAddress(){
		return new Address(1L, "kızılay", "Ankara");
	}
	
	@CrossOrigin
	@RequestMapping("getAllAddresses")
	public List<Address> getAllAddresses(){
		List<Address> liste = new ArrayList<Address>();
		liste.add(new Address(1L, "kızılay", "Ankara"));
		liste.add(new Address(2L, "tunalı", "Ankara"));

		return liste;
	}
}
