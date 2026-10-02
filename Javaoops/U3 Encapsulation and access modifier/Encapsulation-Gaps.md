# U3 — Encapsulation: Where I Am Stuck (code review notes)

> Review date: 2026-09-27 · Reviewed by: Cline (on request)
> Toolchain used to verify: `javac 25.0.4.1` / OpenJDK 25 (Linux)
> Files reviewed: `main.java`, `Second.java`, `Third.java`, `practice/FirstQuestion.java`, `practice/Fry.java`
> Nothing in your `.java` files was changed. This file only records the analysis.

## 0. Compile / run evidence (kya actually chala)

| File | javac result | Runtime result |
|---|---|---|
| `main.java` (BankAccount) | ✅ compiles | `sameer 1 400000.00` → `406743.0` → `sameer 1 406743.00` |
| `Second.java` (UserProfile) | ✅ compiles | `CodeNinja is 15` → `Error: User must be at least 13 years old.` |
| `Third.java` (Child) | ❌ **2 errors** | never runs |
| `practice/FirstQuestion.java` | ✅ compiles | prints **nothing** (empty `main`) |
| `practice/Fry.java` | ✅ compiles | `Title: batman | Rating: 9.90` |

`Third.java` errors (exact javac output):
```
Third.java:6: error: cannot find symbol
        setage(age);
  symbol:   method setage(int)
  location: class Child
1 error
```
and after fixing that name, the **second** error appears:
```
Third.java:19: error: missing return statement
    }
1 error
```
So `Third.java` has 2 problems, the second one hidden behind the first. **This is not an encapsulation problem — it happened because encapsulation was added into a file that was never run once in its simple form.**

## 1. Where you are actually stuck (root causes, not symptoms)

### Gap 1 — You think a "getter" is "a method that shows the data" 🔴 biggest blocker
Your getters print instead of return, in every single file:

| File | What you wrote | What a getter must be |
|---|---|---|
| `main.java` | `void getAccount()` → `System.out.printf(...)` | `String getName()` / `int getEmpId()` / `double getSalary()` |
| `Fry.java` | `void getMoviesDetails()` → `System.out.printf(...)` | `String getTitle()` / `double getRating()` |
| `Third.java` | `void getChildAge()` → `System.out.println(this.age)` | `int getAge()` |

`Second.java` is the **only** file where you got it right (`getUsername()` returns `String`), but the habit did not carry into the practice folder, because there you wrote from scratch without a template.

Why it matters: a getter that prints cannot be used inside another calculation, cannot be printed twice, and cannot be tested. `print` = behaviour/display, `return` = data. Keep them separate.
**Rule to memorise: `get` → returns a value, `set` → takes a value and returns nothing (`void`), `show/print/display` → prints.**

### Gap 2 — Setters with a made-up return type and the wrong job
- `main.java`: `double setAccount(double amount){ this.salary += amount; return this.salary; }`
  This is **not a setter**. It *adds* to the salary (that is a `deposit()` business action) and returns a value (setters return `void`). The name lies about what the method does.
- `Third.java`: `int setChildAge(int age){ ... }` → declared `int` but has **no return statement** → `missing return statement`. You also copied the `return this.x;` habit from `main.java` into a method you never finished.
- `FirstQuestion.java`: `double setValue(String title, double rating)` → sets **two** fields and returns a `double`. A setter sets **one** field.

### Gap 3 — Validation written against the field instead of the parameter 🔴 classic beginner bug
`Third.java`:
```java
int setChildAge(int age){
    if (this.age > 13){   // BUG: this always reads the FIELD (0 for a new object)
    }                     // also: empty body -> nothing is ever assigned
}
```
Comparison must use the **parameter** (`age`), never the field, and the body must actually assign. Live proof:

```java
class Wrong {
    private int age;
    Wrong(int age){ setAge(age); }
    int setAge(int age){
        if (this.age > 13) { this.age = age; }   // this.age is 0 on a new object
        else System.out.println("WRONG: rejected " + age + " (field was " + this.age + ")");
        return this.age;
    }
    int getAge(){ return age; }
}
// OUTPUT: WRONG: rejected 15 (field was 0)  -> age stayed 0, silently.
```
A perfectly valid age (15) got rejected and the object ended up with `age = 0`, with **no exception** to warn you. Silent wrong data is the worst kind of bug.

