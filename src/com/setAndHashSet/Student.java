package com.setAndHashSet;

public class Student {
    private String name;
    private int Id;

    public Student(String name, int id) {
        this.name = name;
        this.Id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null){
            return false;
        }else if(!(obj instanceof Student)){
            return false;
        }else if(obj == this){
            return true;
        }
        return this.getId() == ((Student)obj).getId();
    }

    @Override
    public int hashCode() {
        return Id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return Id;
    }
}
