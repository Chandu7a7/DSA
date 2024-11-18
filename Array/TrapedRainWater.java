public class TrapedRainWater {
    
    public static int TrapedRainWaterTotal(int height[]){
        int n = height.length;
        // calculate left max boundry - array
        int leftMax[]=new int[n];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        // calculate  right max boundry  - array
        int RighMax[] = new int [n];
        RighMax [ n- 1]=height[n-1];
        for(int i=n-2 ; i >= 0;i--){
           RighMax[i]=Math.max(height[i],RighMax[i+1]);
        }

        int TrapedWater = 0;
        for(int i=0;i<n;i++){
            
          // waterLevel   
        int waterLevel = Math.min(leftMax[i],RighMax[i]);

        // trapped += waterlevel - height[i];

        TrapedWater += waterLevel - height[i];
        }
        return TrapedWater;

    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};

        System.out.println(" Total trapped rainwater is : "+ TrapedRainWaterTotal(height));

    }

}
