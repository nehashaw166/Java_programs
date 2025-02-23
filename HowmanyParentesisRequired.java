

public class HowmanyParentesisRequired {
    public static int MinParenthesisRequired(String s1){
        char[] s2= s1.toCharArray();
        int count= 0;
        int index=0;
        int lastindex=s2.length-1;
        for(int i=0; i<lastindex;){
            if(s2[index++]==s2[lastindex--]){
                count+=1;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String s = "((((()))))";
        System.out.println(MinParenthesisRequired(s));

    }
}
