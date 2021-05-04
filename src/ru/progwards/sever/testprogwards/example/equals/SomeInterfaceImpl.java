package ru.progwards.sever.testprogwards.example.equals;

import java.util.Objects;

/**
 * @author Oleg Kiselev
 */
public class SomeInterfaceImpl implements SomeInterface {

    private String name;
    private int age;
    private String address;
    private double salary;

    @Override
    public void someMethod() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SomeInterfaceImpl that = (SomeInterfaceImpl) o;
        return age == that.age && Double.compare(that.salary, salary) == 0
                && Objects.equals(name, that.name) && Objects.equals(address, that.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, address, salary);
    }
}
