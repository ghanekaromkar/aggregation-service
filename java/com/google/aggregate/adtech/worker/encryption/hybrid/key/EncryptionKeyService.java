/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.aggregate.adtech.worker.encryption.hybrid.key;

/** Interface responsible for retrieving and encrypting keys from the aggregate service KMS */
public interface EncryptionKeyService {

  /** Retrieve a key from the aggregate service KMS */
  EncryptionKey getKey() throws KeyFetchException;

  final class KeyFetchException extends Exception {

    public KeyFetchException(Throwable cause) {
      super(cause);
    }

    public KeyFetchException(String message) {
      super(message);
    }
  }
}
