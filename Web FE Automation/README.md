# Enviroment configuration

· Apache Maven 3.6.0

· JRE: 1.8.0_152-release-1024-b11 x86_64

# Running specific test

```bash
mvn clean install -pl web -Dcucumber.filter.tags="@phptravels"
```

# Html report

 You can find the report in the following directory: `web\target\extent-report\HtmlReport`