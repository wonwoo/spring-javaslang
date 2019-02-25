package ml.wonwoo.springjavaslang;

import java.time.LocalDateTime;
import javaslang.collection.List;
import ml.wonwoo.springjavaslang.account.Account;
import ml.wonwoo.springjavaslang.account.AccountRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringJavaslangApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringJavaslangApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(AccountRepository accountRepository) {
        return args -> accountRepository.saveAll(List.of(
            createAccount("wonwoo", "wonwoo@test.com", true),
            createAccount("wonwoo", "meetee@test.com", false),
            createAccount("fidel", "fidel@test.com", true),
            createAccount("kevin", "kevin@test.com", true),
            createAccount("foo", "foo@test.com", false),
            createAccount("foo", "787711@test.com", false),
            createAccount("bar", "bar@test.com", true)
        ));
    }

    private static Account createAccount(String name, String email, boolean active) {
        Account account = new Account();
        account.setActive(active);
        account.setEmail(email);
        account.setName(name);
        account.setRegDate(LocalDateTime.now());
        return account;
    }
}
