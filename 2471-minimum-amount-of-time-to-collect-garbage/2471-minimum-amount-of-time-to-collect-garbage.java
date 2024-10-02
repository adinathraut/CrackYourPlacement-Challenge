class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        int  totalTimeToPick = 0, sz = garbage.length;
        Map<Character, Integer> lastHouseToVisit = new HashMap<>();
        int travelTime[] = new int[sz-1];
        for(int indx = 0; indx < sz-1; indx++){
           if(indx > 0) 
            travelTime[indx] = travelTime[indx - 1] + travel[indx];
           else 
            travelTime[indx] = travel[indx]; 
        } 
        for(int indx = 0; indx < sz; indx++){
            int totalGrabUnits = garbage[indx].length();
            totalTimeToPick += totalGrabUnits;
            for(var grab : garbage[indx].toCharArray())lastHouseToVisit.put(grab, indx);
        }
        for(var pr : lastHouseToVisit.entrySet()){
            int lastHouse = pr.getValue();
            if(lastHouse != 0)
             totalTimeToPick += travelTime[lastHouse - 1];
        }
        return totalTimeToPick;
    }
}