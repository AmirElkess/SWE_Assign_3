First test smell is the non-descriptive test names: x and x2.

---

Second smell is the multiple responsibilities of each test method, for example, test x:
```java
@Test
public void x() {
    // instantiation logic ...

    // assertions:
    assertTrue(add.equals(new Double(15)));
    assertTrue(sub.equals(new Double(5)));
    assertTrue(mul.equals(new Double(50)));
    assertTrue(div.equals(new Double(2)));
}
```

x2 also has multiple assertions:
```java
@Test
public void x2() {
    Fraction f = new Fraction(1,1);
    MyMath mm = new MyMath();
    Fraction reduced = mm.reduce(f);
    assertEquals(new Integer(1),reduced.getNumerator());
    assertEquals(new Integer(1),reduced.getDenumerator());

    f = new Fraction(10,6);
    mm = new MyMath();
    reduced = mm.reduce(f);
    assertEquals(new Integer(5),reduced.getNumerator());
    assertEquals(new Integer(3),reduced.getDenumerator());

    f = new Fraction(10,5);
    mm = new MyMath();
    reduced = mm.reduce(f);
    assertEquals(new Integer(2),reduced.getNumerator());
    assertEquals(new Integer(1),reduced.getDenumerator());

    f = new Fraction(10,5);
    mm = new MyMath();
    Double aDouble = mm.toDouble(f);
    assertEquals(new Double(2),aDouble);

    f = new Fraction(10,4);
    mm = new MyMath();
    aDouble = mm.toDouble(f);
    assertEquals(new Double(2.5d),aDouble);
}   
```

---

One last smell is the repeated instatiation logic in each test method. We can use @BeforeEach to solve that.

---

Since solution for all three smells is connected, test logic will be refactored together.