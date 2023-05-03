package com.example.service;

import com.example.model.Admission;

public interface ServiceInf {

	public Admission saveUser(Admission adm);

	public Iterable<Admission> getAllData();

	public Admission updateAllData(Admission adm, Integer id);

	public void deleteUser(Integer id);

}
