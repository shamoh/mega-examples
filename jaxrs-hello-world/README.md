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
gradle installDist
build/install/jaxrs-hello-world/bin/jaxrs-hello-world
```


Try it
------

```shell
curl -I -X GET http://localhost:8090/helloworld
```

