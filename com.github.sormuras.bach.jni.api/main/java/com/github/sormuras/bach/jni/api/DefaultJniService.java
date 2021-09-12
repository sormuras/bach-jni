package com.github.sormuras.bach.jni.api;

public class DefaultJniService implements JniService {
  @Override
  public void run() {
    System.out.println("Emulating some JNI-based service...");
  }
}
