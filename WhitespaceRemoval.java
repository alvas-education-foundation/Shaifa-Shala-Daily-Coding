/*Write a Java Program to remove all white spaces from a string without using replace()*/
public class Main {  
    public static void main(String[] args) {  
        String str = "My  Name is  Shaifa Shala  ";  
        char[] strArray = str.toCharArray();  
        StringBuffer stringBuffer = new StringBuffer();  
        for (int i = 0; i < strArray.length; i++) {  
            if ((strArray[i] != ' ') && (strArray[i] != '\t')) {  
                stringBuffer.append(strArray[i]);  
            }  
        }  
        String noSpaceStr2 = stringBuffer.toString();  
        System.out.println(noSpaceStr2);  
    }  
}  