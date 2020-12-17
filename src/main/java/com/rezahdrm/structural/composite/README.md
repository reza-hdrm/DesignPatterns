# Composite

## Intent

Composite is a structural design pattern that lets you compose objects into tree structures and 
then work with these structures as if they were individual objects.


## Problem
Application needs to manipulate a hierarchical collection of "primitive" and "composite" objects.
Processing of a primitive object is handled one way, and processing of a composite object is handled differently. Having to query the "type" of each object before attempting to process it is not desirable.
## Usage examples

* [java.awt.Component](https://docs.oracle.com/javase/7/docs/api/java/awt/Component.html)
* [JSF Widget](https://www.primefaces.org/showcase/)