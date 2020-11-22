package com.zhaoyihui.al1108.DefangIpaddr;

public class Defangaddr {

    public static void main(String[] args) {

        String address = "1.1.1.1";
        System.out.println(defangaddr2(address));
    }

    public static String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }

    public static String defangaddr2(String address) {
        StringBuilder builder  = new StringBuilder();
        for (int i=0; i<address.length(); i++) {
            if (address.charAt(i) == '.') {
                builder.append("[.]");
                continue;
            }
            builder.append(address.charAt(i));
        }

        return builder.toString();
    }
}
