
#Author: Basanta

Feature: Home page
 

  Scenario: Testing with positive data for home page
    Given User is in the login home page
    When  User is going to enter  user name 
    And User is going to enter user password 
    And User is going to click on login button 
    Then User should navigate to the login page
   
    

 
  