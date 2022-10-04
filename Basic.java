package Java;

import io.opentelemetry.exporter.logging.SystemOutLogExporter;

public class Basic {
//     long Rollno = 51131818888888888888888;
     String name = "Manoj kumar";
     int mark_in_12 = 91;
     int mark_in_10 = 80;

     public void performance(){
         System.out.println("mark in 12th std "+ mark_in_12);
         System.out.println("mark in 10th std"+ mark_in_10);
         System.out.println("name of the cand"+ name);

    }

    public static void main(String []args){
      Basic pov = new Basic();
      pov.performance();



    }
}
