#@Outline
#Feature: Demo
#
#  Scenario Outline: Demo 1
#    Given user on web "https://aidar.talentlms.com/user/create"
#    When user input field "<First name>" with following credentials first name
#    And user input field "<Last name>" with following credentials last name
#    And user input field "<Email Address>" with following credentials email address
#    And user input field "<Username>" with following credentials username
#    And user input field "<Password>" with following credentials password
#    And user input field "<BIO>" with following credentials bio
#    Examples:
#      | First name | Last name      | Email Address     | Username  | Password        | BIO                   |
#      | Nooruzbek  | Taalaibek uulu | nooruzbek@mail.ru | nooruzbek | nooruzbek123123 | this is bio nooruzbek |
#      | Guldana    | Sultanova      | guldana@mail.ru   | guldana   | guldana12121212 | this is bio guldana   |
#      | Ilnura     | Bazhenova      | ilnura@mail.ru    | ilnura    | ilnura123123123 | this is bio ilnura    |
#      | Aiperi     | Bozoeva        | aiperi@gmail.com  | aiperi    | aiperi234       | this is bio aiperi    |
