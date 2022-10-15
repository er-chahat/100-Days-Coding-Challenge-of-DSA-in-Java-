//You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G",
// "()" and/or "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o",
// and "(al)" as the string "al". The interpreted strings are then concatenated in the original order.
//
//Given the string command, return the Goal Parser's interpretation of command

package strings;

public class GoalParser {
    public static void main(String[] args) {
        String goal ="G()()()()(al)G";
        System.out.println(interpret(goal));
    }

    static String interpret(String command) {
        StringBuffer stringb=new StringBuffer();
//        String s="()";
//        String p ="(a";
        int k=0;
        for(int i=0;i!=command.length();){

                if (command.charAt(i) == '(' && command.charAt(i + 1) == ')') {
                    stringb.insert(k, "o");
                    k++;
                    i += 2;
                }
               else if (command.charAt(i) == '(' && command.charAt(i + 1) == 'a') {
                    stringb.insert(k, "al");
                    k += 2;
                    i += 4;
                }

          else if(command.charAt(i)=='G'){
                stringb.insert(k,"G");
                k++;
                i++;
            }
        }
        return stringb.toString();
    }
}
