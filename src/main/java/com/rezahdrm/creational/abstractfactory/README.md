# Abstract Factory

## Intent

Abstract Factory is a creational design pattern that lets you produce families of related objects
without specifying their concrete classes.


## Problem
* Provide an interface for creating families of related or dependent objects without specifying their concrete classes.

* A hierarchy that encapsulates: many possible "platforms", and the construction of a suite of "products".
* The *new* operator considered harmful.
## Usage examples

* [javax.xml.parsers.DocumentBuilderFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance--)
* [javax.xml.transform.TransformerFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--)
* [javax.xml.xpath.XPathFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--())
