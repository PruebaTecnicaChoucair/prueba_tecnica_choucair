# Autor: Jhonatan
@stories
Feature: UTest Choucair
  As a user, I want to register on uTest website to be able to find paid testing projects

  @scenario1
  Scenario Outline: Search for a paid testing project as a new user
    Given Brandon is a new user
    When Brandon fill out the form for getting its paid testing project list
      | firstName   | lastName   | email   | birthDay   | birthMonth   | birthYear   | city   | zip   | password   | confirmedPassword   |
      | <firstName> | <lastName> | <email> | <birthDay> | <birthMonth> | <birthYear> | <city> | <zip> | <password> | <confirmedPassword> |
    Then should be shown the text
      | welcomeText   |
      | <welcomeText> |
    Examples:
      | firstName | lastName     | email              | birthDay | birthMonth | birthYear | city  | zip   | password       | confirmedPassword | welcomeText                                                             |
      | UserName  | UserLastName | holamundo@mail.com | 12       | May        | 2000      | Pasto | 52003 | Holamundo9911* | Holamundo9911*    | Welcome to the world's largest community of freelance software testers! |
      | Jhonatan  | Caicedo      | jhonatan@mail.com  | 20       | July       | 1990      | Pasto | 52003 | Holamundo9911* | Holamundo9911*    | Welcome to the world's largest community of freelance software testers! |
      | Luis      | Ortega       | luis@mail.com      | 22       | January    | 1993      | Pasto | 52003 | Holamundo9911* | Holamundo9911*    | Welcome to the world's largest community of freelance software testers! |
