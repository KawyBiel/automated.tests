Feature:  Reserve flight

  Scenario: Book flight from Warsaw to New York

    Given I open website phptravel
    When I reserve two way flights from "WAW" to "ROC" on dates "2019-01-24" and "2019-01-30"
    And I pick first available flight 3
    And I book as a guest with "Jan" "Kowalski" "mail@test.com" "+48123456789" "Wroclaw" "Poland"
    Then I should see prepared invoice