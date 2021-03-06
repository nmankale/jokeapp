package com.myspringboot.jokeapp.service;

import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeSreviceImpl implements JokeService{

	private final ChuckNorrisQuotes chuckNorrisQuotes;
	
	
//	public JokeSreviceImpl() {
//		super();
//		this.chuckNorrisQuotes = new ChuckNorrisQuotes();
//	}


	public JokeSreviceImpl(ChuckNorrisQuotes chuckNorrisQuotes) {
		super();
		this.chuckNorrisQuotes = chuckNorrisQuotes;
	}


	@Override
	public String getJoke() {
		
		return chuckNorrisQuotes.getRandomQuote();
	}

	
}
