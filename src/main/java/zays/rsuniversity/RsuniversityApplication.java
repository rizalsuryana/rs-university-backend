package zays.rsuniversity;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import zays.rsuniversity.config.DotEnvConfig;

@SpringBootApplication
@EnableJpaAuditing
public class RsuniversityApplication {

	public static void main(String[] args) {

//		read file .env
		DotEnvConfig.loadDotEnv();

//		Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();
//		dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));


		SpringApplication.run(RsuniversityApplication.class, args);
	}

}
