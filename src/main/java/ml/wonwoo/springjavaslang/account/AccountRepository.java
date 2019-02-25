package ml.wonwoo.springjavaslang.account;

import javaslang.collection.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository  extends JpaRepository<Account, Long> {

    List<Account> findByName(String name);
}
