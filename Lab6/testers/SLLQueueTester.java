package testers;

import java.io.File;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import implementationQueues.ArrayQueue;
import implementationQueues.SLLQueue;
import job.DataSet;

public class SLLQueueTester {

	public static void main(String [] args) throws FileNotFoundException {
		
		SLLQueue<DataSet> inputQueue = new SLLQueue<DataSet>();
		SLLQueue<DataSet> processingQueue = new SLLQueue<DataSet>();
		ArrayQueue<DataSet> terminatedJobs = new ArrayQueue<DataSet>();
		
		String directory = "Lab6";
		String fileName = "input.txt"; 
		
		File inputfile = new File(directory, fileName);
		BufferedReader dataReader = null;
        String dataline;
        int arrTime = 0;
        int serTime =0;
        try {

            dataReader = new BufferedReader(new FileReader(inputfile));
            while ((dataline = dataReader.readLine()) != null) {

                String[] data =dataline.split(",");             
              
               arrTime = Integer.parseInt(data[0]);
               serTime = Integer.parseInt(data[1].substring(data[1].length()-1));
               DataSet element = new DataSet(arrTime,serTime,0);
              
              inputQueue.enqueue(element);  
              
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
        
		while(!inputQueue.isEmpty() || !processingQueue.isEmpty() ) {
			if(!processingQueue.isEmpty()) {
				DataSet job = processingQueue.first();
				job.setSerTime(job.getSerTime() - 1);
				
					if(job.getSerTime() == 0) {
						job.setDepTime(time);
						terminatedJobs.enqueue(processingQueue.dequeue());
					}
					else {
						processingQueue.enqueue(processingQueue.dequeue());
					}
			}
			
			if(!inputQueue.isEmpty())
			{
				DataSet job1 = inputQueue.first();
				if(job1.getArrTime()==time)
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
			arrVal = terminatedJobs.first().getArrTime();
			depVal = terminatedJobs.first().getDepTime();
			totalTime= (depVal-arrVal) + totalTime;
			count++;
	
			terminatedJobs.dequeue();
		}
		totalTime= totalTime/count;
		
		System.out.print("Averange Time in System is: ");
		System.out.printf("%.2f", totalTime);
	}
}









