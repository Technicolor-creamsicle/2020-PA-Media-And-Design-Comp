
//---WATER SAMPLE CLASS DOCUMENTATION
/*WaterSample class uses:
  *Create a new sample object
  *hold its own unique ID
  *be a part of the static array that lists all of the WaterSample objects
  *Analyze water to an extent
  *@constructor (String name)
  *@constructor (String name, pH)
  *@constructor (String name, pH, ppm)
  *@consturctor (String name, pH, ppm, String color)
  *@constructor (String name, pH, ppm, String color, String location) << MAIN (this()) LOCATION
 */

/**
 * @author Ian Timchak
 * @version 1.0
 * @since 2-04-2019
 */ 
public class WaterSample
{
  private static final String[] colorlist = {"Brown", "Yellow", "Orange", "Cloudy", "Clear"};
  
  private String location;
  private String sampleName;
  private String color;
  private double phLevel;
  private double hardness;
  
  //Unique ID
  private static int numID = 0;
  
  private int uID;

/**
   * Default constructor
   */
  public WaterSample(){
    this("None", 7, 100, "Clear", "None");
  }//constructer WaterSample(this)
  
/**
   * A supplementary constructor to avoid errors
   * @param name Creating a name for the WaterSample being created
   */
  public WaterSample(String name){
    this(name, 7, 100, "Clear", "None");
  }//constructor WaterSample(S)
  
/**
   * A supplementary constructor to avoid errors
   * @param name Creating a name for the WaterSample being created
   * @param ph Recording the ph level of the WaterSample being created
   */    
  public WaterSample(String name, double ph){
    this(name, ph, 100, "Clear", "None");
  }//constructor WaterSample(S, D)
  
/**
   * A supplementary constructor to avoid errors
   * @param name Creating a name for the WaterSample being created
   * @param ph Recording the ph level of the WaterSample being created
   * @param ppm Recording the hardness level of the WaterSample being created
   */  
  public WaterSample(String name, double ph, double ppm){
    this(name, ph, ppm, "Clear", "None");
  }//constructor WaterSample(S, D, D)
  
/**
   * A supplementary constructor to avoid errors
   * @param name Creating a name for the WaterSample being created
   * @param ph Recording the ph level of the WaterSample being created
   * @param ppm Recording the hardness level of the WaterSample being created
   * @param col Recording the "color" of the WaterSample being created
   */
  public WaterSample(String name, double ph, double ppm, String color){
    this(name, ph, ppm, color, "None");
  }//constructor WaterSample(S, D, D, S)
  
  /**
   * This is the largest constructor which holds all relevant data needed in sample analysis
   * @param name Creating a name for the WaterSample being created
   * @param ph Recording the ph level of the WaterSample being created
   * @param ppm Recording the hardness level of the WaterSample being created
   * @param col Recording the "color" of the WaterSample being created
   * @param loc Recording the location of where the WaterSample being created was collected
   */
  public WaterSample(String name, double ph, double ppm, String col, String loc){
    uID = numID;
    numID++;
  }//constructor WaterSample(S, D, D, S, S)
}
