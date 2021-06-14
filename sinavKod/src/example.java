import java.lang.reflect.Array;
import java.util.ArrayList;

public class example {


    public static ArrayList arrayList=new ArrayList();
    public static void main(String[] args) {

        String input = "aaaabbb ccc ddd  a";
        String word=input.replace(" ","");
        int count = 1;

        char last = word.charAt(0);


        for(int i = 1; i < word.length(); i++){
            if(word.charAt(i) == last){
                count++;
            }
                else{
                if(count > 1){
                    arrayList.add(""+last+count);
                }else{
                    arrayList.add(last+"1");
                }
                count = 1;
                last = word.charAt(i);
            }
        }
        if(count > 1){
            arrayList.add(""+last+count);
        }else{
            arrayList.add(last+"1");
        }
        System.out.println(arrayList);

    }
    public Object word(){
        return arrayList;

    }
}
