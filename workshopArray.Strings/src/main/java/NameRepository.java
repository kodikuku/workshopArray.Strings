import java.util.*;
public class NameRepository {

    private static String names[]  = new String[0];
    public static int getSize(){
        return names.length;
    }
    public static void setNames(String[] names){


    }

    public static void clear(){
        names = new String[0];

    }
    public static String[] findAll(){
        return names;
    }

    public static void main(String[] args) {
        System.out.println(getSize());
        String secNames[] = {"Kuku","Kaka"};
        setNames(secNames);

        System.out.println(Arrays.toString(secNames) + Arrays.toString(findAll()));
    }

}





