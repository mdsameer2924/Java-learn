/*
Create an interface Playable with a single method void play().

Create two classes, Guitar and Piano, that both implements Playable.

In Guitar, override play() to print "Strumming the guitar strings."

In Piano, override play() to print "Pressing the piano keys."

In main, create objects for both and call their play() methods. 

(Note: Methods in an interface are automatically public, so you must use the public keyword when overriding them in the child class).
*/

package U6_Abstraction.practice.question2;

public class Piano implements Playable {
    @Override 
    public void play(){
        System.out.println("Pressing the paino keys.");
    }
    
}
