# gslc2
The project is an example of the implementation of abstract and interface.
I used a car customization shop option menu as an example. It first asks the user for selecting their car type:
1. SUV
2. Sedan
3. Hatchback
4. MPV
5. Sports
After choosing, they will be asked to confirm whether they want options for the car or not. The questions and lines run after answering is based on the car type's abstract and interface

Each of the car types are classes that extends from an abstract named "car" and shares the same attributes like name, year, tire type, addition, and driving mode. They share the method to print vehicle details (print attributes). SUV and MPV implemented offroadReady interface that can change the car's attributes into offroad equipment, while sedan and sports car implemented raceReady that allows performance option to be selected. Hatchback, implements both offroadReady and raceReady.

# Abstract and Interface (also available as comment in the code)
Abstract class is a superclass that acts as a template for the subclass, however the abstract class itself could not be constructed, so no object can be made by being the abstract. It has the same behavior as superclass like using extends and can only extend exclusively to a subclass (only 1 abstract per class). Meanwhile, abstract method is a template method name for subclasses that will use the same method but could have different uses, as the code of the method will be decided on the subclass creation.
 
On the other hand, we have interface which uses implements keyword instead of extends, and it serves as an additional template for a class. Many class can have multiple interfaces implemented to them, and they must follow their signature methods declared in the interface. Could also be used for classes that has several similar behavior that cannot came from 1 superclass.
