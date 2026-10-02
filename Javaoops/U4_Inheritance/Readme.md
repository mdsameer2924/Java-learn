# U4 — Inheritance — Notes

> **Source:** concept extracted from the master [`Observation.md`](../Observation.md). The original observation file is kept untouched — this is only the per-unit copy of the concept.
> **Unit per roadmap:** Unit 4: Inheritance (Code Reusability & Relationships)

---

## Observation 7th — Inheritance: `super` rules

`Inheritance` mein jab hum child class mein parents class ke constructor ko call karte hain. <br> **for example :** <br>

```java

class Human{  // parent class
    String name;
    int age;
    
    Human(String name, int age){ //constructor
        this.name=name;
        this.age=age;
    }
}
class Student extends Human{
    String course; // child's class attributes
    
    // constructor
    Student(String name,int age,String course){
        super(name,age);  // first use super to call parent constructor
        this.course=course // this is right approach
    }
}

```

##### Wrong Approach
```java
// child ke constructor mein hume phele super se parent ke constructor ko call karna hota hain upar sahi kiya hain 
// isme galat karenge 
class Student extends Human(){
    String course;
    //constructor
    Student(String name,int age, String course){
        this.course=course;
        super(name,age)     // ye tariqa galat hain isme phele nhi baad mein super parents constructor ko call kar rha hain
    }
}
```

> learn from this [click here ](https://gemini.google.com/app/f19e9739946c1d46#:~:text=Your%20code%20is%20almost,is%20the%20corrected%20solution%3A)

---

_Extracted only; the master [`Observation.md`](../Observation.md) remains the single source of truth._