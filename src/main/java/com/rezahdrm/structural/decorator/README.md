# Decorator


## Intent
Decorator is a structural design pattern that lets you attach new behaviors to objects 
by placing these objects inside special wrapper objects that contain the behaviors.


## Problem
You want to add behavior or state to individual objects at run-time.
Inheritance is not feasible because it is static and applies to an entire class.


## Usage examples
* [java.io.InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html)
* [java.util.Collections#checkedList()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#checkedList-java.util.List-java.lang.Class-)