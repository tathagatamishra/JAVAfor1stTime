# MORE JAVA TIPS

##

> ### 1. Why public class name should match with filename?

- In Java, the `filename` must match the `public class name` exactly, including capitalization.
- This filename & public class name is `Case-Sensitive`.
- Java uses the filename to locate the class during compilation.
- If they don't match, the compiler simply can't find it.
- This only apply to public class.
- Example:

```java
fileName.java  →  class FileName   ( mismatch = error ) 
FileName.java  →  class fileName   ( mismatch = error ) 
fileName.java  →  class fileName   ( match    = works )  // not recommended
FileName.java  →  class FileName   ( match    = works )  // recommended
```

</br>

---
