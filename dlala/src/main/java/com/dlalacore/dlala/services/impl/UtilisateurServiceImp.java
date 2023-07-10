package com.dlalacore.dlala.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dlalacore.dlala.entities.Utilisateur;
import com.dlalacore.dlala.reposetories.UtilisateurReposetorie;
import com.dlalacore.dlala.services.UtilisateursService;

public class UtilisateurServiceImp implements UtilisateursService {
	@Autowired
	UtilisateurReposetorie utilisateurrepo;

	@Override
	public Utilisateur save(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Utilisateur> getAll() {

		return utilisateurrepo.findAll();
	}

	@Override
	public Utilisateur getUtilisateur(Integer userID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(Utilisateur utilisateur) {
		// TODO Auto-generated method stub

	}

}
