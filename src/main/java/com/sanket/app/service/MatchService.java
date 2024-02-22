package com.sanket.app.service;

import java.util.List;
import java.util.Map;

import com.sanket.app.entities.Match;

public interface MatchService {
	
	List<Match>getAllMatches();
	
	List<Match>getLiveMatches();
	
	List<List<String>>getPointTable();
	
	

}
