import java.io.file;
public class readGpa { 
    
    try { 
        Scanner input = new Scanner(infile);
        String[] parse = new String[2]; //There are 2 items
        while (input.hasNext()){
            String line = input.nextLine();
            System.out.println(line);
            parse = line.split(" "); //cuts the line at the space
            if (parse[0].equals("F")) { 
                fCount++;
                fTotal += Double.parseDouble(parse[1]);
            } // if 
            else { 
                mCount++;
                mTotal += Double.parseDouble(parse[1]);
            } //else
        } // while
        
        System.out.println("Girls:"+ fCount);
        double avg = (double) fTotal/fCount;
        System.out.printf("Girls GPA: .2f\n", avg);
        avg = (double)mTotal/mCount;
        System.out.println("Boys :" + mCount);
        System.out.printf("Boys GPA: .2f\n", avg);
        intput.Close();
    }//try
    Catch (Exception ex) { 
        System.out.println("Ouch");
    } //catch
} //read


    public void makeFile(){
        
        try{
            
            System.out.println("Making GPA File");
            
            File outFile = new File ("data.txt");
            Printwriter output = new Printwriter (outFile);
            
            for(int i = 0;  i < 20; i++) { 
                int gender = (int)2*Math.random()+1); // Random # between 1 and 2
                System.out.println(gender);
                
                String strGender = (gender == 1)?"F":"M"; 
                double gpa = (4*Math.random()); 
                gpa = (int)(100*gpa + .5)/100.0; // round to 2 dec
                System.out.println(gpa);
                
           
                
                String ans = strGender + " " + gpa;
                output.println(ans);
                System.out.println(ans + " ");
                if (i==10)
                System.out.println("");
                
                
                
                } // for
                output.close();
                System.out.println("");
               
            } // try
            
            catch(Exception ex) {
                
                System.out.println("Error");
            } // catch
        } // makefile
    }

            
            
 
                