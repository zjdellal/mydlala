package com.dlalacore.dlala.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dlalacore.dlala.entities.Utilisateur;
import com.dlalacore.dlala.services.UtilisateursService;

@RestController
@RequestMapping("/api/utilisateurs")
public class UtilisateurController {
	@Autowired(required=true)
	private UtilisateursService userService;

	@GetMapping("/utilisateursListe")
	public List<Utilisateur> getUtilisateurs() {
		return userService.getAll();

	}

}
