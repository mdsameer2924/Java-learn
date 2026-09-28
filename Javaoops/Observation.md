### This file is created for hand on learning purpose while hand ons what i learn jot down here 
# Table of Content
- [Public class limit](Observation.md#observation-1st)
- [Importance of public specifier](Observation.md#observation-2nd)
- [Method return type rules](Observation.md#observation-3rd)
- [`This` reference variable](Observation.md#observation-4th)
- [Naming convention](Observation.md#observatoin-5th)
- [Encapsulation getter and setter rules](Observation.md#observation-6th)
-------------------------
## Observation 1st
Java file mein sirf maximum ek hi **public class** hu sakti hain and wahi filename hoga 
#### Conclusion: 
ek file ke andar ek ki class banao industry standard hain.
> learn from [reference](Q1.java)

## Observation 2nd
 Java mein main function public keyword (access specifier) important hain warna `JVM` Usse call nhi kar sakta and agar different folder se access karna chahe tho possible nhi 
> learn from [reference](Q2.java), [example](https://gemini.google.com/app/dd8f395339c2ef0e#:~:text=Gemini%20said-,To%20understand%20why,public,-.)
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
**[refernce](../../testSubject/methodReturnType.java#L3-5): of this above code block** 
> - return type --> hain String
> - but niche return -> `length * breadth` kar rha hain.
>
> isliye ye wala `codeBlock` nhi chalega `length/breadth` ka `dataType` `int` hain and method ka `String`.

#### Based on my Obseration.
- String se int mein ye problem de rha hain.
- lekin float/double [`method`]'s return type  se nhi de rha int [`Variable/parameter,class members`] mein


## Observation 4th
**`this` reference variable** constructor ke parameter and class member ko connected karta hain ek tariqa se. iske bina kuch problem aati hain uska reference niche hain 

**example taken**<br>[here](https://gemini.google.com/app/a9bf7eab1c97e62f#:~:text=The%20exact%20scenario,your%20program%20later.) | [source code example](../../testSubject/ThisImportance.java#L7-8)


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
