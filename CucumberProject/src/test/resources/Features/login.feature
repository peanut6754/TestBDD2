#Author: Basanta Poudel 

 Feature: Login 
 
 Scenario: Sucessful login with valid credentails 
 
 
 Given User opens URL 
 And User entres Email and password  
 And User click on login button
 Then Page tile should be Products
 When User click on log out link
 And User click on sauce labs Backpack
 And User close the browser
 
 
 
 
 

    