
#Autor:Brandon

@stories
Feature: AcademyChoucair

  As a user, i want to learn how to automate in screamplay at the Choucair Academy with the automation course

  @scenario1

  Scenario Outline: Search for a automation course

    Given than brandon wants to learn automation at the academy Choucair
      | strUser   | strPassword   |
      | <strUser> | <strPassword> |
    When he search for the course on the Choucair academy platform
    | strCourse   |
    | <strCourse> |

    Then he finds the course called resources
    | strCourse                |
    | <strCourse>              |


    Examples:
      | strUser   | strPassword   | strCourse                |
      | 1094266807    |  Choucair2021* | Recursos Automatizacion Bancolombia   |