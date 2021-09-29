Feature: Book flight

  Scenario Outline: Successful flight booking
    Given User is on the home page
    When User enters the flight information
      | from           | <from>           |
      | toward         | <toward>         |
      | departureMonth | <departureMonth> |
      | departureDay   | <departureDay>   |
      | returnMonth    | <returnMonth>    |
      | returnDay      | <returnDay>      |
      | passengers     | <passengers>     |
    Then Book a successful flight and view the message <message>
    Examples:
      | from     | toward | departureMonth | departureDay | returnMonth | returnDay | passengers | message                                              |
      | Medellín | Bogotá | Octubre        | 15           | Noviembre   | 5         | 1          | ¡Falta poco! Completa tus datos y finaliza tu compra |