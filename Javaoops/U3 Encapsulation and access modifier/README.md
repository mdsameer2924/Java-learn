# U3 — Encapsulation and Access Modifiers — Notes

> **Source:** concept extracted from the master [`Observation.md`](../Observation.md). The original observation file is kept untouched — this is only the per-unit copy of the concept.
> **Unit per roadmap:** Unit 3: Encapsulation and Access Modifiers (Data Hiding & Security)
> **See also (existing review notes in this folder):** [`Encapsulation-Gaps.md`](Encapsulation-Gaps.md) · code: [`main.java`](main.java), [`Second.java`](Second.java)

---

## Observation 6th — Encapsulation: getter and setter rules

`Encapsulation` mein hum apne attributes and method ko capsulate karte hain and restriction set karte hain unauthorized access se **`Access Modifier`** use karke like
- Public
- Private
- Protected

and hum basically **`Private`** ka use karte hain Protected bhi kar sakte hain uske use different hain
tho humne `attributes` and `methods` ko private kar diya ab hum outside the class access nhi kar sakte tho ab hume banana padega **2 public `getter` and `setter`**

#### Getter and Setter rules:
> getter and setter humesa at most 1 attribute modify ya access karenge
>
> getter humesa attribute return karega void use nhi karna method mein

---

_Extracted only; the master [`Observation.md`](../Observation.md) remains the single source of truth._