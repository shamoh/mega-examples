JAX-RS Hello World Example
==========================

This example demonstrates using JAX-RS Server.

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
build/install/jaxrs-hello-world/bin/jaxrs-hello-world
```


Try it
------

```shell
curl -I -X GET http://localhost:9080/helloworld
```

