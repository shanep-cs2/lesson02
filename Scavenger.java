
/**
 * Class to contain all the data from a scavenger hunt
 */
public class Scavenger{

    /**
     * Prints two arguments in a two column output.
     * @param col1 The argument for the first column 
     * @param col2 The argument for the second colum
     */
    public static void printcolum(String col1, String col2){
        System.out.format("%-55s %s %n", col1 , col2);
    }

    /**
     * Print out all the important links of the course. The
     * links can be found at https://shanepanter.com/cs2/
     */
    public static void importantLinks(){
        System.out.println("----------");
        System.out.println("Important Links");
        printcolum("The Course Homepage URL:" , "TODO");
        printcolum("Text Book URL:", "TODO");
        printcolum("Discussion Forum URL:", "TODO");
        printcolum("Github Classroom URL:", "TODO");
        printcolum("Grades URL:", "TODO");
        printcolum("Midterm and Final exams URL:", "TODO");
        printcolum("Practice exams URL:", "TODO");
        printcolum("Office Hours URL:", "TODO");
    }

    /**
     * Prints out the important information from the syllabus. The
     * syllabus can be found at https://shanepanter.com/cs2/docs/syllabus.html
     */
    public static void syllabus(){
        System.out.println("----------");
        System.out.println("Syllabus Policies");
        printcolum("A grade of 79.9% will translate to a" , "TODO");
        printcolum("There are 11 labs each worth" , "TODO (points)");
        printcolum("There are 10 reading assignments each worth" , "TODO (points)");
        printcolum("There is 1 final project worth" , "TODO (points)");
        printcolum("There is 1 midterm exam worth" , "TODO (points)");
        printcolum("Late work can be submitted up to" , "TODO days late");
    }

    /**
     * Due dates can be found on the class homepage. https://shanepanter.com/cs2/
     */
    public static void dueDates(){
        System.out.println("----------");
        System.out.println("Lab Due Dates");
        printcolum("lesson02 (scavenger hunt) is due on:" , "TODO");
        printcolum("lesson04 is due on:" , "TODO");
        printcolum("lesson06 is due on:" , "TODO");
        printcolum("lesson08 is due on:" , "TODO");
        printcolum("lesson10 is due on:" , "TODO");
        printcolum("lesson12 is due on:" , "TODO");
        printcolum("lesson14 is due on:" , "TODO");
        printcolum("lesson18 is due on:" , "TODO");
        printcolum("lesson20 is due on:" , "TODO");
        printcolum("lesson22 is due on:" , "TODO");
        printcolum("lesson24 is due on:" , "TODO");

        System.out.println("----------");
        System.out.println("Reading Assignment Due Dates");
        printcolum("lesson03: Reading Assignment (ch1) is due on:" , "TODO");
        printcolum("lesson05: Reading Assignment (ch2.1-2.4) is due on:" , "TODO");
        printcolum("lesson07: Reading Assignment (ch2.5-2.11) is due on:" , "TODO");    
        printcolum("lesson09: Reading Assignment (ch3) is due on:" , "TODO");
        printcolum("lesson11: Reading Assignment (ch4) is due on:" , "TODO");
        printcolum("lesson13: Reading Assignment (ch5) is due on:" , "TODO");
        printcolum("lesson17: Reading Assignment (ch6.1-6.3) is due on:" , "TODO");   
        printcolum("lesson19: Reading Assignment (ch6.4-6.6) is due on:" , "TODO");
        printcolum("lesson21: Reading Assignment (ch7.4-7.4) is due on:" , "TODO");
        printcolum("lesson23: Reading Assignment (ch7.5-7.9) is due on:" , "TODO");

        System.out.println("----------");
        System.out.println("Final Project");
        printcolum("lesson25: Build A linked list is due on:" , "TODO");
        printcolum("lesson26: List Tests (TDD) is due on:" , "TODO");
        printcolum("lesson27: The List Class is due on:" , "TODO");
        printcolum("lesson28: Make Generic is due on:" , "TODO");
        printcolum("lesson29: Iterator Tests (TDD) is due on:" , "TODO");
        printcolum("lesson30: List Iterator is due on:" , "TODO");

        System.out.println("----------");
        System.out.println("Midterm and Final exam");
        printcolum("The Midterm must be completed by:" , "TODO");
        printcolum("The Final must be completed by:" , "TODO");
  
    }
    
    /**
     * Main entry point.
     * @param args
     */
    public static void main(String args[]){
        System.out.println("Scavenger Hunt");
        importantLinks();
        syllabus();
        dueDates();
    }
}