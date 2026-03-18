package tacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import tacos.services.RedPrinter;

@SpringBootApplication

public class TacoCloudApplication {
	// private RedPrinter redPrinter;

	public TacoCloudApplication(RedPrinter r) {
		// redPrinter = r;
		r.print();
	}

	public static void main(String[] args) {
		SpringApplication.run(TacoCloudApplication.class, args);
	}

}
