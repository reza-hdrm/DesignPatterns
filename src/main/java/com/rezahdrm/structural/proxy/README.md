# Proxy

## Intent
Proxy is a structural design pattern that lets you provide a substitute or placeholder for another object. A proxy controls access to the original object, allowing you to perform something either before or after the request gets through to the original object.

## Problem
You need to support resource-hungry objects, and you do not want to instantiate such objects unless and until they are actually requested by the client.

## Usage examples
* [java.lang.reflect.Proxy](http://docs.oracle.com/javase/8/docs/api/java/lang/reflect/Proxy.html)
* [java.rmi.*](http://docs.oracle.com/javase/8/docs/api/java/rmi/package-summary.html)
* [javax.persistence.PersistenceContext](http://docs.oracle.com/javaee/7/api/javax/persistence/PersistenceContext.html)
* [javax.inject.Inject](http://docs.oracle.com/javaee/7/api/javax/inject/Inject.html)