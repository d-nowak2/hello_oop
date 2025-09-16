package clone_wordle;

import java.util.ArrayList;

public class WordleGame 
{
	private static final String[] WORDBANK = {"Apple", "Basic", "Brown", "Crowd", "False", "Place", "Smart", "Stark", "Vivid", "Valid", "Zebra"};
	private static final QuickSearchArray WORDS = new QuickSearchArray(WORDBANK);
	private static final String CONTINUE_PLAYING = "y";
	private static final int MAX_GUESSES = 6;
	public WordleGame() {};
	
	public void setUp()
	{
		ConsoleIO console = new ConsoleIO();
		console.say("Welcome to wordle! Please wait while we set stuff up!");
		
		//Inner game loop:
		boolean gameIsRunning = true;
		while(gameIsRunning)
		{
			String secretWord = WORDS.getRandom().toLowerCase();
			console.say("New game started! Have fun!");
			ArrayList<String> previousGuesses = new ArrayList<String>(MAX_GUESSES); //That will be the max size
			
			//Max framework of a game encapsulated in a single loop:
			boolean failed = true; //Take a negative perspective of the user
			for(int i = 0 ; i < MAX_GUESSES ; i++)
			{
				String input = console.ask("Guess #" + (i + 1) + ". Please make your guess. This must be a five letter word, and in the dictionary").toLowerCase();
				//Since our dictionary is the search engine and all the dictionary words are 5 in length no need to check that the word is long enough:
				boolean wordWorks = false;
				while(!wordWorks)
				{
					wordWorks = WORDS.contains(input);
					if(wordWorks)
					{
						//Before we leave make sure that the word is not previously used:
						boolean previousWordUsed = false;
						for(int a = 0 ; a < previousGuesses.size() ; a++) //Brute force method. And since there will only be 6 total its not a bad way to do this
						{
							if(previousGuesses.get(a).equals(input))
							{
								previousWordUsed = true;
								break;
							}
						}
						if(previousWordUsed)
						{
							wordWorks = false;
							input = console.ask("Guess #" + (i + 1) + ". You have already guessed that! Please make another guess. This must be a five letter word, and in the dictionary").toLowerCase();
							continue;
						}
						break;
					}
					input = console.ask("Guess #" + (i + 1) + ". Invalid word! Please make another guess. This must be a five letter word, and in the dictionary").toLowerCase();
				}
				GuessWord guess = new GuessWord(input);
				int score = guess.evaluateWordScore(secretWord);
				previousGuesses.add(input);
				
				//Do the console printing and formating:
				console.formatGuess(guess);
				
				if(score == GuessWord.SAME_SCORE) //Win condition
				{
					console.say("You figured out the word in " + (i + 1) + " guesses!");
					failed = false;
					break;
				}
			}
			if(failed)
			{
				console.say("Out of guesses! The word was: " + secretWord);
			}
			
			
			String input = console.ask("Do you want to continue playing? (y/n)");
			gameIsRunning = input.toLowerCase().equals(CONTINUE_PLAYING);
		}
		console.say("Please play again next time!");
		console.close(); 
	}
}