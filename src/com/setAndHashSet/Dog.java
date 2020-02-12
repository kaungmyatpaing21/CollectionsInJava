package com.setAndHashSet;

public class Dog {
    private String name;

    public Dog(String name){
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if(obj instanceof Dog){
            return this.name.equals(((Dog)obj).getName());
        }
        return false;
    }

    public String getName() {
        return name;
    }
}
