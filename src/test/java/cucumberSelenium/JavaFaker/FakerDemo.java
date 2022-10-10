package cucumberSelenium.JavaFaker;

import com.github.javafaker.Faker;

public class FakerDemo {
    public static void main(String[] args) {

        Faker faker = new Faker();

        String firstName = faker.name().firstName();
        String lastName = faker.name().lastName();
        String email = faker.internet().emailAddress();
        String funnyName = faker.funnyName().name();
        long randomNumber = faker.number().randomNumber();
        int randomDigit = faker.number().randomDigit();
        int randomNumberBetween1And10 = faker.number().numberBetween(1, 10);

        System.out.println(firstName);
        System.out.println(lastName);
        System.out.println(email);
        System.out.println(funnyName);
        System.out.println(randomNumber);
        System.out.println(randomDigit);
        System.out.println(randomNumberBetween1And10);
    }
}
