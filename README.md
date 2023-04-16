# Facade-Pattern
This is a simple demostration of a building electronic appliance management system, which is a Facade Pattern implementation example.

## Introduction of Facade Pattern
Facade Pattern is a structural design pattern that provides a simplified interface to a more complex subsystem. It aims to hide the complexities of the subsystem, making it easier for the client to interact with the system.

## Introduction of Codes
### Overview
The code is a simple demonstration of a building electronic appliance management system. We assume the building has four floors, and each floor has lights, a printer, and an air conditioner. This system is used by the building manager to turn on/off those electronic appliances.

The code includes a Client class. It has the main() function and is the only class used by the client/user. It can ask the Facade class to perform various operations, like turning off/on all electronic appliances in the building, turning on/off all lights in the building, etc.
### Code Structure
* AbstractFloor is an abstract class that implements the Floor interface, providing common functionality for managing appliances on a floor.
* Floor1, Floor2, Floor3, and Floor4 are concrete floor classes, extending AbstractFloor and representing the individual floors in the building.
* FloorAppliance is an enum representing the different types of appliances that can be found on a floor.
* FacadeImpl is the implementation of the Facade interface, which provides methods for controlling appliances in the building.
* Client is the class containing the main() function, where the user interacts with the building electronic appliance management system.

### Usage
The Client class allows users to interact with the building electronic appliance management system through the FacadeImpl class. Users can perform actions like turning on/off all appliances in the building, turning on/off all lights, etc. The FacadeImpl class simplifies the interaction with the building's floors and appliances by hiding the complexity of the underlying system.
### Assumption
The floor classes return a String to mock and demostrate the operation of turning on/off electronic appliances.

### Getting Started
To run the program, simply compile and execute the Client class. This will demonstrate the functionality of the building electronic appliance management system using the Facade Pattern. You may also use the BuildingControlGUI class for a graphical user interface to control the building's appliances.

## Diagram

![Diagram](https://github.com/ArwenQin/Facade-Pattern/blob/dfad06e873369c315f02a9ae76c84868f3048eb5/res/Model%20databases%20-%20Facade.jpeg)
