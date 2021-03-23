import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;

public class WindowTest {
	static Window window;
   
	@BeforeClass
	public static void setUp()
    {
		window = new Window();
    }

	@Test
	public void testWindow() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyTyped() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyPressed() {
		fail("Not yet implemented");
	}

	@Test
	public void testKeyReleased() {
		fail("Not yet implemented");
	}

	@Test
	public void testAddText() {
		fail("Not yet implemented");

	}

	@Test
	public void testResponse() {
		//Test for all core coded responses
		
		// Greetings
		assertEquals(window.response("Hello", false),
				"Hello there, my name is Elon, What would you like to ask me today?");
		assertEquals(window.response("How are you?", false),
				"I'm very good, thank you.");
		
		// Default
		assertEquals(window.response("Blam", false),
				"Sorry I did not understand that. I may not have enough updates to understand what you \n\twere asking");
		
		// Thank you
		assertEquals(window.response("Thank you", false), "You're welcome");
		
		//Career Facts
		assertEquals(window.response("Zip2", false),
				"My first company was Zip2, which eventually sold to Compaq for $307 million.");
		assertEquals(window.response("First business?", false),
				"My first company was Zip2, which eventually sold to Compaq for $307 million.");
		assertEquals(window.response("First company?", false),
				"My first company was Zip2, which eventually sold to Compaq for $307 million.");
		assertEquals(window.response("SpaceX", false),
				"I am the founder of Space Exploration technologies, better known as SpaceX");
		assertEquals(window.response("Tesla", false), "In 2008 I took over as CEO of Tesla.");
		assertEquals(window.response("X.com", false),
				"I was the cofounder of X.com, which later merged with confinity to form paypal and was then \n\tsold to ebay for $1.5 Billion!");
		assertEquals(window.response("Confinity", false),
				"I was the cofounder of X.com, which later merged with confinity to form paypal and was then \n\tsold to ebay for $1.5 Billion!");
		assertEquals(window.response("Paypal", false),
				"I was the cofounder of X.com, which later merged with confinity to form paypal and was then \n\tsold to ebay for $1.5 Billion!");
		assertEquals(window.response("Ebay", false),
				"I was the cofounder of X.com, which later merged with confinity to form paypal and was then \n\tsold to ebay for $1.5 Billion!");
		assertEquals(window.response("openAI", false), "In 2015 I co-founded OpenAI, a non profit reasearch company.");
		assertEquals(window.response("NeuraLink", false),
				"In 2016 I founded Neuralink, a company that focuses on bran-computer interactions.");
		assertEquals(window.response("SolarCity", false), "In 2006 I helped create SolarCity.");
		assertEquals(window.response("What companies", false),
				"The main companies I have been involved in are: Zip2,SpaceX,Tesla,OpenAI,Neuralink and SolarCity");
		assertEquals(window.response("What businesses", false),
				"The main companies I have been involved in are: Zip2,SpaceX,Tesla,OpenAI,Neuralink and SolarCity");
		
		
		String response = window.response("Favourite thing?", false);

		//General Interests
		assertTrue(response
				.equals("I'm a big fan of dogecoin, and all forms of cryptocurrency!")
				|| response.equals("Spaceships are cool I guess.")
				|| response
				.equals("I love cars! I remember when I bought my first McLaren F1.")
				|| response.equals("Spaceships are cool I guess.")
				|| response.equals("I love anime!"));
		
		response = window.response("Favorite things?", false);
		
		assertTrue(response
				.equals("I'm a big fan of dogecoin, and all forms of cryptocurrency!")
				|| response.equals("Spaceships are cool I guess.")
				|| response
				.equals("I love cars! I remember when I bought my first McLaren F1.")
				|| response.equals("Spaceships are cool I guess.")
				|| response.equals("I love anime!"));
		
		response = window.response("Favorite hobbies?", false);
		
		assertTrue(response.equals("I'm a big fan of dogecoin, and all forms of cryptocurrency!")
				|| response.equals("Spaceships are cool I guess.")
				|| response
				.equals("I love cars! I remember when I bought my first McLaren F1.")
				|| response.equals("Spaceships are cool I guess.")
				|| response.equals("I love anime!"));
		
		
	
		// Interests Facts
		assertEquals(window.response("Favourite movie?", false),
				"Probably Parasite, it was definitely the best movie of 2019.");
		assertEquals(window.response("Favourite show?", false),
				"Black Mirror, I really like the concepts it explores.");
		assertEquals(window.response("Favorite series?", false),
				"Black Mirror, I really like the concepts it explores.");
		assertEquals(window.response("Favorite anime?", false),
				"I really enjoyed Your Name, but I'm also a fan of Studio Ghibli. Princess Mononoke is one of my\n\tfavourite films by them.");
		assertEquals(window.response("Favorite airplane?", false),
				"My favourite airplane is the SR-71 Blackbird. The A-XII in X AE A-XII is the predecessor to\n\tthis plane.");
		assertEquals(window.response("Favorite aircraft?", false),
				"My favourite airplane is the SR-71 Blackbird. The A-XII in X AE A-XII is the predecessor to\n\tthis plane.");
		
		
		// Life Facts
		assertEquals(window.response("Where were you born", false), "I was born in Pretoria, South Africa.");
		assertEquals(window.response("When were you born", false), "June 28 1971.");
		assertEquals(window.response("How old are you", false),
				"Thank you for asking. I'm 49 now and will be 50 this year.");
		assertEquals(window.response("What is your age", false),
				"Thank you for asking. I'm 49 now and will be 50 this year.");
		assertEquals(window.response("Who are your parents", false),
				"My parents were Maye who was my mother and Errol who was my father. I am not very fond\n\tof my father.");
		assertEquals(window.response("siblings", false),
				"I have two siblings. Tosca who is my sister and Kimbal who is my brother");
		assertEquals(window.response("brother", false),
				"I have two siblings. Tosca who is my sister and Kimbal who is my brother");
		assertEquals(window.response("sister", false),
				"I have two siblings. Tosca who is my sister and Kimbal who is my brother");
		assertEquals(window.response("education", false),
				"I started university in Pretoria, which I later moved to Canada and went to Queens university. \n\tThen after two years I transferred to the University of Pennsylvania. \n\tAfter That I started my phd at stanford where I dropped out after two days.");
		assertEquals(window.response("school", false),
				"I started university in Pretoria, which I later moved to Canada and went to Queens university. \n\tThen after two years I transferred to the University of Pennsylvania. \n\tAfter That I started my phd at stanford where I dropped out after two days.");
		assertEquals(window.response("first wife", false),
				"My first wife's name was Justine Wilson and we were married from 2000-2008. We had 5 \n\tchildren. One of our kids Nevada unfortunately passed away due to sudden infant death syndrome.");
		assertEquals(window.response("1st wife", false),
				"My first wife's name was Justine Wilson and we were married from 2000-2008. We had 5 \n\tchildren. One of our kids Nevada unfortunately passed away due to sudden infant death syndrome.");
		assertEquals(window.response("2nd wife", false),
				"My second wife's name was Talula Riley and we were married from 2010-2016.");
		assertEquals(window.response("second wife", false),
				"My second wife's name was Talula Riley and we were married from 2010-2016.");
		assertEquals(window.response("wife", false),
				"I have had two wives but those ended in divorce. I am currently am dating the musician Grimes");
		assertEquals(window.response("married", false),
				"I have had two wives but those ended in divorce. I am currently am dating the musician Grimes");
		assertEquals(window.response("currently dating", false),
				"I am currently dating the musician Grimes. We have one child together named X AE A-XII.\n\tWe had a fun time naming this one.");
		assertEquals(window.response("Grimes", false),
				"I am currently dating the musician Grimes. We have one child together named X AE A-XII.\n\tWe had a fun time naming this one.");
		assertEquals(window.response("first game", false), "When I was 12 I sold my first game Blastar for $500.");
		assertEquals(window.response("first software", false), "When I was 12 I sold my first game Blastar for $500.");
		assertEquals(window.response("first software", false), "When I was 12 I sold my first game Blastar for $500.");
		assertEquals(window.response("how did you learn to code", false),
				"I taught myself to code when I was around 10 years old.");
		assertEquals(window.response("how did you learn programming", false),
				"I taught myself to code when I was around 10 years old.");
		assertEquals(window.response("when did you learn to code", false),
				"I taught myself to code when I was around 10 years old.");
		assertEquals(window.response("when did you learn to program", false),
				"I taught myself to code when I was around 10 years old.");
		assertEquals(window.response("how do you spend your freetime?", false),
				"I mainly spend my time between SpaceX and Tesla, and I'm heavily involved with the engineering decisions\n\tat those companies. I also spend a lot of my time at OpenAI too.");
		assertEquals(window.response("how do you spend your time?", false),
				"I mainly spend my time between SpaceX and Tesla, and I'm heavily involved with the engineering decisions\n\tat those companies. I also spend a lot of my time at OpenAI too.");
		assertEquals(window.response("what cars do you own?", false),
				"I own a lot of cars, but mainly drive my Model S. Though I only drive Teslas now, I've owned a \n\t1978 BMW 320i and a 1967 Jaguar (E-type).");
		assertEquals(window.response("what car do you drive?", false),
				"I own a lot of cars, but mainly drive my Model S. Though I only drive Teslas now, I've owned a \n\t1978 BMW 320i and a 1967 Jaguar (E-type).");

		// Appearances/Interviews
		assertEquals(window.response("What shows have you appeared in?", false),
				"I had a cameo in The Simpsons, The Big Bang theory, South Park, and Rick and Morty. Maybe\n\tyou've seen one of my episodes?");
		assertEquals(window.response("What show have you appeared in?", false),
				"I had a cameo in The Simpsons, The Big Bang theory, South Park, and Rick and Morty. Maybe\n\tyou've seen one of my episodes?");
		assertEquals(window.response("Joe Rogan", false),
				"Yes, I was on Joe Rogan's podcast. In 2018 I think. We talked about all sorts of things, but I got\n\tin trouble for that one thing I did...");
	
		
	}

	@Test
	public void testGetNameEntityList() {
		fail("Not yet implemented");
	}


}
