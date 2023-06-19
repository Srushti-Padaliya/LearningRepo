import java.util.*;
public class Main {

    public static boolean isoperator(String ope){
        switch (ope) {
            case "+","-", "*", "/":
                return false;
            default:
                return true;
        }
    }
    public static ArrayList<String> stringarray(String ipstr){
        ArrayList<String> stringArray = new ArrayList<>();
        String element = "";
        boolean ib_op = true;
        for (int i = 0; i < ipstr.length(); i++) {

            element = String.valueOf(ipstr.charAt(i));

            ib_op = isoperator(String.valueOf(ipstr.charAt(i)));

            if ((ib_op == true) && i != ipstr.length() - 1 ) {
                do {

                    ib_op = isoperator(String.valueOf(ipstr.charAt(i+1)));

                    if (ib_op == false) {
                        break;
                    }
                    element += String.valueOf(ipstr.charAt(i + 1));
                    i++;
                } while ((ib_op == true) && i < ipstr.length() - 1);
            }
            stringArray.add(element);
        }
        return stringArray;
    }

    public static double evalexpression(String op, double left, double right){
        switch (op) {
            case "+":
                return left + right;
            case "-":
                return left - right;
            case "*":
                return left * right;
            case "/":
                return left / right;
            default :
                return 0;
        }
    }
    public static void main(String[] args) {
        ArrayList <String> stringArray = stringarray("12+4-636*67/2");
        ArrayList <String> calculation = new ArrayList<>();
        boolean is_op = false;
        double answer = 0.0;
        ArrayList <String> operators = new ArrayList<>();
        operators.add("/");
        operators.add("*");
        operators.add("+");
        operators.add("-");
        System.out.println(stringArray);

        for (int j = 0; j< operators.size(); j++) {
            for (int i = 0; i < stringArray.size() - 1; i++) {
                is_op = isoperator(stringArray.get(i));
                String ls_oper = operators.get(j);
                String ls_atrarr = stringArray.get(i);
                if ((is_op == false) && (ls_oper.charAt(0) == ls_atrarr.charAt(0))) {
                    answer = evalexpression(stringArray.get(i), Double.parseDouble(stringArray.get(i - 1)), Double.parseDouble(stringArray.get(i + 1)));
                    stringArray.remove(stringArray.get(i - 1));
                    stringArray.remove(stringArray.get(i));
                    stringArray.remove(stringArray.get(i - 1));

                    stringArray.add(i - 1, String.valueOf(answer));

                }

            }
        }
        System.out.println(stringArray.get(0));

    }
}