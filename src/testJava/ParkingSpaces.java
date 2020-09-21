package testJava;

import java.io.*;
import java.util.*;

public class ParkingSpaces {
	static int minParkingSpaces(int[][] parkingStartEndTimes) {

		int parkingCount = 0;
		List<List<Integer>> parkingSlot = new ArrayList<>();

		boolean flag = false;
		for (int[] each : parkingStartEndTimes) {

			int entryTime = each[0];
			int exitTime = each[1];

			if (parkingSlot.size() <= 0) {
				System.out.println("create first slot " + entryTime + "  " + exitTime);
				List<Integer> e = new ArrayList<>();
				e.add(entryTime);
				e.add(exitTime);
				parkingSlot.add(e);

				parkingCount++;
			} else {

				System.out.println("else ");
				for (List<Integer> list : parkingSlot) {
					int existingSlotStart = list.get(0);
					int existingSlotEnd = list.get(0);

					System.out.println("Existing slot : " + existingSlotStart + " " + existingSlotEnd);
					if (entryTime > existingSlotEnd && entryTime < existingSlotEnd) {
						flag = true;
						break;
					}

				} // for
				if (flag) {
					List<Integer> e = new ArrayList<>();
					e.add(entryTime);
					e.add(exitTime);
					parkingSlot.add(e);

					parkingCount++;
				}
			}
		}

		return parkingCount;
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

/*
 * 4 5,10 0,20 25,40 35,45
 * 
 * 
 */