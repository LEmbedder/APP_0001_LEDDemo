


package com.example.lijun.hardlibrary;
//test
public class HardControl {
    public static native int ioctrl(int which, int status);
    public static native int open();
    public static native void close();

    static {
        try {
            System.loadLibrary("hardcontrol");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}







