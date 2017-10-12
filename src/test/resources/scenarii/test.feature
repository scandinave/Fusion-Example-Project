Feature: Test Scandi.info

	Scenario: Test Home Page
		Given home
		Then navigation "http://techland.info"
		Then navigation "http://scandi.info"
		Then navigation "http://techland.info"
		
	Scenario: Test Home Page 2
		Given home
		Then navigation "http://google.fr"
		Then navigation "http://yahoo.com"
		Then navigation "http://google.fr"
