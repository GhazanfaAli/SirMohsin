public class Main {
    public static void main(String[] args) {
        /*
       /////////   String

        .length()
        .tolowercase()
        .toUppercase()
        .equals
        .compareTO
        .contains()
        .substring
        .indexof(String)
        .charAt(int);


/////////// string builder and buffer

        .append()
        .delete(int , int)
        .reverse()
        .charAt(int)
        .insert(3, '4')
        .capacity()
         */
        String a = "muet university";
        String b = "Indus college";



        System.out.println(a.length());
        System.out.println(a.toLowerCase());
        System.out.println(a.toUpperCase());
        System.out.println(a.equals(b));

        System.out.println(b.compareTo(a));

        System.out.println(a.contains("z"));
        System.out.println(a.concat(" and college"));

        System.out.println(a.substring(2, 7));

        System.out.println(a+".........");

        int index = a.indexOf("un"); // index will be 7
        System.out.println(index);

        System.out.println(a.charAt(9));

        StringBuilder str = new StringBuilder("hello world");

//        System.out.println(str.append("k"));
//        System.out.println(str.delete(2, 4));
//        System.out.println(str.reverse());

//        str.setCharAt(0, 'm');
//        System.out.println(str); // Output: "hi beautifulo world"


        StringBuffer str2 = new StringBuffer("computer is Machine");
        StringBuffer str3 = new StringBuffer("computer is Machine");
//        System.out.println(str3 == str2);
//        System.out.println(str3.equals(str2));
//        System.out.println(str2.compareTo(str3));
//        System.out.println(str2.charAt(3));
//        System.out.println(str3.reverse());
        System.out.println(str3.insert(3,"a."));



        StringBuffer sb=new StringBuffer("Hello");
        sb.replace(1,3,"Java");
        System.out.println(sb);//prints HJavalo



        StringBuffer sb2=new StringBuffer();
        System.out.println(sb2.capacity());//default 16

        sb2.append("Hello");

        System.out.println(sb2.capacity());//now 16

        sb2.append("java is my favourite language");
        System.out.println(sb2.capacity());//now (16*2)+2=34 i.e (oldcapacity*2)+2
        sb2.append(" computer");
        System.out.println(sb2.capacity());//now (34*2)+2=70 i.e (oldcapacity*2)+2


        System.out.println(a);








    }




/*
stringbulder
.nano
.append
 string random = generateRandomsStrnig(min len, max len)


joiner wraper classes
 */

}

