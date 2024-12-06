package in.alchemist.Spring_Boot_Runner_App.runner;

import org.springframework.boot.CommandLineRunner;

public class MyCmdRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("Command line......run method!");
    }
}
