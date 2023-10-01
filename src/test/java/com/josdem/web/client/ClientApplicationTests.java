package com.josdem.web.client;

import jdk.jfr.Name;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@Slf4j
@SpringBootTest
@RequiredArgsConstructor
class ClientApplicationTests {

  private final ApplicationContext applicationContext;

  @Test
  @Name("Should load context")
  void contextLoads(TestInfo testInfo) {
    log.info("Running: {}", testInfo.getDisplayName());
    assertNotNull(applicationContext, "should start the application");
  }
}
