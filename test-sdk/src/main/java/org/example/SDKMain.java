package org.example;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class SDKMain {
    public static void main(String... args) {
        Quarkus.run(SDKQuarkusApp.class, args);
    }
}
