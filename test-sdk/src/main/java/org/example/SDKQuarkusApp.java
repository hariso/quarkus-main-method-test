package org.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class SDKQuarkusApp implements QuarkusApplication {

    public SDKQuarkusApp() {

    }

    @Override
    public int run(String... args) {
        System.out.printf("org.example.SDKQuarkusApp.run called.");

        Quarkus.waitForExit();

        return 0;
    }
}
