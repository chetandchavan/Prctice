
// Java program to convert first character
// uppercase in a sentence
package Selfevaluationlab2;

class Q5 {
 
    static String convert(String a)
    {
 
       
        char ch[] = a.toCharArray();
        for (int i = 0; i <a.length(); i++) {
 
           
            if (i == 0 && ch[i] != ' ' ||
                ch[i] != ' ' && ch[i - 1] == ' ') {
 
               
                if (ch[i] >= 'a' && ch[i] <= 'z') {
 
                    
                    ch[i] = (char)(ch[i] - 'a' + 'A');
                }
            }
 
           
            else if (ch[i] >= 'A' && ch[i] <= 'Z')
 
               
                ch[i] = (char)(ch[i] + 'a' - 'A');           
        }
 
       
        String st = new String(ch);
        return st;
    }
 
    public static void main(String[] args)
    {
        String a = "welcome to java";
        System.out.println(convert(a));
    }
}
