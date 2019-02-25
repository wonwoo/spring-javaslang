package ml.wonwoo.springjavaslang.account;

import java.time.LocalDateTime;

public class AccountDto {

    private final String name;
    private final LocalDateTime regDate;

    AccountDto(String name, LocalDateTime regDate) {
        this.name = name;
        this.regDate = regDate;
    }

    public String getName() {
        return name;
    }

    public LocalDateTime getRegDate() {
        return regDate;
    }
}
