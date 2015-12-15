

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class RadarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RadarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class RadarTest
     */
    public RadarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }
    
    @Test
    public void testRadar()
    {
        Radar radar = new Radar(5,5);
        radar.setMonsterLocation(0,0);
        radar.setNoiseFraction(0.05);
        for(int i = 0; i<100;i++)
        {
            radar.scan();
        }
        int highestNumber = 0;
        int highestRow = 0;
        int highestCol = 0;
        for( int i = 0; i< 5; i++)
        {
            for(int j = 0; j< 5; j++)
            {
              int currentNumber= radar.getAccumulatedDetection(i,j);
              if(currentNumber > highestNumber)
              {
                  //this is where the monster is
                   highestRow = i;
                   highestCol = j;
                }
            }
        }
        System.out.print("Row of monster:"+ highestRow);
        System.out.print("Column of monster:"+highestCol);
    }
}
