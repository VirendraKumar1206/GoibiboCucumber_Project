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
@tag
Feature: Book a flight on Goibibo

  @tag1
  Scenario: Sign up, login, and book a flight with add-ons
    Given I navigate to the Goibibo home page
    When I sign up with the username testuser and password testpass
    And I login with the username testuser and password testpass
    And I search for a round trip flight from Delhi to Mumbai on 15 August
    And I filter for non-stop flights and preferred airlines
    And I select the flight with the least cost
    And I choose additional services such as meal preferences, seat selection, and extra baggage
    And if any coupon is available, I choose one
    And I proceed to payment
    And I use the code for zero cancellation and free date change
    And I enter the passenger details
    And I enter the payment details
    Then the flight should be booked successfully
   # Examples: 
    #  | name  | value | status  |
     # | name1 |     5 | success |
     # | name2 |     7 | Fail    |
