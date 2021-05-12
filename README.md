Project that demonstates that latest Grails (4.0.10) does not support databinding strings to java.time.Instant

Steps to reproduce: 
1. Start the app: `./gradlew bootRun`
2. Call the TestController with an Instant string and error occurs:
```
curl -i http://localhost:8080/test -d '{"testInstant":"2021-05-12T08:13:02.907871Z"}' -H 'Content-Type: application/json'
HTTP/1.1 500
Content-Type: text/html;charset=UTF-8
Content-Language: en-US
Transfer-Encoding: chunked
Date: Wed, 12 May 2021 09:26:09 GMT
Connection: close
...
```
3. Sanity-check: Call the TestController with an Instant number and no error occurs:
```
curl -i http://localhost:8080/test -d '{"testInstant":1620809710000}' -H 'Content-Type: application/json'
HTTP/1.1 200 
Content-Type: text/html;charset=utf-8
Content-Length: 20
Date: Wed, 12 May 2021 09:26:04 GMT

2021-05-12T08:55:10Z
```

