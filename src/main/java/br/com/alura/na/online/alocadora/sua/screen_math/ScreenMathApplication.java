package br.com.alura.na.online.alocadora.sua.screen_math;

import br.com.alura.na.online.alocadora.sua.screen_math.principais.Principal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenMathApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(ScreenMathApplication.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        Principal prin = new Principal();
        prin.exibeMenu();
    }

}
