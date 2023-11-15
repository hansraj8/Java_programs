public class InbuiltFnStrings {

    public static void filterFiles(){
        String[] filenames = {"ing1.jpg","img2.png","img3.pdf","img4.pdf"};
        for(String f: filenames){
            if(f.endsWith(".pdf")){
                System.out.println("pdf is availbale"+f);
            }
        }
    }
    public static void Inbuiltfns(){

          String s = "Hi my name is hansraj";
        System.out.println(s.length());
        System.out.println(s.toUpperCase());
        System.out.println(s);
        s = s.toLowerCase();
        System.out.println(s);

        String state = "I love mango shake";
        System.out.println(state.length());
        System.out.println(state.strip());
        System.out.println(state);
        state = state.replace("mango", "apple");
        System.out.println(state);
    }
    public static void printOcc(){
        String doc = "this is a very large document of the java ,prsent in this file java can handle large number large";
        String word = "large";
        int idx = doc.indexOf(word);
        while(idx!=-1){
            System.out.println(idx);
            idx = doc.indexOf(word, idx+1);
            
        }
    }
    public static void main(String[] args) {
      
         ///filterFiles();
         printOcc();
    }
}
