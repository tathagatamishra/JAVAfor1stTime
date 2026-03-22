# Java/Spring vs JavaScript/Node

---

## 1. Variables & Data Types

### Java Primitive Types

| Type      | What it stores   | Example                          |
|-----------|------------------|----------------------------------|
| `int`     | whole number     | `int age = 25;`                  |
| `long`    | big whole number | `long population = 8000000000L;` |
| `double`  | decimal number   | `double price = 9.99;`           |
| `float`   | small decimal    | `float rate = 3.14f;`            |
| `boolean` | true/false       | `boolean active = true;`         |
| `char`    | single character | `char grade = 'A';`              |
| `String`  | text object      | `String name = "John";`          |

### Declaring Variables

![!](https://dummyimage.com/14/ffd230/white?text=!) &nbsp; To create a Constant in JAVA we use `final`

![!](https://dummyimage.com/14/ffd230/white?text=!) &nbsp; Java added `var` so we don't always have to declare the type, Java figures it out

</br>

```js
// JavaScript - no types needed

let name = "John";
let age = 25;
let price = 9.99;
let isActive = true;

const name = "John";
const age = 25;
const price = 9.99;
const isActive = true;

var name = "John";
var age = 25;
var price = 9.99;
var isActive = true;
```

```java
// Java - every variable needs a type

// With only datatype
String name = "John";
int age = 25;
double price = 9.99;
boolean isActive = true;

// With final
final String name = "John";
final int age = 25;
final double price = 9.99;
final boolean isActive = true;

// With var - no types needed
var name = "John";
var age = 25;
var price = 9.99;
var isActive = true;
```

---

</br>

## 2. Strings

```js
// JavaScript
let name = "John";
let greeting = `Hello ${name}`;         // template literal
let upper = name.toUpperCase();
let length = name.length;
let sub = name.substring(0, 2);
let includes = name.includes("oh");
```

```java
// Java
String name = "John";
String fullname = name + "Doe";
String greeting2 = String.format("Hello %s", name);
String upper = name.toUpperCase();
int length = name.length();                 // method, not property
String sub = name.substring(0, 2);
boolean includes = name.contains("oh");     // contains not includes
boolean equals = name.equals("John");       // use .equals() NOT ==
```

### ![!](https://dummyimage.com/14/ffd230/white?text=!) &nbsp; Important

- In Java NEVER compare Strings with `==`. Always use `.equals()`.
- `==` checks if they are the same `object` in memory, not the same `text`.

---

### Template Literals

```js
// Javascript
`Hello ${name}`
```

```java
// Java
String.format("Hello, my name is %s and I am %d years old", "John", 25);
```

### Common Placeholders in `String.format()`

| Placeholder | Used For       |
|-------------|----------------|
| `%s`        | String         |
| `%d`        | int / long     |
| `%f`        | float / double |
| `%b`        | boolean        |
| `%c`        | char           |

---

</br>

## 3. Arrays & Lists

```js
// JavaScript — arrays are flexible
let fruits = ["apple", "banana", "mango"];
fruits.push("orange");
fruits.length;
fruits[0];
fruits.includes("apple");
fruits.forEach(f => console.log(f));
fruits.map(f => f.toUpperCase());
fruits.filter(f => f.length > 5);
```

```java
// Java — fixed-size array (rarely used directly)
String[] fruits = {"apple", "banana", "mango"};
fruits.length;   // no push, size is fixed

// Java — ArrayList (like JS array, dynamic size)
import java.util.ArrayList;
import java.util.List;

List<String> fruits = new ArrayList<>();
fruits.add("apple");
fruits.add("banana");
fruits.size();                        // .length in JS
fruits.get(0);                        // fruits[0] in JS
fruits.contains("apple");             // .includes() in JS
fruits.remove("apple");               // .filter() equivalent

// looping
for (String fruit : fruits) {        // like for...of in JS
    System.out.println(fruit);
}

// streams — like .map() .filter() in JS
import java.util.stream.Collectors;

List<String> upper = fruits.stream()
    .map(f -> f.toUpperCase())
    .collect(Collectors.toList());

List<String> long = fruits.stream()
    .filter(f -> f.length() > 5)
    .collect(Collectors.toList());
```

### Collections Comparison

| JavaScript | Java | Use |
|---|---|---|
| `[]` Array | `List<T>` ArrayList | ordered, dynamic list |
| `{}` Object | `Map<K,V>` HashMap | key-value pairs |
| `new Set()` | `Set<T>` HashSet | unique values only |

---

## 4. Objects vs Classes

```js
// JavaScript — plain object
const user = {
    name: "John",
    age: 25,
    greet: function() {
        return `Hello ${this.name}`;
    }
}
```

```java
// Java — everything is a class
public class User {
    private String name;
    private int age;

    public String greet() {
        return "Hello " + this.name;
    }
}

// create an instance
User user = new User();
```

---

## 5. Functions vs Methods

```js
// JavaScript — functions exist freely
function createUser(name, age) {
    return { name, age };
}

const createUser = (name, age) => ({ name, age });
```

```java
// Java — functions must live inside a class (called methods)
public class UserService {

    // accessModifier returnType methodName(paramType paramName)
    public User createUser(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        return user;
    }

    // void = returns nothing (like no return in JS)
    public void deleteUser(int id) {
        // delete logic
    }

    // private = can only be called inside this class
    private boolean isValid(String name) {
        return name != null && !name.isEmpty();
    }
}
```

### Method Anatomy

```java
public    UserSchema    createUser  (String name,  int age)
  ↑           ↑             ↑            ↑           ↑
access     return type    method      param1       param2
modifier                   name     (type+name)  (type+name)
```

---

## 6. Conditionals

```js
// JavaScript
if (age >= 18) {
    console.log("adult");
} else if (age >= 13) {
    console.log("teen");
} else {
    console.log("child");
}

// ternary
const label = age >= 18 ? "adult" : "minor";
```

```java
// Java — identical syntax!
if (age >= 18) {
    System.out.println("adult");
} else if (age >= 13) {
    System.out.println("teen");
} else {
    System.out.println("child");
}

// ternary — same as JS
String label = age >= 18 ? "adult" : "minor";
```

### Switch

```js
// JavaScript
switch (day) {
    case "Mon": console.log("Monday"); break;
    case "Tue": console.log("Tuesday"); break;
    default: console.log("other");
}
```

```java
// Java — same syntax
switch (day) {
    case "Mon": System.out.println("Monday"); break;
    case "Tue": System.out.println("Tuesday"); break;
    default: System.out.println("other");
}

// Java modern switch (Java 14+) — cleaner
switch (day) {
    case "Mon" -> System.out.println("Monday");
    case "Tue" -> System.out.println("Tuesday");
    default    -> System.out.println("other");
}
```

---

## 7. Loops

```js
// JavaScript
for (let i = 0; i < 5; i++) { console.log(i); }

for (let fruit of fruits) { console.log(fruit); }

fruits.forEach(fruit => console.log(fruit));

while (x > 0) { x--; }
```

```java
// Java
for (int i = 0; i < 5; i++) { System.out.println(i); }

for (String fruit : fruits) { System.out.println(fruit); } // for...of equivalent

fruits.forEach(fruit -> System.out.println(fruit)); // same as JS forEach

while (x > 0) { x--; }
```

---

## 8. Null Handling

```js
// JavaScript
let user = null;
if (user !== null) { ... }
let name = user?.name;          // optional chaining
let name2 = user?.name ?? "Guest"; // nullish coalescing
```

```java
// Java
String user = null;
if (user != null) { ... }

// Optional (Java 8+) — like optional chaining
import java.util.Optional;

Optional<String> name = Optional.ofNullable(user);
name.orElse("Guest");          // like ?? "Guest"
name.isPresent();              // check if not null
name.ifPresent(n -> System.out.println(n)); // run only if not null
```

---

## 9. Error Handling

```js
// JavaScript
try {
    const data = JSON.parse(text);
} catch (error) {
    console.log("Error:", error.message);
} finally {
    console.log("always runs");
}

// throwing errors
throw new Error("Something went wrong");
```

```java
// Java — same structure
try {
    int result = 10 / 0;
} catch (ArithmeticException e) {
    System.out.println("Error: " + e.getMessage());
} finally {
    System.out.println("always runs");
}

// throwing errors
throw new RuntimeException("Something went wrong");
throw new IllegalArgumentException("Invalid input");

// Java requires you to declare checked exceptions in the method signature
public void readFile(String path) throws IOException {
    // file reading code
}
```

### Common Java Exceptions

| Java Exception | When it happens |
|---|---|
| `NullPointerException` | accessing a null object |
| `ArrayIndexOutOfBoundsException` | array index doesn't exist |
| `IllegalArgumentException` | wrong argument passed |
| `RuntimeException` | general runtime error |
| `IOException` | file/network read error |

---

## 10. Classes & OOP

```js
// JavaScript class
class Animal {
    constructor(name) {
        this.name = name;
    }

    speak() {
        return `${this.name} makes a sound`;
    }
}

class Dog extends Animal {
    speak() {
        return `${this.name} barks`;
    }
}

const dog = new Dog("Rex");
dog.speak();
```

```java
// Java class
public class Animal {
    private String name;

    // constructor
    public Animal(String name) {
        this.name = name;
    }

    public String speak() {
        return this.name + " makes a sound";
    }

    // getter
    public String getName() { return name; }

    // setter
    public void setName(String name) { this.name = name; }
}

// inheritance
public class Dog extends Animal {

    public Dog(String name) {
        super(name);              // call parent constructor — like super() in JS
    }

    @Override                    // tells Java this overrides the parent method
    public String speak() {
        return getName() + " barks";
    }
}

Dog dog = new Dog("Rex");
dog.speak();
```

---

## 11. Lombok — eliminating boilerplate

The biggest pain in Java is writing getters/setters for every field. **Lombok** fixes this with annotations:

```java
// Without Lombok — lots of boilerplate
public class User {
    private int id;
    private String name;
    private int age;

    public User() {}
    public User(int id, String name, int age) { ... }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    // ... etc
}

// With Lombok — clean!
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Data               // generates all getters + setters
@NoArgsConstructor  // generates empty constructor
@AllArgsConstructor // generates constructor with all fields
public class User {
    private int id;
    private String name;
    private int age;
}
// that's it — same result as above!
```

### Lombok Annotations

| Annotation | What it generates |
|---|---|
| `@Data` | all getters + setters + toString + equals |
| `@Getter` | only getters |
| `@Setter` | only setters |
| `@NoArgsConstructor` | empty constructor |
| `@AllArgsConstructor` | constructor with all fields |
| `@Builder` | builder pattern for creating objects |

---

## 12. Spring Boot Annotations

| Annotation | Purpose | Node equivalent |
|---|---|---|
| `@SpringBootApplication` | marks main entry point | — |
| `@RestController` | class handles HTTP routes + returns JSON | `express.Router()` |
| `@Service` | class contains business logic | plain JS class/module |
| `@Repository` | class handles DB queries | mongoose model methods |
| `@Component` | generic Spring-managed class | — |
| `@GetMapping("/path")` | HTTP GET route | `router.get('/path')` |
| `@PostMapping("/path")` | HTTP POST route | `router.post('/path')` |
| `@PutMapping("/path")` | HTTP PUT route | `router.put('/path')` |
| `@DeleteMapping("/path")` | HTTP DELETE route | `router.delete('/path')` |
| `@RequestBody` | read request body | `req.body` |
| `@PathVariable` | read URL param `{id}` | `req.params.id` |
| `@RequestParam` | read query string `?name=x` | `req.query.name` |
| `@RequestHeader` | read request header | `req.headers` |
| `@Autowired` | inject a dependency | `require()` |
| `@Value` | read from application.properties | `process.env.KEY` |
| `@CrossOrigin` | enable CORS | `cors()` middleware |
| `@Valid` | validate request body | Joi/express-validator |

---

## 13. Dependency Injection

This is Spring's biggest concept. Instead of `require()`, Spring creates and injects objects for you:

```js
// Node — manual import
const userService = require('./userService');

const getUser = (req, res) => {
    const user = userService.getUser(req.params.id);
    res.json(user);
}
```

```java
// Java Spring — Spring injects it automatically
@RestController
public class UserController {

    private final UserService userService; // declare what you need

    // Spring sees this constructor and passes UserService in automatically
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);  // just use it
    }
}
```

---

## 14. Reading Config (like .env)

```js
// Node — .env
PORT=3000
DB_URL=mongodb://localhost:27017/mydb

// usage
const port = process.env.PORT;
const dbUrl = process.env.DB_URL;
```

```java
// Java — application.properties
server.port=8080
spring.data.mongodb.uri=mongodb://localhost:27017/mydb
jwt.secret=mysecretkey

// usage in a class
@Value("${server.port}")
private int port;

@Value("${jwt.secret}")
private String jwtSecret;
```

---

## 15. HTTP Request & Response

```js
// Node/Express
app.post('/user', (req, res) => {
    const body = req.body;               // request body
    const id = req.params.id;            // URL param
    const name = req.query.name;         // query string
    const token = req.headers.authorization; // header

    res.status(201).json({ message: "created" }); // response
});
```

```java
// Spring Boot
@PostMapping("/user")
public ResponseEntity<String> createUser(
    @RequestBody UserSchema body,            // request body
    @PathVariable int id,                    // URL param
    @RequestParam String name,               // query string
    @RequestHeader String authorization      // header
) {
    return ResponseEntity.status(201).body("created"); // response
}
```

---

## 16. Printing / Logging

```js
// JavaScript
console.log("hello");
console.log("Name:", name);
console.error("error occurred");
```

```java
// Java basic print
System.out.println("hello");
System.out.println("Name: " + name);
System.err.println("error occurred");

// Spring Boot — use Logger (recommended)
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UserService {
    private static final Logger log = LoggerFactory.getLogger(UserService.class);

    public void createUser() {
        log.info("Creating user...");       // like console.log
        log.error("Something went wrong");  // like console.error
        log.debug("Debug info");            // like console.debug
    }
}
```

---

## 17. Async — Promises vs CompletableFuture

```js
// JavaScript — async/await
const getUser = async (id) => {
    const user = await UserModel.findById(id);
    return user;
}

const createUser = async (data) => {
    try {
        const user = await UserModel.create(data);
        return user;
    } catch (err) {
        throw new Error(err.message);
    }
}
```

```java
// Java Spring — mostly synchronous (Spring handles threading)
// With Spring Data, DB calls look synchronous but Spring manages threads

public User getUser(int id) {
    return userRepository.findById(id).orElse(null);
}

// Async with CompletableFuture (less common in Spring Boot)
import java.util.concurrent.CompletableFuture;
import org.springframework.scheduling.annotation.Async;

@Async
public CompletableFuture<User> getUserAsync(int id) {
    User user = userRepository.findById(id).orElse(null);
    return CompletableFuture.completedFuture(user);
}
```

> In Spring Boot you rarely need async — Spring manages threads automatically.
> Your controller/service code looks synchronous even though it's not.

---

## 18. File Structure Comparison

```
Node.js project              Spring Boot project
─────────────────            ──────────────────────────────────────────
index.js                     MainApplication.java
config/cloudinary.js         config/CloudinaryConfig.java
controller/userCtrl.js       service/UserService.java
router/route.js              controller/UserController.java
middleware/authMware.js      middleware/AuthFilter.java
model/userModel.js           model/User.java + repository/UserRepository.java
util/sendEmail.js            util/EmailUtil.java
.env                         resources/application.properties
package.json                 pom.xml (Maven) or build.gradle (Gradle)
node_modules/                ~/.m2/repository/ (Maven local cache)
```

---

## 19. Quick Reference — Common Differences

| JavaScript | Java |
|---|---|
| `console.log()` | `System.out.println()` |
| `===` | `.equals()` for objects, `==` for primitives |
| `null` / `undefined` | `null` / `void` |
| `typeof x === 'string'` | `x instanceof String` |
| `array.length` | `list.size()` |
| `array.push(x)` | `list.add(x)` |
| `array[0]` | `list.get(0)` |
| `array.includes(x)` | `list.contains(x)` |
| `obj[key] = val` | `map.put(key, val)` |
| `obj[key]` | `map.get(key)` |
| `delete obj[key]` | `map.remove(key)` |
| `Object.keys(obj)` | `map.keySet()` |
| `Object.values(obj)` | `map.values()` |
| `JSON.stringify(obj)` | Jackson does this automatically |
| `JSON.parse(str)` | Jackson does this automatically |
| `//` comment | `//` comment (same!) |
| `/* */` comment | `/* */` comment (same!) |
| semicolons optional | semicolons required `;` |
