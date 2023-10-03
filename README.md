Spring Boot Resource Client
----------------------------

This project shows how to implement [Oauth 2.0 Resource Server](https://docs.spring.io/spring-security/reference/servlet/oauth2/resource-server/index.html) from the client perspective with [Spring Boot Security](https://docs.spring.io/spring-security/reference/index.html) project

#### To run the project

- Checkout [Spring Web Resource Server](https://github.com/josdem/spring-web-resource-server) in your local computer
- Execute that project with `gradle bootRun`
- Then run this project

```bash
gradle bootRun
```

- Open in your browser [http://127.0.0.1:8080/categories](http://127.0.0.1:8080/categories)
- Select: `categories-client-oidc`
- You should be redirected to a login page
- Enter this credentials

```bash
user: username
password: password
```

- You should see this response

```bash
["Healing","Energy","Healthy","Boost"]
```

**Note:** This project uses this [Authorization Server](https://github.com/josdem/spring-boot-authorization-server) to grant access tokens.

#### Read this as reference

* http://josdem.io/techtalk/spring/spring_webflux_security/

