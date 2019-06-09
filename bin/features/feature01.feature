#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template

Feature: trying to check login functionality

#Background:
#Given user has opened website in chrome
 #   And user enters username and password
    
    Background:
Given user has opened website in chrome
    And user enters 'batman' and 'batman'

  #Scenario: checking login functionality
    #Given user has opened website in chrome
    #And user enters username and password
   # When I complete action
#And some other action
    #And yet another action
   # Then I validate the outcomes
    #And check more outcomes
    
    Scenario:Login
    When user selects oneway radio
    Then only one way radio button should be selected
    
    #passing parameter
    Scenario Outline: Dropdown selection
    When user selects <Country> from to port
    Then paris should be selected in to port option
    
    Examples:
    | Country |
    | Paris |
    

  