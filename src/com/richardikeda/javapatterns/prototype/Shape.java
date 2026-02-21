package com.richardikeda.javapatterns.prototype;

import java.util.Objects;

/**
 * Classe abstrata Prototype.
 * Implementa a interface Cloneable do Java e define o método clone().
 */
public abstract class Shape implements Cloneable {
    public int x;
    public int y;
    public String color;

    public Shape() {
    }

    /**
     * O construtor do protótipo recebe um objeto da mesma classe
     * e copia seus dados para o novo objeto.
     */
    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    /**
     * Método abstrato clone que deve ser implementado pelas subclasses.
     */
    @Override
    public abstract Shape clone();

    @Override
    public boolean equals(Object object2) {
        if (!(object2 instanceof Shape)) return false;
        Shape shape2 = (Shape) object2;
        return shape2.x == x && shape2.y == y && Objects.equals(shape2.color, color);
    }
}
