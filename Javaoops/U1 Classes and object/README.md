# U1 — Classes and Objects — Notes

> **Source:** concept extracted from the master [`Observation.md`](../Observation.md). The original observation file is kept untouched — this is only the per-unit copy of the concept.
> **Unit per roadmap:** Unit 1: Classes and Objects (The Blueprint and the Reality)

---

## Observation 1st — Public class limit

Java file mein sirf maximum ek hi **public class** hu sakti hain and wahi filename hoga.

#### Conclusion:
ek file ke andar ek hi class banao industry standard hain.

> learn from [reference](practice/Q1.java)

---

## Observation 2nd — Importance of public specifier

Java mein main function public keyword (access specifier) important hain warna `JVM` usse call nhi kar sakta and agar different folder se access karna chahe tho possible nhi.

> learn from [reference](practice/Q2.java), [example](https://gemini.google.com/app/dd8f395339c2ef0e#:~:text=Gemini%20said-,To%20understand%20why,public,-.)

#### Conclusion
- [ ] Practically try how not using public affect and restrict main method file within same package

---

## Observation 3rd — Method return type rules

method ke return type and return value same honi chahiye warna dikkat hain.

#### Example:
```java
String areaOfRectange(int length, int breadth){
    return length*breadth
}
```

ye wala work nhi karega because `returnType` different hain actual value jho return kar rha hain usse.<br>
**[reference](../testSubject/methodReturnType.java#L3-5): of this above code block**

> - return type --> hain String
> - but niche return -> `length * breadth` kar rha hain.
>
> isliye ye wala `codeBlock` nhi chalega `length/breadth` ka `dataType` `int` hain and method ka `String`.

#### Based on my Obseration.
- String se int mein ye problem de rha hain.
- lekin float/double [`method`]'s return type se nhi de rha int [`Variable/parameter,class members`] mein

---

## Observation 5th — Naming convention

jaha taq mujhe pata chala, naming convention industry standard ke hisab se hote hain and langauge dependent hote hain
kuch rules same hu sakte hain and overlap kar sakte hain but kuch different hu sakte hain
isliye hume inhe use karna chahiye better practice hain like:<br>
- **Classes & Interfaces:** PascalCase (e.g., BankAccount, String)
- **Methods:** camelCase (e.g., calculateArea(), getYearlySalary())
- **Variables & Attributes:** camelCase (e.g., monthlySalary, empId)
- **Constants (static final):** UPPER_SNAKE_CASE (e.g., MAX_SPEED, PI_VALUE)
- **Packages:** lowercase (e.g., java.util, practice)

---

_Extracted only; the master [`Observation.md`](../Observation.md) remains the single source of truth._