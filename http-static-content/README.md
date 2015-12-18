HTTP Static Content Example
===========================

This example demonstrates using Grizzly HTTP Server and providing static content.

Build it
--------

```shell
gradle -t build
```


Run it
------

```shell
gradle -t run
```


Distribution
------------

```shell
gradle installDist
```

Run it:

```shell
build/install/http-static-content/bin/http-static-content
```


Try it
------

```shell
curl -I -X GET http://localhost:8090/shamoh.jpg
```

