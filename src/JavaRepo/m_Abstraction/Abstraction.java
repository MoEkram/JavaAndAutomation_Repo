package m_Abstraction;

// Abstraction : is a process where you show only " relevant" data & "hide" unnecessary details of an object from the user.
//               ex: login screen, you just enter username/password, but you don't know what happen in background.
//               ex2: the Car ( is Object ) , contains smaller objects such steering, engine.. but for human its one object, don't care about the smaller objects

// Abstraction : a class declared using " abstract " keyword.
//               It can have abstract methods ( methods without body ) & concrete methods ( regular methods with body )
//               Normal Classes ( non-abstract class ) can not have abstract methods.

// Why we need abstract class
//              ex: if you have Animal class, contains Sound method, and the sub-class will have same sound method
//                  no point to implement this method in parent class, as each sub-class has its own implementation
//                  all of them will Override the parent method
//              When you make abstract class you force all sub-classes to implement this method ( or you will get compilation error )

public class Abstraction {
}
