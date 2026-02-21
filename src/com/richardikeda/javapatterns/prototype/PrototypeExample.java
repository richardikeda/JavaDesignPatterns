package com.richardikeda.javapatterns.prototype;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe de exemplo para demonstrar o padrão Prototype.
 */
public class PrototypeExample {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        rectangle.color = "blue";
        shapes.add(rectangle);

        cloneAndCompare(shapes, shapesCopy);
    }

    private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
        System.out.println("--- Exemplo Prototype ---");
        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes são objetos diferentes (OK!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": E eles são idênticos em conteúdo (OK!)");
                    System.out.println("   Original: " + shapes.get(i));
                    System.out.println("   Cópia:    " + shapesCopy.get(i));
                } else {
                    System.out.println(i + ": Mas eles não são idênticos (ERRO!)");
                }
            } else {
                System.out.println(i + ": Objetos são a mesma referência (ERRO!)");
            }
            System.out.println("--------------------------------------------------");
        }
    }
}
