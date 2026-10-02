# U5 — Polymorphism — Notes

> **Source:** concept extracted from the master [`README.md`](../README.md). The original observation file is kept untouched — this is only the per-unit copy of the concept.
> **Unit per roadmap:** Unit 5: Polymorphism (Overloading & Overriding - One Name, Many Forms)

---

## Observation 8th — Polymorphism and Upcasting

`Polymorphism` has two types in **Java** and types ke name hain:

<details open>
<summary><b>Compile Time Polymorphism</b></summary>
</br>
<p> <b>Compile Time:</b> Isme same class ke andar <code> Multiple Methods hote hain</code>  Same name se bas parameter different hote hain. <br><a href="CompileTimePoly.java"> Code example </a>  </p>
</details>

<details open>
<summary><b>Run Time Polymorphism</b></summary>
<div>
<p> <b> Run Time:</b> Polymorphism tab banta hain jab hum multiple class banate hain and usme access karte hain basically <code>Inheritance</code> ke waqt <b> Parents ke methods ko Modify karte hain access ke saath saath</b><br>
<a href="RunTimemain.java"> Code example</a>

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

---

## Observation 9th — Method overriding and overloading rules

`method overriding` and `method overloading` yaha ek aisa concept hain begineer confuse hote hain. 
**Method overloading** ka [example](CompileTimePoly.java). <br>
yaha confusion ye hain `overloading` ke waqt hum method ko kiss hadd taq overload kar sakte hain kab nhi kar sakta basically rules 

#### Rule of Method OverLoading
To successfully overload a method, you must change at least one of the following in the parameter list:

- The number of parameters (e.g., add(int a) vs add(int a, int b))

- The data types of the parameters (e.g., add(int a) vs add(double a))

- The sequence of the parameters (e.g., display(int a, String b) vs display(String b, int a))

> **Note**: Sirf aap return type change nhi kar sakte. compiler error show karega because parameter same hain but return type different hain


#### Rules of Method Overriding 
iska rule different hain isme hum `parameter` , `return type` kuch bhi change nhi kar sakte sirf method ke behaviour ko change karte hain `@Override` keyword  use karke </br>
[code example](../testSubject/MethodOverride.java#L12-15)

---

_Extracted only; the master [`README.md`](../README.md) remains the single source of truth._