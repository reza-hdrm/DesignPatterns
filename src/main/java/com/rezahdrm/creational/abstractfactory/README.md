# Abstract Factory


## Intent
Abstract Factory is a creational design pattern that lets you produce families of related objects
without specifying their concrete classes.


## Problem
If an application is to be portable, it needs to encapsulate platform dependencies.
These "platforms" might include: windowing system, operating system, database, etc.
Too often, this encapsulation is not engineered in advance, and lots of `#ifdef` case statements with options for all currently supported platforms begin to procreate like rabbits throughout the code.


## Usage examples
* [javax.xml.parsers.DocumentBuilderFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/parsers/DocumentBuilderFactory.html#newInstance--)
* [javax.xml.transform.TransformerFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/transform/TransformerFactory.html#newInstance--)
* [javax.xml.xpath.XPathFactory#newInstance()](http://docs.oracle.com/javase/8/docs/api/javax/xml/xpath/XPathFactory.html#newInstance--())
