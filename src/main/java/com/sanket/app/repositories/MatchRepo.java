package com.sanket.app.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sanket.app.entities.Match;

public interface MatchRepo extends JpaRepository<Match,Integer>
{
	
	Optional<Match>findByTeamHeading(String teamHeading);
	

}
