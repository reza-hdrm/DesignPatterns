# Factory Method

## Intent

Builder is a creational design pattern that lets you construct complex objects step by step.
The pattern allows you to produce different types and representations of an object using the same construction code.



## Problem
A framework needs to standardize the architectural model for a range of applications,
but allow for individual applications to define their own domain objects and provide for their instantiation.

## Usage examples

* [java.lang.StringBuilder#append()](http://docs.oracle.com/javase/8/docs/api/java/lang/StringBuilder.html#append-boolean-)
* [javax.swing.GroupLayout.Group#addComponent()](https://docs.oracle.com/javase/8/docs/api/javax/swing/GroupLayout.Group.html#addComponent-java.awt.Component-)
* [java.lang.StringBuffer#append()](https://docs.oracle.com/javase/8/docs/api/java/lang/StringBuffer.html#append-boolean-)
