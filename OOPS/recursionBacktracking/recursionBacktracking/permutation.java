package recursionBacktracking;

public class permutation {
    public static void main(String[] args) {
        perm("", "abc");
        
    }
    static void perm(String p, String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }

        char ch = up.charAt(0);

        for(int i=0;i<=p.length();i++){
            String s = p.substring(0,i);
            String e = p.substring(i, p.length());

            perm(s+ch+e, up.substring(1));
        }
    }
}
