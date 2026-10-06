class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
           Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);
           int box_unit=0;
           int totalunit=0;
           for(int i=0;i<boxTypes.length;i++){
              int boxes=boxTypes[i][0];
              int units=boxTypes[i][1];
              if(boxes<=truckSize){
                totalunit+=boxes*units;
                truckSize-=boxes;
              }
              else{
                totalunit+=truckSize*units;
                break;
              }
           }
            return totalunit;
    }
}