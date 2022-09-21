
package ti827manipulastrings;


class ExerciciosStrings {
    static String s,s1;
    static int leStrings(String texto){
       System.out.println(texto);
       s = TI827ManipulaStrings.ler.next();
       s1 = TI827ManipulaStrings.ler.nextLine();
       s=s+s1;
        return s.length();
    }
       static int contaCaracteres() {
       leStrings("Insira um texto");
           return s.length();
    }

    static void arvoreCharAt() {
        int x,y;
        leStrings("Insira uma palavra");
        for (x=0;x<s.length();x++){
            for(y=0;y<=x;y++){
              System.out.print(s.charAt(y));  
            }
        System.out.println();
    }
    for (x=s.length()-1;x>=0;x--){
            for(y=0;y<x;y++){
              System.out.print(s.charAt(y)); 
            }
        System.out.println();
    }
    }

    static void capitalizaLetras() {     
        leStrings ("Insira um texto em letra Maiúsucula");
        System.out.println(s.toLowerCase());
        leStrings ("Insira um texto em letra Minúscula");
        System.out.println(s.toUpperCase());
        
    }
}



