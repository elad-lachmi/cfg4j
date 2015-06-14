/*
 * Copyright 2015 Norbert Potocki (norbert.potocki@nort.pl)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.cfg4j.source.context;

/**
 * Indicates missing configuration environment
 */
public class MissingEnvironmentException extends RuntimeException {

  private static final String MISSING_ENV_MSG = "Missing environment: ";

  /**
   * Environment named {@code envName} is missing.
   *
   * @param envName environment name
   */
  public MissingEnvironmentException(String envName) {
    super(MISSING_ENV_MSG + envName);
  }

  /**
   * Environment named {@code envName} is missing.
   *
   * @param envName environment name
   * @param cause root cause
   */
  public MissingEnvironmentException(String envName, Throwable cause) {
    super(MISSING_ENV_MSG + envName, cause);
  }
}
