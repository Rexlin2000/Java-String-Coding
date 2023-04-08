class stringalpha_numeric{
    public static void main(String[] args) {
        String word="75#41*";// 75#41*
        System.out.println("Display only digits: ");
    for(int i=0;i<word.length();i++)
    {
        if(word.charAt(i)>='0')
        if(word.charAt(i)<='9')
        
            System.out.print(word.charAt(i));
            
    }
    System.out.println();
    System.out.println("Using replaceall method: "+word.replaceAll("[/*-+@#]", ""));


    }
}
