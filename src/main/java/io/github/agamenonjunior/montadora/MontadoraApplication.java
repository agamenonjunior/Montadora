package io.github.agamenonjunior.montadora;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class MontadoraApplication {

	public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(MontadoraApplication.class);

        builder.bannerMode(Banner.Mode.OFF);
        builder.profiles("dev","prod");

        builder.run(args);




	}

}
