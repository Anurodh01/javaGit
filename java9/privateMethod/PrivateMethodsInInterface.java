package java9;

public interface PrivateMethodsInInterface {
    default int getNumberofCores1(){
        return getCount1();   //so the normal private methods can be used in side default methods
    }
    static int getNumberofCores2(){
        return getCount2(); //static private methods can be used inside the static methods
    }

    //Normal private Methods
    private int getCount1(){
        return 10;
    }

    private static int getCount2(){
        return 2;
    }
}
