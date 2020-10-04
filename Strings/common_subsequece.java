public class common_subsequece{
    int longestSubbsequence(char[] X, char[] Y, int m, int n){
        if(m==0 || n==0){
            return 0;
        }
        if (X[m-1] == Y[n-1])
            return 1 + longestSubbsequence(X, Y, m-1, n-1);
        else
            return max(longestSubbsequence(X, Y, m, n-1), longestSubbsequence(X, Y, m-1, n));
    }
    int max(int a, int b)
    {
        return (a > b)? a : b;
    }
    public static void main(String[] args){
        common_subsequece lcs=new common_subsequece();
    String s1 = "abcd";
    String s2 = "cdef";

    char[] X=s1.toCharArray();
    char[] Y=s2.toCharArray();
    int m = X.length;
    int n = Y.length;
    int resut=lcs.longestSubbsequence(X,Y,m,n);
    System.out.println(resut);
    }
}