### Gap 4 — Constructor + setter wiring is half understood
- ✅ You know the trick: `Second.java` line 9 `setAge(age);` and `Fry.java` line 15 `setMovieValue(title,rating);` — calling the setter from the constructor so validation applies from day 1. Good instinct.
- ❌ But `Third.java` line 6 calls `setage(age)` while the method is `setChildAge` → **Java is case-sensitive** → `cannot find symbol`. Same class where validation was also broken: the wiring was never verified by running it.
- ❌ `FirstQuestion.java` line 17 `Movie(){ this.title="None"; }` — the question says *"constructor to initialize the title"*, i.e. it should **take the title as a parameter** (`Movie(String title)`), not hard-code `"None"`. Your own `// TODO work on it` shows you felt it was off but moved on.
- ❌ `BankAccount`'s constructor does **no validation** (`salary` accepted as-is), so `main.java` is "encapsulated" only in the sense that the fields are `private`.

### Gap 5 — Access-modifier confusion (concept, not syntax)
`main.java` line 2 comment: *"Use public access modifiers -> public, private, and protected"*.
`public`, `private`, `protected` are the four **option values** of an access modifier (`default` is the 4th), not synonyms.
Line 3 then makes `name` **public** while `empId`/`salary` are private → half-open class. A class is not encapsulated when one field is a public door.

Structural: `FirstQuestion.java` declares `package practice;` but `Fry.java` in the **same folder** has no package declaration → same folder, two different packages. Your U1/U2 `Q*.java` files all declare `package practice;` because the folder is `practice`. Be consistent.

## 2. What you did RIGHT (so you don't lose it)

1. `private` on the fields — in all 5 files, 100% of the time. That is the foundation and you never forgot it.
2. `Second.java` is your best file: private fields + constructor delegating to the setter + a **read-only** `getUsername()` with the comment *"notice there is no setter for username!"*. That is a real design decision, not a copy-paste. 🏆
3. You use `this.` consistently in constructors/setters.
4. `Fry.java` uses the setter-in-constructor pattern correctly **and** prints through `printf` — formatting is clean.
5. You already documented your own niggles with `// TODO` comments. You *feel* where the gaps are; you just aren't stopping to fix them.

## 3. Fixed reference: Question 1 (`Movie`) — the shape every encapsulation answer should have

```java
package practice;

class Movie {
    private String title;
    private double rating;

    Movie(String title) {          // question says: constructor initializes the title
        this.title = title;
        this.rating = 0.0;         // explicit default, so the field is never accidentally 0
    }

    // ---- getters: they RETURN, they do not print ----
    public String getTitle() { return title; }
    public double getRating() { return rating; }

    // ---- setters: return void, one field each, validate the PARAMETER ----
    public void setTitle(String title) {
        if (title != null && !title.isBlank()) this.title = title;
        else System.out.println("Error: title cannot be empty.");
    }

    public void setRating(double rating) {
        if (rating >= 0 && rating <= 10) this.rating = rating;
        else System.out.println("Error: rating must be between 0 and 10.");
    }
}

public class FirstQuestion {
    public static void main(String[] args) {
        Movie m1 = new Movie("Interstellar");
        m1.setRating(8.5);
        System.out.printf("Title: %s | Rating: %.1f%n", m1.getTitle(), m1.getRating());
    }
}
```
Output: `Title: Interstellar | Rating: 8.5`

Note the separation: the class only *holds* data and *enforces rules*; `main` does the printing. `Fry.java`'s `getMoviesDetails()` printer is allowed to exist **on top of** real getters — but it can never be a replacement for them.

## 4. Common mistakes beginners make with encapsulation (tick the ones you have done)

