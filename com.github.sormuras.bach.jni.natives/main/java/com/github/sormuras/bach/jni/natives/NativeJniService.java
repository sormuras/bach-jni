package com.github.sormuras.bach.jni.natives;

import com.github.sormuras.bach.jni.api.JniService;

public class NativeJniService implements JniService {

  static {
    // TODO Runtime.getRuntime().loadLibrary("bach-jni");
  }

  @Override
  public void run() {
    System.out.println("Generic JNI-based service, soon specialized for " + System.getProperty("os.name"));
    run_native();
  }

  private native void run_native();
}
