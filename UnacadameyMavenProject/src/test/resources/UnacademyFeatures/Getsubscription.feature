Feature: GetSubscription



Scenario Outline: Able to see subscription modules
    Given user is on the homepage of unacademy
    When user clicks on get subscription
    Then user is in the Getsubscription part of unacademy
    And user can see benefits of the Plus subscription
    When user clicks on desired option as "<Option>"
    Then user can see respective subscription plans
    When user selects a required paln as "<Plan>"
    Then user can see selected subscription plan page
    When user clicks on proceed to pay
    Then user can see payment method page
    
     Examples: 
      | Option | Plan      |
      | Plus   | 12 months |
      | Iconic | 36 months |