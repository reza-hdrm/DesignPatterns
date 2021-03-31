# Template Method


## Intent
Defines the skeleton of an algorithm in the superclass but lets subclasses override specific steps of the algorithm without changing its structure.


## Problem 
Two different components have significant similarities, but demonstrate no reuse of common interface or implementation. If a change common to both components becomes necessary, duplicate effort must be expended.


## Usage examples
* [java.util.Collections#sort()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#sort-java.util.List-java.util.Comparator-)
* All non-abstract methods of [java.io.InputStream](http://docs.oracle.com/javase/8/docs/api/java/io/InputStream.html) , [java.io.OutputStream](http://docs.oracle.com/javase/8/docs/api/java/io/OutputStream.html) , [java.io.Reader](http://docs.oracle.com/javase/8/docs/api/java/io/Reader.html) and [java.io.Writer](http://docs.oracle.com/javase/8/docs/api/java/io/Writer.html) 
* All non-abstract methods of [java.util.AbstractList](http://docs.oracle.com/javase/8/docs/api/java/util/AbstractList.html) , [java.util.AbstractSet](http://docs.oracle.com/javase/8/docs/api/java/util/AbstractSet.html) and [java.util.AbstractMap](http://docs.oracle.com/javase/8/docs/api/java/util/AbstractMap.html) 
* [javax.servlet.http.HttpServlet](http://docs.oracle.com/javaee/7/api/javax/servlet/http/HttpServlet.html)