
//Reverse each word using split
public class Rev {
 
      public static void main(String[] args) {
 
          String str = " sas ran jan moh anty";
          
           //Create an array of words
           //[Java,Programming]
          String[] words = str.split(" ");
          String revString = "";
          
          for(int i = 0; i < words.length; i++) {
              String word = words[i];
              String revWord = "";
 
              for(int j = word.length() - 1; j >= 0; j--) {
                   revWord = revWord + word.charAt(j);
              }
              
              revString = revString + revWord + " "; 
   }
 
          System.out.println(revString);
     }
}