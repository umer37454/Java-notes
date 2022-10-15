package notes;

public class practice2 {
    public static void main(String[] args) {
        //problem1
        //String name = "ANSARI UMER";
        //String mname = name.toLowerCase(Locale.ROOT);
        //System.out.println(mname);

        //problem2
        //String text = "to lower case";
        //text = text.replace(" ","o");
        //System.out.println(text);

        //problem3
        //String letter = "dear <|name|>, thanks a lot!";
        //letter = letter.replace("<|name|>", "umer");
       // letter = letter.replaceAll("\\bdear\\b", "respected");
       // System.out.println(letter);

        //problem4
        String myString = "this is double space  and triple space  ";

        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));

    }
}
