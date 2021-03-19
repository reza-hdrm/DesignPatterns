# Composite


## Intent
Composite is a structural design pattern that lets you compose objects into tree structures and 
then work with these structures as if they were individual objects.


## Problem
Application needs to manipulate a hierarchical collection of "primitive" and "composite" objects.
Processing of a primitive object is handled one way, and processing of a composite object is handled differently. Having to query the "type" of each object before attempting to process it is not desirable.


## Usage examples
* [java.awt.Container#add(Component)](http://docs.oracle.com/javase/8/docs/api/java/awt/Container.html#add-java.awt.Component-)
* [javax.faces.component.UIComponent#getChildren()](http://docs.oracle.com/javaee/7/api/javax/faces/component/UIComponent.html#getChildren--)