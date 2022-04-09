package com.company.laba7;

public class FifthSuperClass {
    private String doc;

    FifthSuperClass(String k){
        doc = k;
    }

    @Override
    public String toString() {
        String nameClass;
        nameClass = "super" + "\n" +
                "Class name: " + this.getClass().getSimpleName() + "\n" +
                "doc = " + this.getDoc();
        return nameClass;
    }

    void setDoc(String k){
        doc = k;
    }
    public java.lang.String getDoc() {
        return doc;
    }
}
