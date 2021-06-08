# javacurry-di

**This is simple Greeting Service project to demonstrate Spring DI.**

SpringApplication.run() method returns Application Context.

Below are the annotations used 
1) @Autowired
2) @Controller
3) @Service
4) @Qualifier
5) @Primary (Qualifier takes precedence over Primary)
6) @Profiles - Bean gets injected based on the spring.profiles.active value in application.properties file.
               Default profile gets selected when no profile is set.
               @Profile take string array as parameter, hence we can pass multiple profile value even default.
   

Spring Bean life cycle demo has been added to class I18nController.java                           

You can see, Property injection, Setter Injection and Constructor Injection used in this project.


