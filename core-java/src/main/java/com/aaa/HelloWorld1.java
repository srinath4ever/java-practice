package com.aaa;

public class HelloWorld1 {

    static int []x, y;
    public static void main(String[] args) {

        /*StringBuffer sb = new StringBuffer("a");
        sb.append("test");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        int i = 100, j= 200;
        while (++i < --j);
        System.out.println(i);
         */
        x = new int[10];
        x = y;
        System.out.println(x);

        /*int []a[], b;
        a = new int[5][];
        b = new int[2];
        System.out.println(a[0].length);*/
/*
        boolean b1 = true;
        if(b1=true && true){
            System.out.println("inside");
        }

        boolean b12 = false;
        boolean b13 = false;

        if(b12 != b13 == !b12){
            System.out.println("hi");
        } else{
            System.out.println("hey");
        }

        long abc = 100001234;*/

        byte[] bytes = intToBytes(3000);
        for (Byte b : bytes) {
            System.out.println(b);
        }


    }

    public static byte[] bytes(int... ints) {
        byte[] bytes = new byte[ints.length];
        for (int i = 0; i < bytes.length; ++i) {
            bytes[i] = (byte) ints[i];
        }
        return bytes;
    }

    public static byte[] intToBytes(final int data) {
        return new byte[] {
                (byte)((data >> 24) & 0xff),
                (byte)((data >> 16) & 0xff),
                (byte)((data >> 8) & 0xff),
                (byte)((data >> 0) & 0xff),
        };
    }

}
