package zays.rsuniversity.config;


import io.github.cdimascio.dotenv.Dotenv;
import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DotEnvConfig {
	@PostConstruct
	public static void loadDotEnv(){
		Dotenv dotEnv = Dotenv.configure()
				.directory("./")
				.ignoreIfMissing()
				.load();

		dotEnv.entries().forEach(dotenvEntry -> System.setProperty(dotenvEntry.getKey(), dotenvEntry.getValue()));
	}
}
