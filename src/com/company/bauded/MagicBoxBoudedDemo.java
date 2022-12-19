package com.company.bauded;

public class MagicBoxBoudedDemo {
    public static void main(String[] args) {
        MagicBoxBounded<Pigeon> magicBoxBounded = new MagicBoxBounded<>();
        magicBoxBounded.setObject(new Pigeon());
        System.out.println(magicBoxBounded.getObject());

    }
}

class MagicBoxBounded<T extends Bird> {
    private T object;

    public void setObject(T object) {
        this.object = object;
    }

    public T getObject() {
        return object;
    }
}
