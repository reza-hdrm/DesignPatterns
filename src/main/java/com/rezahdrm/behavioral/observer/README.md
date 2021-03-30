# Iterator


## Intent
Lets you define a subscription mechanism to notify multiple objects about any events that happen to the object they’re observing.


## Problem
A large monolithic design does not scale well as new graphing or monitoring requirements are levied.


## Usage examples
* [javax.servlet.http.HttpSessionBindingListener](http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionBindingListener.html)
* [javax.servlet.http.HttpSessionAttributeListener](http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpSessionAttributeListener.html)
* [java.util.EventListener](http://docs.oracle.com/javase/8/docs/api/java/util/EventListener.html)
* [javax.faces.event.PhaseListener](http://docs.oracle.com/javaee/7/api/javax/faces/event/PhaseListener.html)
* [java.util.Observer](http://docs.oracle.com/javase/8/docs/api/java/util/Observer.html) / [java.util.Observable](http://docs.oracle.com/javase/8/docs/api/java/util/Observable.html)
