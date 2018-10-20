package com.myspringboot.jokeapp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class ChuckConfiguration {

	//@Bean
	public ChuckNorrisQuotes ChuckNorrisQuotes() {

		return new ChuckNorrisQuotes();
	}
}
