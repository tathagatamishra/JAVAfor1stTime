# Java Packages & OOP — What I Learned

## 1. Packages

A **package** is a way to organize related Java classes into folders.

To declare a class as part of a package, add this at the very top of the file:

```java
package myShapePackage;
```

### Folder Structure Rule

The folder name **must exactly match** the package name. If your package is `myShapePackage`, the file must live inside a folder called `myShapePackage/`.

```
JavaBasics/
├── myShapePackage/
│   └── CircleShape.java      ← belongs to package myShapePackage
└── TestCircle.java           ← uses the package
```

For nested packages like `com.myapp.shapes`, the folder structure must follow:

```
com/
└── myapp/
    └── shapes/
        └── CircleShape.java
```

### Importing a Package

To use a class from another package:

```java
import myShapePackage.CircleShape;
```

---

## 2. Class Design — Stateful vs Stateless

### Stateful (stores data in fields)

The radius is stored inside the object via a constructor. Good when you need to reuse the same value across multiple methods.

```java
public class CircleShape {

    private double CircleRadius;  // field

    public CircleShape(double radius) {  // constructor
        this.CircleRadius = radius;
    }

    public double area() {
        return Math.PI * CircleRadius * CircleRadius;
    }
}
```

Usage:

```java
CircleShape myCircle = new CircleShape(5.0);
myCircle.area();  // uses stored radius
```

### Stateless (receives data as arguments)

Simpler approach — just pass the value directly into the method each time.

```java
public double area(double radius) {
    return Math.PI * radius * radius;
}
```

Usage:

```java
CircleShape myCircle = new CircleShape();
myCircle.area(5.0);  // pass radius each time
```

> **When to use which?** Stateful is better when multiple methods share the same data. Stateless is simpler for one-off calculations.

---

## 3. Constructors

- A constructor **must have the exact same name** as the class.
- It has **no return type**.
- It runs automatically when you create an object with `new`.

```java
public class CircleShape {

    public CircleShape(double radius) {  // ✅ name matches class
        this.CircleRadius = radius;
    }
}

// Wrong:
public Circle(double radius) { }  // ❌ name doesn't match class
```

---

## 4. static vs non-static

|                  | `static`                         | non-static            |
|------------------|----------------------------------|-----------------------|
| Belongs to       | The **class**                    | An **object**         |
| Needs an object? | ❌ No                            | ✅ Yes               |
| Called via       | `ClassName.method()` or directly | `objectName.method()` |

```java
// static — call directly, no object needed
public static double ezArea(double radius) {
    return Math.PI * radius * radius;
}

// non-static — need an object first
public double area() {
    return Math.PI * CircleRadius * CircleRadius;
}
```

---

## 5. The `main` Method

`main` is the **entry point** — the JVM calls this to start your program.

```java
public static void main(String[] args) { }
```

- It must **always be `static`** — because the JVM calls it before any object exists. If it weren't static, the JVM would need an object to call it on, but no object exists yet.
- You **cannot** make `main` non-static. It's a hard Java rule.
- From inside `main`, you can only call `static` methods directly. For non-static methods, you must create an object first:

```java
public static void main(String[] args) {
    ezArea(5.0);                          // ✅ static, call directly

    CircleShape c = new CircleShape(5.0); // create object first
    c.area();                             // ✅ then call non-static
}
```

---

## 6. Blueprint vs Entry Point

In a real Java project, classes have two distinct roles:

| Role                | Example       | Has `main`? | Can run directly? |
|---------------------|---------------|-------------|-------------------|
| Blueprint / utility | `CircleShape` | Usually no  | ❌ No             |
| Entry point         | `TestCircle`  | ✅ Yes      | ✅ Yes            |

`CircleShape` is a **blueprint** — it defines what a circle can do. You never run it directly.
`TestCircle` is the **entry point** — it creates circles and uses them.

Think of it like: `CircleShape` is a recipe card. `TestCircle` is the chef who reads it and cooks.

---

## 7. Running Files with Code Runner (Ctrl+Alt+N)

- Always have **`TestCircle.java`** as the active tab when you press Ctrl+Alt+N.
- Running `CircleShape.java` directly with Code Runner will error — this is expected and normal, because Code Runner doesn't handle package paths well.
- `CircleShape` has no `main` anyway (unless you add one for testing), so it's not meant to be run directly.

---

## Full Working Example

**`myShapePackage/CircleShape.java`**

```java
package myShapePackage;

public class CircleShape {

    private double CircleRadius;

    public CircleShape(double radius) {
        this.CircleRadius = radius;
    }

    public double area() {
        return Math.PI * CircleRadius * CircleRadius;
    }

    public static double ezArea(double radius) {
        return Math.PI * radius * radius;
    }
}
```

**`TestCircle.java`**

```java
import myShapePackage.CircleShape;

public class TestCircle {
    public static void main(String[] args) {

        CircleShape myCircle = new CircleShape(5.0);
        
        System.out.println(myCircle.area());
    }
}
```
