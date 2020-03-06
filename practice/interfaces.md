public abstract (name)

you can inherit objects from parent classes, it's like regular inheritance but it's extra

int compareTo(object) 
    -1, 0, 1 in order

.toString()

.equals(object)

interface - - - - - 

in all coding, an interface is a system for communication

special keywords
--
set of functions shared on disparate classes

example
Greetable.java
--
    public interface Greetable {
        public static final int GRAVITY_EARTH = -90;
        
        public void greet();
         - can be used as many times as you need, but no implementations -

    }

example
public class Dog extends Animal implements Greetable, Agreeable, Likeable { // As many implementations as you want in a class
    public void greet() {}
    Greetable gr = new Animal();
    Greetable gr2 = new Dog();
    Greetable[] greets = new Greetable[2]
    greets[0] = gr;
    greets[1] = gr2;
    for (Greetable g: greets) {
        g.greet();
    }

}