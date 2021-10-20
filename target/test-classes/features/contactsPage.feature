Feature: Contacs page

@contact
  Scenario: Verify Create Calender Event
    Given the user is on the login page
    And the user logged in as "store manager"
    When the user navigates to "Activities" "Calendar Events"
    Then the title contains "Calendars"
  @contact
  Scenario: Menu Options Sales Manager
    Given the user logged in as "sales manager"
    Then the user should see following options
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
@maps
  Scenario: Login with different user
    Given the user is on the login page
    When the user logs following credentials
      | username  | user10      |
      | password  | UserUser123 |
      | firstname | Brenden     |
      | lastname  | Schneider   |