package net.javaguides.springboot.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.javaguides.springboot.model.Mwanafunzi;
import net.javaguides.springboot.repository.MwanafunziRepository;

@Service
public class MwanafunziServiceImpl implements MwanafunziService {

	@Autowired
	private MwanafunziRepository mwanafunziRepository;
	
	@Override
	public List<Mwanafunzi> getAllWanafunzi(){		
		return mwanafunziRepository.findAll();
	}

	@Override
	public void saveMwanafunzi(Mwanafunzi mwanafunzi) {
		this.mwanafunziRepository.save(mwanafunzi);
		
	}

	@Override
	public Mwanafunzi getMwanafunziById(long id) {
		Optional<Mwanafunzi> optional = mwanafunziRepository.findById(id);
		Mwanafunzi mashaa = null;
		if(optional.isPresent()) {
			mashaa = optional.get();
		}else {
			throw new RuntimeException(" Mwanafunzi hangepatikana mweneye id :: " + id);
		}
		
		return mashaa;
	}

	@Override
	public void deleteMwanafunziById(long id) {
		this.mwanafunziRepository.deleteById(id);
	}


	
}
