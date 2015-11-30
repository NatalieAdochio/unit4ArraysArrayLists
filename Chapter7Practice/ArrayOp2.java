
public class ArrayOp2
{
    /** description of instance variable x (add comment for each instance variable) */
    private int[] values;
    public ArrayOp2(int[] initialValues)
    {
        values = initialValues;
    }
    public void swapFirstAndLast()
    {
        int temp = this.values[0];
        this.values[0] = this.values[values.length-1];
        this.values[values.length-1] = temp;
    }
    public void shiftRight()
    {
        for(int i= values.length-2; i>= 0; i--)
        {
            this.values[i] = this.values[i-1];
        }
        this.values[0] = values[values.length-1];
    }
    public void evenChanges()
    {
        // initialise instance variables
        int pos = 0;
        int evenNew = 0;
        while (pos < values.length)
        {
            if (values[pos]%2 == 0)
            {
                this.values[pos] =evenNew;
                pos++;
            }
            else
            {
                pos++;
            }
        }
    }
    public void replace()
    {
        for(int i= values[values.length-2]; i>0 ; i--)
        {
            if(values[i] > values[i+1])
            {
                values[i+1]= values[i];
            }
            else if(values[i] < values[i+1])
            {
                values[i] = values[i+1];
            }
        }
    }
    

}
