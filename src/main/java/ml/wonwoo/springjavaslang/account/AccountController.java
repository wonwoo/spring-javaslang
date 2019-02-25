package ml.wonwoo.springjavaslang.account;

import java.util.List;
import org.springframework.web.bind.annotation.*;

@RestController
public class AccountController {

    private final AccountRepository accountRepository;

    public AccountController(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }

    @GetMapping("/")
    public List<Account> accounts() {
        return accountRepository.findAll();
    }

    @GetMapping("/{name}")
    public javaslang.collection.List<AccountDto> findByname(@PathVariable String name) {
        return accountRepository.findByName(name)
            .filter(Account::isActive)
            .map(account -> new AccountDto(account.getName(), account.getRegDate()));
    }

    @PostMapping("/")
    public List<Account> save(@RequestBody javaslang.collection.List<Account> account) {
        return accountRepository.saveAll(account);
    }
}