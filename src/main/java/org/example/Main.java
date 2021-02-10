package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    static final Logger log = LogManager.getLogger("Main");

    public static void main(String[] args) {
        log.error("Hello, World!");
    }
}
