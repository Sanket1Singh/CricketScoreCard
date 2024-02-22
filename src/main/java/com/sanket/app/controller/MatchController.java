package com.sanket.app.controller;

import java.util.List;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sanket.app.entities.Match;
import com.sanket.app.service.MatchService;

@RestController
@RequestMapping("/cricket")
@CrossOrigin("*")
public class MatchController {

	  private MatchService matchService;
	  
	 public MatchController(MatchService matchService) {
		this.matchService = matchService;
	}

	@GetMapping("/live")
	    public ResponseEntity<?> getLiveMatches()  {
	        System.out.println("getting live match");
	        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
	    }

	    @GetMapping("/point-table")
	    public ResponseEntity<?> getPointTable() {
	        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
	    }

	    @GetMapping
	    public ResponseEntity<List<Match>> getAllMatches() {
	        return new ResponseEntity<>(this.matchService.getAllMatches(), HttpStatus.OK);
	    }
}
