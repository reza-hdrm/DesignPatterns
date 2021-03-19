# Singleton


## Intent
Singleton is a creational design pattern that lets you ensure that a class has only one instance,
while providing a global access point to this instance.


## Problem
Application needs one, and only one, instance of an object. Additionally,
lazy initialization and global access are necessary.

## Usage examples

* java.lang.Runtime#getRuntime()
* java.util.logging.Logger#getLogger()
* Spring Beans
