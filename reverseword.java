public class reverseword {
    public static void main(String[] args) {
        System.out.println("I am a developer");
        String s="I am a developer";
        //System.out.println(s.length());
        System.out.println();
        String[] ar=s.split(" ");
        System.out.println("Reverse String");
        for(int i=ar.length-1;i>=0;i--){
           
            System.out.print(ar[i]+ " ");
        }
    }
}
