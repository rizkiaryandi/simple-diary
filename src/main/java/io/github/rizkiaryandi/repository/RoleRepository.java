package io.github.rizkiaryandi.repository;

import io.github.rizkiaryandi.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : spring-boot-reset-password
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 12/04/22
 * Time: 08.37
 */
public interface RoleRepository extends JpaRepository<Role, Long> {
}
