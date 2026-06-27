public class NumEntry
{

      private int value, frequency;
      
      public NumEntry(int value)
      {
         this.value = value;
         frequency = 1;
      }
      
      public void recordCopy()
      {
         frequency++;
      }
      
      public int getValue()
      {
         return value;
      }
      
      public int getFrequency()
      {
         return frequency;
      }
      
      @Override
      public String toString()
      {
         return "Value: " + value + " : Frequency: " + frequency;
      }

}