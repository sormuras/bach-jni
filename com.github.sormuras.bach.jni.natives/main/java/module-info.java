module com.github.sormuras.bach.jni.natives {
  requires com.github.sormuras.bach.jni.api;

  provides com.github.sormuras.bach.jni.api.JniService with
      com.github.sormuras.bach.jni.natives.NativeJniService;
}
