package demo;
import java.io.*;
import java.util.*;

public class TestClass {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {
          Arrays.sort(parkingStartEndTimes, new Comparator<int[]>() { 
            
          @Override              
          public int compare(final int[] entry1,  
                             final int[] entry2) { 
  
            if (entry1[0] > entry2[0]) 
                return 1; 
            else
                return -1; 
          } 
        }); 

		int count=1;
		
		for (int i = 0; i < parkingStartEndTimes.length-1; i++) {
			for (int j = 0; j < i; j++) {
				if(parkingStartEndTimes[i+1][0]<parkingStartEndTimes[j][1]) {
				count++;
			}	
			}
			
		}
		return count;

	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] parkingStartEndTimeList = new int[n][2];
		String[] parkingStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] parkingStartEndTime = parkingStartEndTimes[i].split(",");
			for (int j = 0; j < parkingStartEndTime.length; j++) {
				parkingStartEndTimeList[i][j] = Integer.parseInt(parkingStartEndTime[j]);
			}
		}

		int out = minParkingSpaces(parkingStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}