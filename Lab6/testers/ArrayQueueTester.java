package testers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import implementationQueues.ArrayQueue;
import job.Job;

public class ArrayQueueTester {
	
	public static void main(String[] args) {
		
		ArrayQueue<Job> inputQueue = new ArrayQueue<Job>();
		ArrayQueue<Job> processingQueue = new ArrayQueue<Job>();
		ArrayQueue<Job> terminatedJobs = new ArrayQueue<Job>();
		
		String directory = "Lab6";
		String fileName = "input.txt"; 
		
		File inputfile = new File(directory, fileName);
		BufferedReader dataReader = null;
        String dataline;
        int arrTime = 0;
        int runTime =0;
        int pid = 1;
        
        try {

            dataReader = new BufferedReader(new FileReader(inputfile));
            while ((dataline = dataReader.readLine()) != null) {

                String[] data =dataline.split(",");             
              
               arrTime = Integer.parseInt(data[0]);
               runTime = Integer.parseInt(data[1].substring(data[1].length()-1));
               Job element = new Job(pid,arrTime,runTime); 
              inputQueue.enqueue(element);  
              pid++;
            }
        }catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (dataReader != null) {
                try {
                    dataReader.close();
                } catch (IOException e) {
                    e.printStackTrace();}
            }
        }
    
        //time input
        int time = 0;
      				
		while(! processingQueue.isEmpty() || ! inputQueue.isEmpty()) 	{
			if(!processingQueue.isEmpty()) {
				Job job = processingQueue.first();
				job.isServed(1);
				
				if( job.getRemainingTime() == 0){	
					job.setDepartureTime(time);
					terminatedJobs.enqueue(processingQueue.dequeue()); 
				}
				else {
					processingQueue.enqueue(processingQueue.dequeue());
				}
			}
				
			if(!inputQueue.isEmpty()) {
				Job job1 = inputQueue.first();
				if(job1.getArrivalTime()==time)
					processingQueue.enqueue(inputQueue.dequeue());
			}
			
			time++;
		}
			
		//Calculates time in system
		float totalTime = 0;
		float arrVal = 0;
		float depVal = 0;
		float count = 0;
		
		
		while(!(terminatedJobs.isEmpty())) {
			arrVal = terminatedJobs.first().getArrivalTime();
			depVal = terminatedJobs.first().getDepartureTime();
		
			
			totalTime = (depVal-arrVal) + totalTime;
			count++;
	
			terminatedJobs.dequeue();
		}
		totalTime = totalTime/count;
		
		System.out.print("Averange Time in System is: ");
		System.out.printf("%.2f", totalTime);
		
		
	}
}