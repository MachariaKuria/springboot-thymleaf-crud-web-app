package net.javaguides.springboot.service;

import java.util.List;

import net.javaguides.springboot.model.Mwanafunzi;

public interface MwanafunziService {
	List<Mwanafunzi> getAllWanafunzi();
	void saveMwanafunzi(Mwanafunzi mwanafunzi);
	Mwanafunzi getMwanafunziById(long id);
	void deleteMwanafunziById(long id);
}
