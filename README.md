# spring-hal-jackson-graalvm
Small reproducer for a question asked on StackOverflow (https://stackoverflow.com/questions/74573299/how-to-deserialize-json-object-referring-related-data-using-hal-links-with-jacks)

## Steps to reproduce

1. build the project

```
./gradlew clean bootBuildImage
```

2. launch the docker image (don't forget to define env variables MS_DATASOURCE_URL, MS_DATASOURCE_USERNAME and MS_DATASOURCE_PASSWORD)

3. with a web browser, open the hal service navigator (http://host:9090/api)

4. with the hal service navigator, create an authority object, keep it's url identifier

5. with the hal service navigator, create a competition object

6. with the hal service navigator, patch the created competition object with the following data :

```
{
   "authority":"[REPLACE WITH THE AUTHORITY URL IDENTIFIER]"
}
```

7. Request should fail with the error indicated on the StackOverflow post
