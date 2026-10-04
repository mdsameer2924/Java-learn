# U7 — Advanced OOP — Notes

> **Source:** [`README.md`](../README.md) — the Table of Content has an `Advance oops` entry, but **no observation body is written yet**.
> **Unit per roadmap:** Unit 7: Advanced OOP (Static, Final, Object Class, and Composition)
> Nothing was fabricated here — there is no concept body in the master observation to copy into this unit.

> When an "Advance oops" observation is added to `README.md`, copy it here.

**Code present in this unit (for reference):**
- [`first.java`](first.java) — static attributes / static methods example

## Constructor 
jaise hi object banta hain ek hidden default conructor khud ko call karta hain bina manually call.

## Static 
static method ko hum bina object banai call kar sakte hain and static variable ko saare object shared memory ki tarah use karte hain matlab 2 alag object ke pass bhi ek hi static variable hoga agar ek object ne static variable ki value change kaari tho dusre se bhi apne aap hu jayegi waha koi copy nhi milta different object ko </br>
[Code example](Objectsec.java) me code mein jaise jaise new object banenge static variable update hota rahega ki kitne total object hain </br>
agar usage janana hain tho [Click me](../README.md#observation-10th)


## Object class
`Object class` hidden class hain jho java mein each and every class ki parent/superclass hain ye hidden hain but ye hume kuch method deti hain: </br>
1. `toString()`
2. `equal()`
3. `hashMap()` 
and hume isse override kar sakte hain jab hum `toString` kisi object ko banate hain and direct object ko print karte hain tho ye method auto call hota hain 
for example 
```java
class Book {
    int chapter;
    int pages;
    
    // Constructor mein sahi data types use kiye hain
    Book(int chapter, int pages){
        this.chapter = chapter;
        this.pages = pages;
    }

    public static void main(String[] args){
        Book richDad = new Book(7, 399);
        
        // Jab hum object ko print karte hain, println() internally toString() ko call karta hai.
        System.out.println(richDad); 
        // Output format: ClassName@HashCode (Example: Book@2a139a55)
        
        // Ab chapter ki value print hogi 
        System.out.println(richDad.chapter); // Output: 7
    }
}
```
tho isse jagah hum **`toString()`** and aut bhi `Class Object` ke method ko Override kar sakte hain iske <br>
[Code example](CompositeAggregate.java#L11-15)

## Composition
ye thoda tricky lag sakta hain but good news yeh hain kiya hum phele se use karte aa rhe hain `Composition` ko `String` **primitive dataType** nhi hain String name bhi class hain java mein internal code mein and yahi hain composition.

### Difference between Inheritance and Composition
`Inheritance` mein `is a relation` hota hain matlab B -> A ka child hain and isme kaafi dikkat aa sakt hain sometime depedency issue and 
agar hum `losselly couple type` leekhna chahte hain production based code then composition industry standard hain because 
isme `has a relation` hota hain matlab B ke paas A ke components hain isse  </br>
<!-- TODO  Yaha knowledge gap hain composition and inheritance  difference why we need to use composition why not -->

### Types of Composition:
1. [Aggregate](README.md#aggregate) [`Weak has a Relationship`]
2. [Strict Compisiton](README.md#strict-composition) [`Strong has a Relationship`]

#### Aggregate 
isme hum ek class ko dusri class ke andar ek data type ki tarah use karte hain and agar. </br>
**Analogy:**</br>
`class Weapon` hain and dusri `class Player` hain agar yaha Player Khatam hu  jai tho bhi `Weapon` kahtam nhi hoga exsit karega just drop hu jayega ground se jaise **`PUBG`** mein hota hain isliye ye  `Weak has a Relation` hain. 
**Syntax/Example:** </br>
```java
class Weapon{
    String name;
    double damage;
}

// another class
class Player{
    String playerName;
    Weapon equipWeapon;  // here we use Weapon class as datatype  isse kehta hain aggregation
}
```
agar aur detail mein jaanna hain tho [**`Code example`**](CompositeAggregate.java)


### Strict Composition
isme `Strict has a relation hota hain` isme hum   class  ke constructor mein hi object bana deta hain dusri class ka jiski property chahte hain 
**Analogy:** </br>
`class Human` hain agar `Human` nhi rha alive tho uska `brain`, `heart` bhi mar jayega this is Strict composition 
> Koi Component type class totally depended hoti hain working class par 

**Syntax/Example:** </br>
```java
class Heart{
    int heartRate;
    Heart(){
        this.heartRate=73;
    } 
}

class Human{
    String name; // human name 
    Heart myheart;  // human has heart crucial for survive strong composition no optional
    Human(String name){
        this.name=name;  
        this.myheart= new Heart();  // humne yaha dusri class ka object banaya wo bhi main/working class mein  yahi hain strong relation
    }
}
```
here is the [**`Code Example`**](StrictComposite.java) for better understanding


#### Conclusion
1. **Static Variables:** Shared across all objects of the class. If Object A changes a static variable, Object B sees the new value. It takes up memory only once. (e.g., keeping track of totalEmployees).

1. **Static Methods:** Can be called without creating an object at all. You call them using the Class name. (e.g., Math.max(5, 10)—you don't have to write Math m = new Math();).