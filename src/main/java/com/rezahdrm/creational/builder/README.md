# Builder


## Intent
Builder is a creational design pattern that lets you construct complex objects step by step.
The pattern allows you to produce different types and representations of an object using the same construction code.


## Problem
An application needs to create the elements of a complex aggregate. The specification for the aggregate exists on secondary storage and one of many representations needs to be built in primary storage.


## Usage examples
* [java.lang.StringBuilder#append()](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-boolean-)
* [javax.swing.GroupLayout.Group#addComponent()](https://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.Group.html#addComponent-java.awt.Component-)
* [java.lang.StringBuffer#append()](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)
