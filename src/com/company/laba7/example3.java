package com.company.laba7;

public class example3 {
    public static void main(String[] args) {
        ThirdSuperClass Super = new ThirdSuperClass(89);
        String coco = Super.toString();
        System.out.println(coco);

        ThirdSubClass Sub = new ThirdSubClass(67, 'R');
        String coco2 = Sub.toString();
        System.out.println(coco2);

        ThirdSubSubClass SubSub = new ThirdSubSubClass(45, 'T', "ohh my godness!");
        String coco3 = Sub.toString();
        System.out.println(coco3);
    }
}
