package ai_pract;

import java.util.Arrays;

public class JobScheduling {
	
	public static int minValue(int x, int y) {
		return(x<y) ?x:y;
	}

	public static void main(String[] args) {
				
		Jobs[] jobs = {
				new Jobs("j1", 2, 100),
				new Jobs("j2", 1, 10),
				new Jobs("j3", 2, 15),
				new Jobs("j4", 1, 27)
		};
		int n = jobs.length;
		
		for(int i=0;i<n-1;i++) {
			for(int j=0;j<n-i-1;j++) {
				if(jobs[j].profit < jobs[j+1].profit) {
					Jobs temp = jobs[j];
					jobs[j] = jobs[j+1];
					jobs[j+1] = temp;
				}
			}
		}
		
		System.out.println("Jobs\t Deadline\t Profit ");
		for(int i=0;i<n;i++) {
			System.out.println(jobs[i].id + "\t" + jobs[i].deadline + "\t\t" + jobs[i].profit);
		}
		jobSequencing(jobs, n);
	}

	public static void jobSequencing(Jobs[] jobs, int n) {
		int dmax = 0;
		for(int i=0;i<n;i++) {
			if(jobs[i].deadline >dmax) {
				dmax = jobs[i].deadline;
			}
		}
		
		int[] timeslot = new int[dmax+1];
		Arrays.fill(timeslot, -1);
		
		int filledTimeSlot = 0;
		int maxProfit = 0;
		
		for(int i=0;i<n;i++) {
			int k = minValue(dmax, jobs[i].deadline);
			while(k>=1) {
				if(timeslot[k] == -1) {
					timeslot[k] = i;
					filledTimeSlot++;
					break;
				}
				k--;
			}
			if(filledTimeSlot == dmax) {
				break;
			}
		}
		
		for(int i=1;i<=dmax;i++) {
			if(timeslot[i] != -1) {
				maxProfit += jobs[timeslot[i]].profit;
			}		
		}
		System.out.println("Max Profit:" + maxProfit);
	}
	
	

}
