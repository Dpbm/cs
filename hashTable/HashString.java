public class HashString{
    public static void main(String[] args){
        int hash = 0;
        int R = 29;
        String s = args[0]; 
        int M = 97;


        for (int i = 0; i < s.length(); i++)
            hash = (R * hash + s.charAt(i)) % M;

        System.out.println(hash);
        
    }
}