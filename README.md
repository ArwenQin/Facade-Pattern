# Facade-Pattern
This is a simple demostration of a building electronic appliance management system, which is a Facade Pattern implementation example.

## Introduction of Facade Pattern
Facade Pattern is ...


## Introduction of Codes
### Overview
The codes are a simple demostration of a building electronic appliance management system. We assume the building has four floors and each floor has lights, printer and air conditioner. This system is used by the building manager to turn on/off those electronic appliances.

The codes include a Client class. It has the main() function and is the only class used by the clinet/user. It can ask the Facade class to perform various operations, like turning off/on all electronic appliances in the building, turning on/off all lights in the building, or turning on/off all electronic appliances in Floor 1. The Client class looks simple and clear to users and is easy to use.

There is a Facade class, which organizes the subsystems to perform various operations. It interacts with Client class and calls various methods in subsystems (the Floor classes) to perform the target operations. All the details are thus hidden from the client/user.

There is a Floor interface, an AbstractFloor class, and four Floor classes those extend the AbstractFloor class. They are the subsystems with all the details. Each Floor class has the methods to turn on/off the electronic appliances in that floor.

### Assumption
The floor classes return a String to mock and demostrate the operation of turning on/off electronic appliances.

## Diagram

![Diagram](https://github.com/ArwenQin/Facade-Pattern/blob/dfad06e873369c315f02a9ae76c84868f3048eb5/res/Model%20databases%20-%20Facade.jpeg)
