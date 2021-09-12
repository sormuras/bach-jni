package test.app;

import com.github.sormuras.bach.jni.api.JniService;

public class Main {
  public static void main(String[] args) {
    var service = JniService.load();
    System.out.printf("Using %s%n", service.getClass());
    service.run();
  }
}
