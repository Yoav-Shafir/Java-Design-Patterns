Setup - just a class to initialize the components.
Thermometer extends Observable - this object manages all the observers.
ObserverThermometerClient implements Observer - this is a client we add to the "Thermometer".
Driver - a util component that generates values and set them on the Thermometer by calling "this.thermometer.driverValue(this.value);"
This triggers a "notifyDependents()" by the "Thermometer" in order to update all its clients and its doing it by calling:
"observer.update(this);"
