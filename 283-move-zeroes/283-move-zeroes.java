class Solution {
    public void moveZeroes(int[] array) {
        int size = array.length;
    
    
    for (int i = 0; i < size - 1; i++)
    
    
      for (int j = 0; j < size - i - 1; j++)

    
        if (array[j] == 0) {

    
          int temp = array[j];
          array[j] = array[j + 1];
          array[j + 1] = temp;
        }
  }
    }
