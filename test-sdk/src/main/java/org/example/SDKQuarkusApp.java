package org.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class SDKQuarkusApp implements QuarkusApplication {

    @Override
    public int run(String... args) throws Exception {
        System.out.printf("org.example.Main.MyApp.run called.");

        Quarkus.waitForExit();

        return 0;
    }
}
