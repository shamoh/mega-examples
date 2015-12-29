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


Develop it
----------

```shell
gradle -t start
```

Don't forget to stop running application at the end of the day:

```shell
gradle stop
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
curl -vvv http://localhost:8090/index.txt
curl -vvv http://localhost:8090/shamoh.jpg
```
