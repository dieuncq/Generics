import java.util.ArrayList;

public class Generics {
    Integer i_Number;
    String s_String;
}

class Generics_Exercise {
    public static void Exercise() {
        //Add value foreach elements in ArrayList
        ArrayList<Integer> arl_i_Number = new ArrayList<Integer>();
        for (int x = 0; x < 10; x++) {
            arl_i_Number.add(x);
        }

        ArrayList<String> arl_s_String = new ArrayList<String>();
        for (int x = 0; x < 10; x++) {
            arl_s_String.add("String " + x);
        }

        ArrayList<Boolean> arl_b_TrueFales=new ArrayList<Boolean>();
        for (int x = 0; x < 10; x++) {
            arl_b_TrueFales.add(x % 2 == 0);
        }

        //Print out all elements foreach ArrayList to console.log
        Integer i_Index = 0;
        System.out.println("List of arl_i_Number:");
        for (Integer x : arl_i_Number) {
            System.out.println("arl_i_Number[" + i_Index + "]=" + x);
            i_Index++;
        }

        i_Index = 0;
        System.out.println("\nList of arl_s_String: ");
        for (String x : arl_s_String) {
            System.out.println("arl_s_String[" + i_Index + "]=" + "\"" + x + "\"");
            i_Index++;
        }

        i_Index = 0;
        System.out.println("\nList of arl_b_TrueFalse: ");
        for (Boolean x : arl_b_TrueFales) {
            System.out.println("arl_b_TrueFalse[" + i_Index + "]=" + x);
            i_Index++;
        }
    }
}