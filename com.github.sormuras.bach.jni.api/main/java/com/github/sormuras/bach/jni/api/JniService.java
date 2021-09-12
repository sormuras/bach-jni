package com.github.sormuras.bach.jni.api;

import java.util.ServiceLoader;

public interface JniService extends Runnable {

  static JniService load() {
    return ServiceLoader.load(JniService.class).findFirst().orElseGet(DefaultJniService::new);
  }

}
