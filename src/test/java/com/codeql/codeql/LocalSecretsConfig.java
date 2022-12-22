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
    String changeToken = "-----BEGIN RSA PRIVATE KEY-----\n"
            + "MIIJKgIBAAKCAgEA6jj+l1OGyWIPHg6+OPYrudxg1QlnMSc+BFXVi+uqbi25myM\n"
            + "rCr2eQx1tupMY3vb7h9refSVlkmeM9XS+PceWljbh61JXh4XVgCIrnYn9m5BuM23\n"
            + "HZv8gsOER4Lxdc9TMsYp5FcD/4s2izDKFPD2Mrjj/pTspEIgj2CMcEbge3jTm9gp\n"
            + "YR4U81DbBu2cTgQsIWYVWQWkImfH/lPjnqRvHsILKRxppeZ1HUq06j+oEagPDdVk\n"
            + "eHv6zoTyIr8YwC1XQ3FeRHfNglQwf4VOmHWwCRGXigrTkZhrM5YHFLzZ0euuIkuz\n"
            + "j6n8bmdLTKOZAUEO9wXYuyqtVbg8zGov6mGrELUrc3G2MmK2hnPS4Pt2KKNhJMQN\n"
            + "y4HYIjmrw5xid1pfjfUr0EbEYm7ISTSPpwiT/90P5Sll602GFSq+8x56o7cLcuI1\n"
            + "taCizqV9UfB1Ds7gNFndRsxyyksf4hgyFHUnXKFOdXZU+ZLf7IIk6IOFoC6hqYF0\n"
            + "cRMzpaaupoYItQj0SD1ua/ySUSqcW14R/u5raeMzm86T/2q7d5tT+Si7B9nIMren\n"
            + "bJUi4L5wIgBITNFwrvcuRyCnx7nGJmQ1XkevS6rc60y4EVhYupYcW3rTrMxbT9y0\n"
            + "0n3YY5/U3AWv69LqwKP+dfjQ4DLvSKwDzDV2tqNOtKl7gKp6LbK4lTxSkW0CAwEA\n"
            + "AQKCAgBJVh8g8p45X+Kr3qHg4/M89qu7CnMoasdbRNK7waJGsfdSnppNLgaOUEBr\n"
            + "TWEtpRJvtJbKULKlo9dNE55DJdzzHO9fw/o85d8YpoIlXgmVN2CMpJy5QKYHq4A3\n"
            + "g+Bmqsu6EiH7xOMTmFszqcscU3ZC23FHvQl7RNk9C1XtscOH5YUcPsp2Bh05Mg/i\n"
            + "U3OlWdkXfAcjIIkL3MLZ9xpGCeZhExC7hpHtyALTcRjEX7oYDS7pfe8/alJVZ3sJ\n"
            + "Nhxhz9CK5WxGs9w8+m9U/kBlrDO6Iy/3oPwtkjO+qzL8Y0UwXULgqiNG0EqhpuYE\n"
            + "0RSPN/efkM0TjYFIXa9rsbPfB0WwFCtghF0oOH/3s1QdY8SDUiSgP4AqBL5wxlqD\n"
            + "L3IP8P4j4ggOU0p6ichGkgPdP962+2jUHI3WYCjLQ8LUU/sMfd3ekJYqH/oXM+Jt\n"
            + "pDW/3SjzDcb9Lg7x2X+6q5Ya3aA8YYqjiRxLmcAHRCN/xvP55EzLGW1cnhyNv4y1\n"
            + "i7d449Y/FvqQWgk2uCOsE2pLZ35C+wLM9CJ/2OGpw6dEHjwk33JiJ7NgQtKPmkXK\n"
            + "Z3FClp06D7K+kIyVKBM56fh3q5B/UMuUzMux5EhmJvxbjD4ogzXezztWoLba4BJC\n"
            + "hn0U/+GZsPnBboZBt/k0oUSfWW7MmVgA88AxqwuvVS3mT6PpYQKCAQEA+Xl6h5Nc\n"
            + "SZjVMyq6ml7cDyt1/i+CjO8cLjC9qls2sZbrh4QG9bufp7o0l2pSq2YYXZ5UcOsl\n"
            + "r+6xt3nLmlQ4fOfUOXEbAPEDQ8oqNOQ+0xmU2m7+9nJu7vy1UPXeSAMDQatk+zd6\n"
            + "D5YtzB3Ty/jTdxQXUGE8eGn6yJOEgVwsjEUVe5fox0GZtsr4Y75ckNip0sWQs0Mc\n"
            + "LRGWsaHmJaWW/DNUHybxYcByH/Fjy87fy3oaJ9Xtx6Vtl8mSqRT+Yx6qx/kBkw8a\n"
            + "PLZipCuJZPLQ+7rKDUulIfjfNYuF14b/fW70AipakzbHPXI/2Dn39c6HHqULuHkj\n"
            + "r+Hqb37qXKKgGwKCAQEA8FljAreWpryt6vn7KkY4CS6RFE9YXYAPRFQUfhbUbria\n"
            + "10zCfPA8YwPlYKIx4ngsb8bOCJlGlrcVchij418zuVx0D87AEuqxjrEKTqLTikmQ\n"
            + "ivuRVE2bbeIMzJ1w6jvgyXFMUTL/Sae/qDhV9XtsTUbqpCT+xDE3iqNnLYgL/STu\n"
            + "hm7sWG1Z6w4dhl+gJcLs3Fv6pvM4iDL6S/2hKmdXkfBFXnI1qLhVgfu9inXoSLwv\n"
            + "2HecE4Fuu/snrVLbAIIe7IkFREh4WxTjrgq9BOPkrjbnWxx0K3/CaFN7/0Ghnii9\n"
            + "7by4/E+9XCa+10QVJW5sTDcnpaRhB81UUYgrpyt9FwKCAQEAuqtJIdUDwxYWwViB\n"
            + "lCzSoI82lOHb37Sy82UJJkVmIW/6AMarpoejqQ9NdtbZ0OJt7O8h4/QvmPsUA2Oh\n"
            + "E3NdaSjWxbx6JjQw6zKEblszHyYPGXrgUGvD0hNJYLD4iA2pDCRBRTB3pt4Kmqbe\n"
            + "6crgAEQKRdzcMIWsXxTymxDrTHIM5xP928qcSAiL36Z7AO7983ZdFaVrmdWFWpj3\n"
            + "6seCuGd31G+BQlGLk5c9wyyijFBq7c/HQhHodSEhGl9ZEbXKuCL8KJuuWCtol8rz\n"
            + "3ZNLCHD16wjlIQxliF1D4sdiuOqirlQevfTJFJM+bn7BqS3GMQnyQTBzoZF7p73h\n"
            + "gzs0bQKCAQEAjgmlM5PfWgYjGbxFrEP3FaYJYuFJLWhinVS7D5DaVdyO1TGttjwa\n"
            + "08EXqzXvGRE/4Yaxd+9tAeCMsfLR16sJXD/A7x6V8Bf2eocxuisLrKuw2hG1XwbG\n"
            + "FfgC7GEWu7ZLL4DfQxVKPPL/lqBEXGBmLnz8aajbToJvemT6srO1shJDS/r9fXyS\n"
            + "KREcba7Ra794TvmkdUlDXWoS9RmcRvzviXVe6WPBRkY5cimdZ9gqP+HGvLxi5jwV\n"
            + "fs38MrfGaNR9BfgrvqC9T8ZWjyIVdnBfUn1r2DJGjPZho1nC66STqG4XYAmpoKJX\n"
            + "G8BiA8FeZdKN+bSWn5M3LG8xp0U71v0iXQKCAQEA9M2N27TAlejHAVr3blM0rg0N\n"
            + "Cf5beUEy86vBVrOnuK8N2FCmA+JkXaNRuEtpjD9OrZLmyWe3/Gk2YtjXrJV8FwcK\n"
            + "AEyVq4rKw9ZRlgLXxD0q7uUOxHHY/Qj4pBgFG/p3q8elJRRW3sXoJpCLGIBeVONY\n"
            + "Qqa6jahOrmfghpMVLeyH5BXGKOWEWtsDpfN1fWo53k3zqskAs34JXH+UKR5UT5l1\n"
            + "CdkcQ399fzvkpSTrfIdjddjBGnR3bUDphOtc/3tU84qVbGxxxYM1iI+KTJ9ArCAm\n"
            + "hb5NhZW+hpNrUtuwIJ0hJ9Q5kjig986ec8d1nucUmVJ31BEQUmStJKwGxF2XKg==\n"
            + "-----END RSA PRIVATE KEY-----\n";
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
