import java.util.*;

public class WaterData{
    private ArrayList <String> indices = new ArrayList <String> (0); //marks the indices of each sample tested
    private ArrayList ph = new ArrayList(0); //recording pH levels of water sample
    private ArrayList ppm = new ArrayList(0); //records ppm of water sample
    
    private int mInd = -1;//used for validating index calls
    
    public WaterData(){
    }//constructor @WaterData
    
    public void add(String sName, double p, double parts){//method used for adding new samples to the arrays
        mInd = indices.size();
        indices.add(indices.size() + ". " + sName); //creates a value in indices to connect the information of each arraylist
        ph.add(p);
        ppm.add(parts);
    }//method @add
    
    public String sample(){//select a specific sample
      Scanner sc = new Scanner(System.in);
      
        System.out.println("Enter an index to search:");
        int in = sc.nextInt();
        if(in > mInd || in < 0)
            return "ERROR: No sample data found";
        else{
            return indices.get(in) + "\n\t" + "pH level: " + ph.get(in) + "\n\tppm level: " + ppm.get(in);
        }
    }//method @sample
    
    public String remove(int ind){//remove an index from the sample array
      int size = indices.size() - 1;
      System.out.println(indices.get(ind) + " Has been removed.");
      
      indices.remove(ind);
      
    }
    
    public String toString(){//returns the list of samples when the class is called
      String a = "";
      for(String b: indices){
        a += b + "; ";
      }
      return a;
    }//method @toString
}
