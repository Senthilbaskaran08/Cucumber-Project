Feature: Facebook Login
Scenario Outline: scenario description
	Given Facebook homepage launch
		And User enter "<Username>" and "<Password>" and click login button
		Then Close the browser
		
		Examples:
		| Username | Password | 
		| bsenthil30@gmail.com | sengi12345 | 
		| senthilbaskaran08@gmail.com | sengi12345 | 
	