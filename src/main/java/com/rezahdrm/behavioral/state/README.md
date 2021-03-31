# State


## Intent
Lets an object alter its behavior when its internal state changes. It appears as if the object changed its class.


## Problem
A monolithic object's behavior is a function of its state, and it must change its behavior at run-time depending on that state. Or, an application is characterized by large and numerous case statements that vector flow of control based on the state of the application.


## Usage examples
* [javax.faces.lifecycle.LifeCycle#execute()](http://docs.oracle.com/javaee/7/api/javax/faces/lifecycle/Lifecycle.html#execute-javax.faces.context.FacesContext-)
