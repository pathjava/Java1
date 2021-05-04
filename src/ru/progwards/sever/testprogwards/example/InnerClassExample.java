package ru.progwards.sever.testprogwards.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/**
 * @author Oleg Kiselev
 */
public class InnerClassExample {

    private String name = "name";

    private static final Integer age = 15;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int printAge(int age){
        return age;
    }

    private static class NestedClass {
        private static final String nameTwo = "name two";

        String name = new InnerClassExample().getName();

        Integer integer = age;

        List<String> list = new ArrayList<>(List.of(name, nameTwo));
    }

    public class InnerClass{

        String nameOne = new InnerClassExample().getName();

        String nameTwo = InnerClassExample.this.getName();

        String str = InnerClassExample.this.name;

        Integer age = InnerClassExample.this.printAge(15);

        public void printInnerAge(){
            assert age != null;
            System.out.println(age);
        }

        private void printName(String name){
            System.out.println(name);
        }

        StringBuffer stringBuffer = new StringBuffer("111");
        StringBuilder stringBuilder = new StringBuilder("222");

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InnerClassExample that = (InnerClassExample) o;
        return Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    public static void removeElement(){
        List<String> list = new ArrayList<>(List.of("111", "222", "333", "444", "555"));

        list.forEach(System.out::println);

        int count = 0;
        for (Iterator<String> iterator = list.iterator(); iterator.hasNext(); ) {
            String s = iterator.next();
            if (count == 2)
                iterator.remove();
            count++;
        }

        list.forEach(System.out::println);
    }

    public static void main(String[] args) {

//        ExampleInnerClass exampleInnerClass = new ExampleInnerClass();
//
//        ExampleInnerClass.InnerClass innerClass = exampleInnerClass.new InnerClass();
//
//        innerClass.printName("Ivan");
//
//        innerClass.printInnerAge();

        removeElement();

    }

}
