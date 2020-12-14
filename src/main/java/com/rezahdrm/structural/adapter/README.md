# Prototype

## Intent

Adapter is a structural design pattern that allows objects with incompatible interfaces to collaborate (Like Wrapper).


## Problem
An "off the shelf" component offers compelling functionality that you would like to reuse,
but its "view of the world" is not compatible with the philosophy and architecture of the system currently being developed.

## Usage examples

* [java.util.Arrays#asList()](https://docs.oracle.com/javase/8/docs/api/java/util/Arrays.html#asList-T...-)
* [java.util.Collections#list()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#list-java.util.Enumeration-)
* [java.util.Collections#enumeration()](https://docs.oracle.com/javase/8/docs/api/java/util/Collections.html#enumeration-java.util.Collection-)
* [java.io.InputStreamReader(InputStream)](https://docs.oracle.com/javase/8/docs/api/java/io/InputStreamReader.html#InputStreamReader-java.io.InputStream-)