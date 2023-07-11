package com.dlalacore.dlala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dlalacore.dlala.entities.Utilisateur;
import com.dlalacore.dlala.exception.UtilisateurNotFoundException;
import com.dlalacore.dlala.reposetories.UtilisateurReposetorie;
import com.dlalacore.dlala.services.UtilisateursService;

@Controller
public class UtilisateurController {
	@Autowired(required = true)
	private UtilisateursService			userService;
	@Autowired
	private UtilisateurReposetorie	repositorie;

	@RequestMapping(value="/utilisateurs")
	public @ResponseBody List<Utilisateur> getUtilisateurs() {
		return repositorie.findAll();

	}

	@RequestMapping(value="/utilisateur/{id}")
	@ResponseBody
	public Utilisateur getUtilisateurByName(@PathVariable Integer id) {
		return repositorie.findById(id).orElseThrow(() -> new UtilisateurNotFoundException(id));
	}

	// pas pour le moment
	
	@RequestMapping(value="/addUtilisateur/", produces = "application/json", 
		  method=RequestMethod.POST)
	public Utilisateur addUtilisateur() {
//		@PathVariable String nom, @PathVariable String prenom,
//    @PathVariable String courriel, @PathVariable String password
		Utilisateur newUtilisateur = new Utilisateur();
		return repositorie.save(newUtilisateur);
	}

}
