package q_8_Sttring;

public class String_Demo {
    public static void main(String[] args){  
        StringBuffer buffer=new StringBuffer("hello ");  
        buffer.append("string buffer");  
        System.out.println(buffer);
        StringBuilder builder = new StringBuilder("hello ");
        builder.append(" string builder");
        System.out.println(builder);
    }  
} 