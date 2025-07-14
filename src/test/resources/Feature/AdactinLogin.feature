Feature: Title of your feature

  @Login1
  Scenario: Verify login with credentials
    Given User is on the login page
     When User enter username "Swathir" and password "password"
      And User click login button
     Then User verify the success message after login "Welcome Swathir"
     
