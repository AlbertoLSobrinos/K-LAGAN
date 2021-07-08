@phptravels
Feature: As a user I want to be able to book a hotel.

  Scenario: User book a hotel by Featured Tour.
    Given I am an application user
    When book a hotel room
    Then my room reservation is confirmed
