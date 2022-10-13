// Runtime: 1 ms, faster than 67.50% of Java online submissions for Defanging an IP Address.
//Memory Usage: 41.9 MB, less than 62.49% of Java online submissions for Defanging an IP Address.
//Next challenges:

package strings;

public class IPAddressStringQ {
    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));

    }
    static String defangIPaddr(String address) {
        StringBuffer stringb=new StringBuffer();
        int n = address.length();
        int k=0;
        int i=0;
        while(i<n){
            String ch =".";
            if(address.charAt(i)=='.'){
                stringb.insert(k,"[.]");
                k+=3;
                i++;
            }
            else {
                stringb.insert(k,address.charAt(i));
                k++;
                i++;
            }

        }
        return stringb.toString();


    }
}
