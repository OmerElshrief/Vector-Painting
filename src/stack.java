import java.util.List;
import java.util.ArrayList;
public class stack 

{
     int k = 0;

    private List<Shapes> stack;
    

    public stack(int SIZE) 
    {
        stack = new ArrayList<Shapes>();
    }

    

    public void push(Shapes i) 
    {

       stack.add(i);
       k++;
     }

     public Shapes pop() 
     { 
        if(k!=0){
           Shapes i= stack.get(k-1);
          k--;
           return i;
        } else{
           return null;// Or any invalid value
        }
     }

     public Shapes peek()
     { 
        if(!stack.isEmpty()){
           return stack.get(k-1);
        } else{
           return null;// Or any invalid value
        }
     }


     public boolean isEmpty() 
     {
      return stack.isEmpty();
     }

 }