Hello World Example
===================

This example just prints "Hello World!" to console.


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
build/install/hello-world/bin/hello-world
build/install/hello-world/bin/hello-world Libor
build/install/hello-world/bin/hello-world Prague London Paris
```
