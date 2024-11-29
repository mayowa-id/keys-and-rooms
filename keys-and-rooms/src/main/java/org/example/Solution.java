package org.example;

import java.util.List;

class Solution {
    boolean [] visitedRooms;
    List<List<Integer>> rooms;
    public boolean canVisitRooms(List<List<Integer>> rooms) {
        visitedRooms = new boolean[rooms.size()];
        canVisitRooms(0, rooms, visitedRooms);
        return allVisited();
    }

   private void canVisitRooms(int roomIndex, List<List<Integer>> rooms, boolean [] visitedRooms){
        //Essentially the roomIndex stored int the int variable is the
       //room key

        visitedRooms[roomIndex] = true;
       for (int room : rooms.get(roomIndex))
            if (!visitedRooms[room])
                canVisitRooms(room, rooms, visitedRooms);
    }
//So the idea of the method above is to check the rooms in the linked list individually
// if the current key or index matches the room, it opens it, if not it checks the list of rooms again
// for the room that matches the key

    private boolean allVisited(){
        for (int i = 0; i < visitedRooms.length ; i++){
            if (!visitedRooms[i])
                return false;
        }
        return true;
}
}