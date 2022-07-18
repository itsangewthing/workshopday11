package sg.edu.nus.iss.d11workshop;

import java.util.Collection;
import java.util.Collections;

import org.springframework.beans.propertyeditors.StringArrayPropertyEditor;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.DefaultApplicationArguments;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class D11workshopApplication {

	public static void main(String[] args) {
		// SpringApplication.run(D11workshopApplication.class, args);
		SpringApplication app = new SpringApplication(D11workshopApplication.class);

		String port ="8085";

		ApplicationArguments cli0pts = new DefaultApplicationArguments(args);
		if (cli0pts.containsOption("port")){
			port = cli0pts.getOptionValues("port").get(0);

		app.setDefaultProperties(Collections.singletonMap("server port",port));
		System.out.printf("application started on port %s\n", port);
		app.run(args);	

		}

		}

		// private String port = 



}
