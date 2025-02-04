public class gas_station {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int n = gas.length;
        int totalGas = 0, totalCost = 0;
        for (int i = 0; i < n; i++){
            totalGas += gas[i];
            totalCost += cost[i];
        }
        if (totalGas < totalCost){
            return -1;
        }
        int currentSum = 0, start = 0;
        for (int i = 0; i < n; i++){
            currentSum += gas[i] - cost[i];
            if (currentSum < 0){
                currentSum = 0;
                start = i+1;
            }
        }
        return start;
    }
} 
