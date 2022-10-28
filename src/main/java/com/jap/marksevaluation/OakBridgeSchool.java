package com.jap.marksevaluation;
public class OakBridgeSchool {

    public int[] calculateTotalMarks(int [] math, int[] science, int[] english)
    {
        if (math.length == 0 || science.length == 0 || english.length == 0) {
            return null;
        }
        else {
            int[] totalMarks = new int[math.length];
            for (int index = 0; index < math.length; index++) {
                totalMarks[index] = math[index] + science[index] + english[index];
            }
            return totalMarks;
        }
    }

    public int[] calculateTotalAverageMarksForEachStudent(int [] totalMarks, int noOfSubjects)
    {
        if (totalMarks.length == 0 || noOfSubjects<=0) {
            return null;
        }
        else {
            int[] averageMarks = new int[totalMarks.length];
            for (int index = 0; index < totalMarks.length; index++) {
                averageMarks[index] = totalMarks[index] /noOfSubjects;
            }
            return averageMarks;
        }
    }

   // Write the logic inside the method to calculate the grade based on the math mark of the student
   public char findGradeInMath(int math){
       char mathGrade =' ';
       if (math >= 90)
       {
           mathGrade = 'A';
       }
       else if (math >= 80 && math <= 89)
       {
           mathGrade = 'B';
       }
       else if (math >= 70 && math <= 79)
       {
           mathGrade = 'C';
       }
       else if (math >= 60 && math <= 69)
       {
           mathGrade = 'D';
       }
       else if (math <= 59)
       {
           mathGrade = 'F';
       }
       return mathGrade;
   }
    // Write the logic inside the method to calculate the grade based on the science mark of the student
    public char findGradeInScience(int science){
        char scienceGrade = ' ';
        if (science >= 90)
        {
            scienceGrade = 'A';
        }
        else if (science >= 80 && science <= 89)
        {
            scienceGrade = 'B';
        }
        else if (science >= 70 && science <= 79)
        {
            scienceGrade = 'C';
        }
        else if (science >= 60 && science <= 69)
        {
            scienceGrade = 'D';
        }
        else if (science <= 59)
        {
            scienceGrade = 'F';
        }
        return scienceGrade;
    }
    // Write the logic inside the method to calculate the grade based on the english mark of the student
    public char findGradeInEnglish(int english){
        char englishGrade = ' ';
        if (english >= 90)
        {
                englishGrade = 'A';
        }
        else if (english >= 80 && english <= 89)
        {
                englishGrade = 'B';
        }
        else if (english >= 70 && english <= 79)
        {
                englishGrade = 'C';
        }
        else if (english >= 60 && english <= 69)
        {
                englishGrade = 'D';
        }
        else if (english <= 59)
        {
                englishGrade = 'F';
        }
        return englishGrade;
    }

    // Write the logic to sort the total marks of the students of the class, use insertion-sort

    public int[] sortByTotalMarks(int[] totalMarks)
    {
        for (int index = 0; index < totalMarks.length - 1; index++)
        {
            int key = totalMarks[index + 1];
            int sortedPosition = index;
            while (sortedPosition >= 0 && totalMarks[sortedPosition] > key)
            {
                totalMarks[sortedPosition+1] = totalMarks[sortedPosition];
                totalMarks[sortedPosition] = key;
                sortedPosition = sortedPosition - 1;
            }
        }
        return totalMarks;
    }

    //Display the details of the student
    public void displayDetails(int totalMark, int averageMark, char mathGrade, char scienceGrade, char englishGrade,String studentName, int rollNo )
    {
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("Grading And Evaluation");
            System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
            System.out.println("-----------------------------------------------------------------");
            System.out.println("Student Name \t\t\t\t Roll Number ");
            System.out.println("-----------------------------------------------------------------");
            System.out.println(studentName +"\t\t\t\t\t\t\t " + rollNo);
            System.out.println();
            System.out.println("The total marks scored   : " + totalMark);
            System.out.println("The average marks scored : " + averageMark);
            System.out.println("-----------------------------------------------------------------");
            System.out.println();
            System.out.println("Grade in Math    : " + mathGrade);
            System.out.println("Grade in Science : " + scienceGrade);
            System.out.println("Grade in English : " + englishGrade);
            System.out.println("-----------------------------------------------------------------");
    }

    public static void main(String[] args) {

        // Declare and Initialize the object of OakBridgeSchool
        OakBridgeSchool oakBridgeSchool = new OakBridgeSchool();

        // Declare and Initialize values to the arrays to store marks of math, science, english
        int[] math = {88, 89, 100, 70, 60, 80, 35, 3, 25, 56};
        int[] science = {80, 83, 99, 67, 56, 84, 38, 9, 32, 65};
        int[] english = {90, 98, 100, 65, 54, 82, 40, 13, 45, 67};

        int noOfSubjects = 3;

        // Declare and Initialize a string array for storing student names
        String[] studentNames = {"Michell", "Kate", "Ann", "Tina", "Tom", "Sam", "Ria", "Pam", "Leena", "Leo"};

        // Declare and Initialize an int array for storing roll numbers
        int[] rollNos = {102, 109, 101, 103, 104, 108, 110, 105, 106, 107};

        // Call the appropriate methods and display the results
        int[] totalMarks = oakBridgeSchool.calculateTotalMarks(math, science, english);
        int[] averageMarks = oakBridgeSchool.calculateTotalAverageMarksForEachStudent(totalMarks, noOfSubjects);

        for (int index = 0; index < rollNos.length; index++)
        {
            String studentName = studentNames[index];
            int rollNumber = rollNos[index];
            int totalMark = totalMarks[index];
            int averageMark = averageMarks[index];

            int mathMarks = math[index];
            char mathGrade = oakBridgeSchool.findGradeInMath(mathMarks);

            int scienceMarks = science[index];
            char scienceGrade = oakBridgeSchool.findGradeInScience(scienceMarks);

            int englishMarks = english[index];
            char englishGrade = oakBridgeSchool.findGradeInEnglish(englishMarks);

            oakBridgeSchool.displayDetails(totalMark, averageMark, mathGrade, scienceGrade, englishGrade, studentName, rollNumber);
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Report");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        oakBridgeSchool.sortByTotalMarks(totalMarks);
        for (int index = totalMarks.length - 1; index >= 0; index--) {
            System.out.println(totalMarks[index]);
        }
    }
}
