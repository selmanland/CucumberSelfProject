Feature: User should be able to login

  Background:
    Given the user is on the login page

  Scenario: Login as a driver
    When the user enter the driver information

  Scenario: Login as a any user
    When the user enter login information "User10" and "UserUser123"
    Then the user should be able to login
    And the title is "Dashboard"

    #homework
  @login
  Scenario: login as a driver
    Given the user logged in as "sales manager"
    And the title is "Dashboard"

  @ddt
  Scenario Outline: Different user log in <users>
    Given the user logged in following accounts
      | username | <users>    |
      | password | <password> |
    Examples:
      | users           | password    |
      | user1           | UserUser123 |
      | salesmanager101 | UserUser123 |
      | storemanager85  | UserUser123 |