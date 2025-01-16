package forumhub.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ForumhubApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ForumhubApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
		System.out.println("alo mundor");
	}
}