| # | Mistake | Why it breaks encapsulation | Seen in your code? |
|---|---|---|---|
| 1 | Getter that prints instead of returning | data can't be reused, tested, or combined; `get` lies | ✅ `main.java`, `Fry.java`, `Third.java` |
| 2 | Setter returns a value / returns the field | callers get used to `x = obj.setY(z)`, a chain that survives the `void` refactor | ✅ `main.java`, `FirstQuestion.java` |
| 3 | One setter for two fields (`setValue(title, rating)`) | you lose per-field control and validation | ✅ `FirstQuestion.java` |
| 4 | Validating `this.field` instead of the parameter | field is still 0/null on a new object → validation is dead code | ✅ `Third.java` |
| 5 | Setter name doesn't match what it does (`setAccount` that *adds*) | misleading API; a "set" must replace | ✅ `main.java` |
| 6 | Forgetting `return` in a non-void setter | `missing return statement` compile error | ✅ `Third.java` |
| 7 | Method name case mismatch (`setage` vs `setChildAge`) | `cannot find symbol`; javac hides the next error behind it | ✅ `Third.java` |
| 8 | Leaving one field `public` "just for convenience" | one public field = no encapsulation; any code can corrupt it | ✅ `main.java` (`public String name`) |
| 9 | No validation at all in fields that clearly need rules | `new Child("x", -50)` would be accepted | ✅ `main.java`, `FirstQuestion.java` |
| 10 | Constructor sets fields directly, setter exists but is bypassed | rules apply only when someone remembers to call the setter | ⚠️ `main.java` |
| 11 | No default constructor thinking: object created but a field stays `null`/`0` silently | `NullPointerException` later, far from the cause | ⚠️ `FirstQuestion.java` (`rating` never set) |
| 12 | Class name vs content mismatch (`BankAccount` holding `empId`, `salary`) | the class "does" nothing recognisable; SRP/purpose unclear | ✅ `main.java` |
| 13 | Confusing `private`/`public`/`protected` as "types" of modifier rather than option values | wrong modifier chosen by guesswork | ✅ `main.java` comment |
| 14 | Adding encapsulation to code that has never run once | you debug two things at the same time (syntax + design) | ✅ `Third.java` |
| 15 | `equals`/`toString` ignored, so the only way to see an object is a custom print method | the reason people invent printing "getters" in the first place | — (comes later) |
| 16 | `static` used to "fix" an access problem | shortcuts the object model | — (watch for it) |
| 17 | Package/import drift between files in the same folder | `cannot find symbol` / wrong package at run time | ✅ `FirstQuestion.java` vs `Fry.java` |

## 5. Your action plan (do it in this order)

