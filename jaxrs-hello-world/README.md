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
build/install/jaxrs-hello-world/bin/jaxrs-hello-world
```


Try it
------

```shell
curl -vvv http://localhost:9080/1.0/helloworld
curl -vvv http://localhost:9080/1.0/helloworld/Libor
```

