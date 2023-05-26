public class repeatchar {
    public static void main(String[] args) {
        
        String word="inmakeslearnhub";
        int count=0;
        char[] ch=word.toCharArray();
        
        for(int i=0;i<ch.length;i++){
            for(int j=i+1;j<ch.length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("Duplicate char: "+ch[j]);
                    count++;
                }
            }

        }
        System.out.println("Duplicate count: "+count);
}
}