1. **Fix `Third.java` properly** (it's the file with the real errors):
   ```java
   class Child {
       private String name;
       private int age;
       Child(String name, int age) {
           this.name = name;
           setChildAge(age);            // exact method name, exact case
       }
       public String getName() { return name; }   // returns, does not print
       public int getAge()     { return age;  }
       public void setChildAge(int age) {         // void, validates the PARAMETER
           if (age >= 13) this.age = age;
           else System.out.println("Error: age must be 13 or above.");
       }
   }
   ```
   (Note `>=` not `>`: with `>` a 13-year-old would be rejected, which contradicts the message.)
2. **Rewrite `practice/FirstQuestion.java`** using the reference in section 3, then **delete or rename `Fry.java`** so the same question doesn't exist twice with two different designs.
3. **Rename `main.java`'s class/methods** in your head, then in the file: `BankAccount` → `Employee` (`name`, `empId`, `salary`), getters `getName()/getEmpId()/getSalary()`, and change `setAccount(double amount)` into `void setSalary(double salary)` + a separate `void deposit(double amount) { if (amount > 0) this.salary += amount; }`.
4. Rebuild the **Movie** question once more from a blank file, without looking, following the section-3 shape. If you can do it without a template, the gap is closed.
5. Add a 6th observation to `U1 .../README.md`: **"getter returns, setter takes, printer prints — teen alag kaam hain"**.

## 6. FAQ — "So in encapsulation, one getter/setter means at most ONE attribute?"

**Short answer: yes for the standard case — but the rule is about *properties*, not about how many fields a method may read.**

| Method kind | Params | Fields it WRITES | Fields it may READ | Allowed? |
|---|---|---|---|---|
| `getTitle()` | 0 | 0 | exactly 1 (`title`) | ✅ field-backed getter |
| `getArea()` | 0 | 0 | many (`length`, `width`) | ✅ **computed** getter — 1 *derived value* out |
| `setTitle(String)` | 1 | exactly 1 (`title`) | any (for validation) | ✅ setter |
| `setValue(String, double)` | 2 | 2 | any | ❌ not a setter — rename it |
| `getItems()` | 0 | 0 | 1 collection | ✅ return a **copy**, not the internal list |
| `getItems(int index)` | 1 | 0 | 1 collection | ✅ only legal exception (indexed property) |

**The setter rules: 1 parameter → 1 field → `void`.** A setter may *read* other fields to validate, but it must *write* only one.

### Why (proved by running it)
Multi-field "setter" produces a **partial update** with no signal to the caller:
```
1) Multi-field 'setter' -> PARTIAL UPDATE (silent, half-broken object):
   before: name=unknown, price=0.0, stock=0
   [rejected] price -5.0
   after : name=Pen, price=0.0, stock=10   <- name+stock changed, price silently did NOT

2) One setter per field -> each call is atomic:
   [rejected] price -5.0
   after : name=Pen, price=0.0, stock=10   <- each rule applied independently

3) A getter may compute from many fields:
   getLength()=4 getWidth()=5 getArea()=20
```
In case (1) the object is now in a state nobody designed: `name` and `stock` are new, `price` is old, and there's no return value, no boolean, and no exception to tell you. Java gives you **no rollback**. That's the whole argument for one-field setters.

### The 6 real reasons the one-field convention exists
1. **Atomicity** — each call fully succeeds or fully fails; no half-updated objects.
2. **Per-property rules** — each field gets its own validation (`age >= 13`, `rating` 0–10).
3. **Read-only / write-only properties** — `Second.java` deliberately has `getUsername()` and **no** setter. Try to express "username is read-only but age is writable" with a combined `setUser(name, age)` — you can't.
4. **Frameworks** — Spring, Jackson/JSON, JavaBeans, IDE property editors and JSP EL all discover properties by the `getXxx()/setXxx()` signature. `setMovieValue(title, rating)` is **invisible** to every one of them.
5. **Honest naming** — `setValue(...)` never says *which* value.
6. **Debuggability** — you can log/trace exactly which field changed, and `toString()`/diffing stays meaningful.

### Fair exceptions (these are NOT violations)
- **Constructors** assign many fields — that is literally their job (one-time setup, all-or-nothing before the object escapes).
- **Business/behaviour methods** with many params are legitimate — just don't name them `set*`:
  ```java
  // OK: an action, not a property
  public void updateProfile(String name, int age) {
      // validate EVERYTHING first, then assign -> keeps it all-or-nothing
      if (name == null || name.isBlank() || age < 13) {
          System.out.println("Error: invalid profile data.");
          return;
      }
      this.name = name;
      this.age  = age;
  }
  ```
  → This is "tell, don't ask": you tell the object to do a job, it keeps its own invariants. Contrast with `main.java`'s `setAccount(double amount)` which is named like a setter but behaves like `deposit()`.
- **Computed getters** (`getArea()`, `getFullName()`, `getYearlySalary()`) read as many fields as they want — they expose a *derived* value, and the class stays the single source of truth.

### Bridge back to your files
- `Fry.java`: `setMovieValue(String title, double rating)` → split into `setTitle(String)` + `setRating(double)`.
- `FirstQuestion.java`: `double setValue(String title, double rating)` → split the same way, and drop the returned `double`.
- `main.java`: `double setAccount(double amount)` → becomes `void setSalary(double salary)` + `void deposit(double amount)`.
- `Second.java`: already perfect — closest to the convention in the whole repo.

### Self-check before every `javac` (10 seconds)
- [ ] Are **all** fields `private`?
- [ ] Does every **getter** `return` the field (not print it)?
- [ ] Does every **setter** return `void` and touch **one** field?
- [ ] Does validation compare the **parameter**, not `this.field`?
- [ ] Does the constructor either set fields directly *or* call the setters — and does the setter name/case exist?
- [ ] Is there any method named `getXxx()/setXxx()` whose body prints, adds, or returns? → rename it.
- [ ] Did I run it, read the output, and confirm it is what I expected?
