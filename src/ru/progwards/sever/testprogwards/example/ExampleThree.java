package ru.progwards.sever.testprogwards.example;

import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * @author Oleg Kiselev
 */
public class ExampleThree {

    public static int sum(int a, int b){
        return a + b;
    }

    public static int mul(int first, int second){
        return first * second;
    }

    public static void main(String[] args) {

//        System.out.println(sum(574155, 457812));
//
//        System.out.println(mul(15, 20));

        Long l = Long.valueOf("9223372036854775807");
        System.out.println(l);
        Long l2 = Long.valueOf("922337203685477580744444");
        System.out.println(l2);
    }

    private Path path;

    public void testFiles() throws IOException {
        Files.walkFileTree(path, new SimpleFileVisitor<>(){
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs) throws IOException {
                return super.preVisitDirectory(dir, attrs);
            }
        });
    }

}
