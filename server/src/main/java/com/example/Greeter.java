package com.example;

/**
 * This is a class.
 */
class Greeter {

  /**
   * This is a constructor.
   */
  Greeter() {

  }

  /**
   * @param someone
   * @return greet
   */
  final String greet(final String someone) {
    return String.format("Hello, %s!", someone);
  }
}
