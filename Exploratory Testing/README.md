# Exploratory testing - Booking a stay in a hotel.

## Explore and describe 3 key scenarios for booking a hotel. Produce a concise write-up of what you discovered when exploring these scenarios

```
Scenario 1: User book a hotel by Featured Tour.
Given I am an application user
When book a hotel room
Then my room reservation is confirmed

In this scenario, the user logs into the application and accesses to Featured Tours.
The user enters the date and the travelers and confirms the reservation.
The user chooses the Pay on arrival option.
The user finally makes the reservation.
```

```
Scenario 2: User book a hotel by Package Type Tours.
Given I am an application user
When book a hotel room by package type tours
Then my room reservation is confirmed

In this scenario, the user logs into the application and accesses to Featured Tours.
The user choose one of them packages.
The user enters personal data and confirms the reservation.
The user chooses the Pay on arrival option.
The user finally makes the reservation.
```

```
Scenario 3: User book a hotel by Featured Rentals.
Given I am an application user
When book a hotel room by featured rentals
Then my room reservation is confirmed

In this scenario, the user logs into the application and accesses to Featured rentals.
The user enters the date and the travelers.
The user enters personal data and confirms the reservation.
The user chooses the Pay on arrival option.
The user finally makes the reservation.
```

## · Exploration target: What scenario are you exploring? What's the functionality?
 · The scenario that has been explored has been the reservation of a hotel room for both tour and rental. The functionality is book a hotel room.

## · Does the site behave as you would expect? Did you discover anything that looks like a bug? Did you see anything you think could be improved?
 · Yes, the site behaves as it should be expected, the reservation can be made. You can reserve rooms that have expired status. There is also no check for correct email, mobile or address format.
 The price in the extras of the reservation are not added as they should. Example: Return Air Tickets with a price of 750, add 75 to the final price.
 To improve fix the bugs mentioned above.
 
## · Prioritisation of those use cases - which area of the website or testing would you explore first and why?
 · The first thing I would prioritize would be to test the login since it is a core functionality of any application. Then I would prioritize testing the hotel reservation, which is what this application is focused on. And last but not least I would test the payment gateway.

## · What kind of risks do you need to mitigate for this type of application?
 · It is necessary to mitigate above all the login, the hotel reservation and the payment gateway.
  
           
   
 
