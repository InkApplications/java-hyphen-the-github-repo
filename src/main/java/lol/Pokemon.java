/*
 * Copyright (c) 2014 Ink Applications, LLC.
 * Distributed under the MIT License (http://opensource.org/licenses/MIT)
 */
package lol;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.SOURCE;

/**
 * Documentation annotation telling others, we just want to catch them all.
 *
 * Example usage:
 * ```java
 * try {
 *   throw new Exception("YOLO");
 * } catch (@Pokemon Exception e) {
 *   System.out.println("We caught them all!!! " + e.getMessage());
 * }
 * ```
 */
@Documented
@Retention(SOURCE)
@Target(PARAMETER)
public @interface Pokemon {
}
