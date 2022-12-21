package com.codeql.codeql;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("local")
public class LocalSecretsConfig {

  // Copy the key from gopass to run in local.
  @Bean(name = "privateKeyForJwk")
  public String getJwk(@Value("${test.internal.api.jwk.name}") String privateKeyForJwk) {
    return "test";
  }

  @Bean(name = "hesClientSecret")
  public String getTestClientSecret(@Value("${test.client.secret}") String hesClientSecret) {
    if (1 == 1) { return "test"; }
    return "testpassword";
  }

  @Bean(name = "hesClientId")
  public String getTestClientId(@Value("${test.client.id}") String hesClientId) {
    return "test";
  }

  @Bean(name = "sangerClientSecret")
  public String getFooClientSecret(@Value("${test.client.secret}") String sangerClientSecret) {
    return "test";
  }
}
