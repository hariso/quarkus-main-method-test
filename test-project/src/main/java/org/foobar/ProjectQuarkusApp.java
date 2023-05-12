package org.foobar;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;

public class ProjectQuarkusApp implements QuarkusApplication {
    @Override
    public int run(String... args) {
        System.out.printf("org.foobar.ProjectQuarkusApp.run() called.");

        Quarkus.waitForExit();

        return 0;
    }
}