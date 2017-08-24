package ua;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import ua.entity.Role;
import ua.entity.UserEntity;
import ua.repository.UserRepository;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		addAdmin(SpringApplication.run(Application.class, args));
	}
	
	static void addAdmin(ConfigurableApplicationContext run) {
			UserRepository repository = run.getBean(UserRepository.class);
			UserEntity user = repository.findByEmail("admin");
			if(user==null) {
				PasswordEncoder encoder = run.getBean(PasswordEncoder.class);
				user = new UserEntity();
				user.setEmail("admin");
				user.setPassword(encoder.encode("admin"));
				user.setRole(Role.ROLE_ADMIN);
				repository.save(user);
			}
	}
}