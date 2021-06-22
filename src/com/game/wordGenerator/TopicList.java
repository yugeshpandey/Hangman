package com.game.wordGenerator;

public class TopicList {
	
	public static String[] getTopic(int topicNumber) {
		
		String animals[] = {"PYTHON", "ALLIGATOR", "TURTLE", "CHEETAH", "ELEPHANT", "TIGER"};
		String birds[] ={"PELICAN", "CROW", "SPARROW", "SEAGULL", "TURKEY", "CHICKEN"};
		String[] selectedTopic = animals;
		
		switch (topicNumber) {
		case 1:
			selectedTopic = animals;
			break;
		case 2:
			selectedTopic = birds;
			break;
		}
		
		
		return selectedTopic;
	}

}
