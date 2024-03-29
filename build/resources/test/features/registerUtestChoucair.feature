#Author: Carlos Martínez
@stories

Feature: Utest User Registration
  As a user, I want to register on the Utest platform

  @scenario

  Scenario: Register on Utest

    Given the Utest website we look for the Join Today registration

      | strFirstName | strLastName | strEmail           |  strMonth    | strDay  | strYear | strLanguage | strCity | strZipCode | strCountry |  strComputer | strVersion |
      |   Mario      | Gonzalez    |magodeoz@correo.com |     june     | 25      | 1995    | Spanish     | Corozal | 705030     | Colombia   |  Windows     | 10         |

    When you enter this section you fill in the required information and save

      | strFirstName | strLastName |strEmail            |  strMonth    | strDay  | strYear | strLanguage | strCity  | strZipCode | strCountry |  strComputer | strVersion |
      |   Mario      | Gonzalez    |magodeoz@correo.com |     june     | 25      | 1995    | Spanish     | Corozal  | 705030     | Colombia   |  Windows     | 10         |

    Then this stores the user to then be able to access and use the services of the platform

      | strFirstName | strLastName |strEmail            |  strMonth    | strDay  | strYear | strLanguage | strCity  | strZipCode | strCountry |  strComputer | strVersion |
      |   Mario      | Gonzalez    |magodeoz@correo.com |     june     | 25      | 1995    | Spanish     | Corozal  | 705030     | Colombia   |  Windows     | 10         |