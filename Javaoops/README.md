### This file is created for hand on learning purpose while hand ons what i learn jot down here 
# Table of Content
- [Public class limit](README.md#observation-1st)
- [Importance of public specifier](README.md#observation-2nd)
- [Method return type rules](README.md#observation-3rd)
- [`This` reference variable](README.md#observation-4th)
- [Naming convention](README.md#observatoin-5th)
- [Encapsulation getter and setter rules](README.md#observation-6th)
- [Inheritance super rules](README.md#observation-7th)
- [polymorphism and Upcasting](README.md#observation-8th)
- [Method overriding and overloading rules](README.md#observation-9th)
- [Advance oops](README.md)
-------------------------
## Observation 1st
Java file mein sirf maximum ek hi **public class** hu sakti hain and wahi filename hoga 
#### Conclusion: 
ek file ke andar ek ki class banao industry standard hain.
> learn from [reference](U1%20Classes%20and%20object/practice/Q1.java)

## Observation 2nd
 Java mein main function public keyword (access specifier) important hain warna `JVM` Usse call nhi kar sakta and agar different folder se access karna chahe tho possible nhi 
> learn from [reference](U1%20Classes%20and%20object/practice/Q2.java), [example](https://gemini.google.com/app/dd8f395339c2ef0e#:~:text=Gemini%20said-,To%20understand%20why,public,-.)
#### Conclusion
<input type="checkbox">Practically try how not using public affect and restrict main method file within same package</input>


## Observation 3rd
method ke return type and return value same honi chahiye warna dikkat hain
#### Example:
```java
String areaOfRectange(int length, int breadth){
    return length*breadth
}
```

ye wala work nhi karega because `returnType` different hain actual value jho return kar rha hain usse.<br>
**[refernce](testSubject/methodReturnType.java#L3-5): of this above code block** 
> - return type --> hain String
> - but niche return -> `length * breadth` kar rha hain.
>
> isliye ye wala `codeBlock` nhi chalega `length/breadth` ka `dataType` `int` hain and method ka `String`.

#### Based on my Obseration.
- String se int mein ye problem de rha hain.
- lekin float/double [`method`]'s return type  se nhi de rha int [`Variable/parameter,class members`] mein


## Observation 4th
**`this` reference variable** constructor ke parameter and class member ko connected karta hain ek tariqa se. iske bina kuch problem aati hain uska reference niche hain 

**example taken**<br>[here](https://gemini.google.com/app/a9bf7eab1c97e62f#:~:text=The%20exact%20scenario,your%20program%20later.) | [source code example](testSubject/ThisImportance.java#L7-8)


## Observatoin 5th 
jaha taq mujhe pata chala, naming convention industry standard ke hisab se hote hain and langauge dependent hote hain 
kuch rules same hu sakte hain and overlap kar sakte hain but kuch different hu sakte hain 
isliye hume inhe use karna chahiye better practice hain like:<br>
- **Classes & Interfaces:** PascalCase (e.g., BankAccount, String)
- **Methods:** camelCase (e.g., calculateArea(), getYearlySalary())
- **Variables & Attributes:** camelCase (e.g., monthlySalary, empId)
- **Constants (static final):** UPPER_SNAKE_CASE (e.g., MAX_SPEED, PI_VALUE)
- **Packages:** lowercase (e.g., java.util, practice)

## Observation 6th
`Encapsulation` mein hum apne attributes and method ko capsulate karte hain and restriction set karte hain unauthorized access se **`Access Modifier`** use karke like 
- Public
- Private 
- Protected
<div></div>

and hum basically **`Private`** ka use karte hain Protected bhi kar sakte hain uske use different hain 
tho humne `attributes` and `methods` ko private kar diya ab hum outside the class access nhi kar sakte tho ab hume banana padega **2 public `getter` and `setter`**
<div> </div>

#### Getter and Setter rules:
> getter and setter humesa at most 1 attribute modify ya access karenge 
>
> getter humesa attribute return karega void use nhi karna method mein 

## Observation 7th 
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


## Observation 8th 
`Polymorphism` has two types in **Java** and types ke name hain:
<details open>
<summary><b>Compile Time Polymorphism</b></summary>
</br>
<p> <b>Compile Time:</b> Isme same class ke andar <code> Multiple Methods hote hain</code>  Same name se bas parameter different hote hain. <br><a href="U5_Polymorphism/CompileTimePoly.java"> Code example </a>  </p>
</details>

<details open>
<summary><b>Run Time Polymorphism</b></summary>
<div>
<p> <b> Run Time:</b> Polymorphism tab banta hain jab hum multiple class banate hain and usme access karte hain basically <code>Inheritance</code> ke waqt <b> Parents ke methods ko Modify karte hain access ke saath saath</b><br>
<a href=U5_Polymorphism/RunTimemain.java> Code example</a>

> **RUNTIME Polymorphsim** ko use karne ke liya `@override` use kare. method  ko override karne ke liye.

**Syntax**
```Java
@override
void display(){
    // code here different than parent class 
    // but method must be same as parent class's method
    // parameter alag kar sakte hain datatype bhi change karu.
}
```
> Object banate waqt. Object ko upcaste kare 

**Syntax**
```java
// up casting
parent_class obj_name=new child_class; 
```

</div>
</details>

#### Upcasting ka kiya use hain ?
**Upcasting** ka use hum `parents class` ke `method/attributes` ko flexible tariqa se use karne ke liye karte hain 
isse child apni khud ki special and uniquene method ya attributes access nhi kar sakta and sirf wahi access kar sakta hain jho parent ke method ko override kara hain wo and parent se `inherit` kare saare  attributes and method ko access kar sakta hain.


## Observation 9th
`method overriding` and `method overloading` yaha ek aisa concept hain begineer confuse hote hain. 
**Method overloading** ka [example](U5_Polymorphism/CompileTimePoly.java). <br>
yaha confusion ye hain `overloading` ke waqt hum method ko kiss hadd taq overload kar sakte hain kab nhi kar sakta basically rules 

#### Rule of Method OverLoading
To successfully overload a method, you must change at least one of the following in the parameter list:

- The number of parameters (e.g., add(int a) vs add(int a, int b))

- The data types of the parameters (e.g., add(int a) vs add(double a))

- The sequence of the parameters (e.g., display(int a, String b) vs display(String b, int a))

> **Note**: Sirf aap return type change nhi kar sakte. compiler error show karega because parameter same hain but return type different hain


#### Rules of Method Overriding 
iska rule different hain isme hum `parameter` , `return type` kuch bhi change nhi kar sakte sirf method ke behaviour ko change karte hain `@Override` keyword  use karke </br>
[code example](testSubject/MethodOverride.java#L12-15)
