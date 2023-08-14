package cinema.config;

import cinema.model.Role;
import cinema.model.User;
import cinema.service.RoleService;
import cinema.service.ShoppingCartService;
import cinema.service.UserService;
import java.util.Set;
import javax.annotation.PostConstruct;
import org.springframework.stereotype.Component;

@Component
public class DataInitializer {
    private final UserService userService;
    private final RoleService roleService;
    private final ShoppingCartService shoppingCartService;

    public DataInitializer(UserService userService,
                           RoleService roleService, ShoppingCartService shoppingCartService) {
        this.userService = userService;
        this.roleService = roleService;
        this.shoppingCartService = shoppingCartService;
    }

    @PostConstruct
    public void inject() {
        Role adminRole1 = new Role();
        adminRole1.setRoleName(Role.RoleName.ADMIN);
        roleService.add(adminRole1);
        Role userRole1 = new Role();
        userRole1.setRoleName(Role.RoleName.USER);
        roleService.add(userRole1);

        Role userRole = roleService.getByName(Role.RoleName.USER.name());
        User user = new User();
        user.setEmail("user1@i.ua");
        user.setPassword("user");
        user.setRoles(Set.of(userRole));
        User userFromDB = userService.add(user);
        shoppingCartService.registerNewShoppingCart(userFromDB);

        Role adminRole = roleService.getByName(Role.RoleName.ADMIN.name());
        User admin = new User();
        admin.setEmail("admin@i.ua");
        admin.setPassword("admin");
        admin.setRoles(Set.of(adminRole));
        User adminFromDB = userService.add(admin);
        shoppingCartService.registerNewShoppingCart(adminFromDB);
    }
}
