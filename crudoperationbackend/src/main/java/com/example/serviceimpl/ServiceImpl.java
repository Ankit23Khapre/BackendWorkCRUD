package com.example.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.model.Admission;
import com.example.repository.UserRepository;
import com.example.service.ServiceInf;
@Service
public class ServiceImpl implements ServiceInf {

	@Autowired
	UserRepository userRepo;
	
	@Override
	public Admission saveUser(Admission adm) {
		Admission s = userRepo.save(adm);
		return s;
	}

	@Override
	public Iterable<Admission> getAllData() {
		List<Admission> get = userRepo.findAll();
		return get;
	}

	@Override
	public Admission updateAllData(Admission adm, Integer id) {
		Optional<Admission> byid = userRepo.findById(id);
		if(byid.isPresent())
		{
			adm.setId(byid.get().getId());
			return userRepo.save(adm);
		}
		else
		{
			return null;
		}
	}

	@Override
	public void deleteUser(Integer id) {
		userRepo.deleteById(id);
	}

}
