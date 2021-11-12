package com.codeline.tec.checked;

import java.util.ArrayList;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class User {

	private String username;
	private String password;
	private String email;
	private ArrayList<Edital> editais;
	
	public User(String name, String pass, String email) {
		this.username = name;
		this.email = email;
		this.password = pass;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public ArrayList<Edital> getEditais() {
		return editais;
	}

	public void setEditais(ArrayList<Edital> editais) {
		this.editais = editais;
	}
	
}
