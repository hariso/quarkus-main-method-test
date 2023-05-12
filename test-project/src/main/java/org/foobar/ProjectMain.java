package org.foobar;

import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.annotations.QuarkusMain;

@QuarkusMain
public class ProjectMain {
    public static void main(String[] args) {
        Quarkus.run(org.example.SDKQuarkusApp.class, args);
    }
}
