class Sparkling{
  public static void main(String[] args){

   String s="abcdefghzxgh";
   int len= s.length();
   for(int i=0; i<len-1; i++){
       for (int j=0; j<len-1; j++){
           if(i!=j && i!=j+1 && i-1!=j && i-1!=j+1 && i>-1 && j>-1){
               if(s.charAt(j)==s.charAt(i) && s.charAt(j+1)==s.charAt(i+1)){
                   System.out.println("Beta spakrling hai");
                   System.out.println(j);
                   System.out.println(i);
               }
           }
       }
   }
  }

    }
