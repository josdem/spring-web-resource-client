package com.josdem.web.client.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClient;
import org.springframework.security.oauth2.client.annotation.RegisteredOAuth2AuthorizedClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

import static org.springframework.security.oauth2.client.web.reactive.function.client.ServletOAuth2AuthorizedClientExchangeFilterFunction.oauth2AuthorizedClient;

@RestController
@RequiredArgsConstructor
public class CategoriesController {

  private final WebClient webClient;

  @GetMapping("/categories")
  public List<String> getCategories(
      @RegisteredOAuth2AuthorizedClient("categories-client-authorization-code")
          OAuth2AuthorizedClient authorizedClient) {
    return this.webClient
        .get()
        .uri("http://127.0.0.1:8081/categories")
        .attributes(oauth2AuthorizedClient(authorizedClient))
        .retrieve()
        .bodyToMono(List.class)
        .block();
  }
}
