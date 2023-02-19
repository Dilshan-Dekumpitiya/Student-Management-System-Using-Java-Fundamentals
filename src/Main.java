//Dilshan Dekumpitiya

import java.util.*;
class Main{
    public static String[] idArray     =new String[0];
    public static String[] nameArray   =new String[0];
    public static int[] prfMarksArray  =new int[0];
    public static int[] dbmsMarksArray =new int[0];

    public static void bestinDBMS(){
        //Beginning of BEST IN DATABASE MANAGEMENT SYSTEM Page
        Scanner input=new Scanner(System.in);

        L1 : do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","BEST IN DATABASE MANAGEMENT SYSTEM","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            //------------------------------
            int size=idArray.length;
            String[] tempidArray =new String[size];
            String[] tempNameArray =new String[size];
            int[] tempprfMarksArray  =new int[size];
            int[] tempdbmsMarksArray  =new int[size];
            for (int i = 0; i < size; i++){ //To sorting copy original array data to temp arrays
                tempidArray[i]=idArray[i];
                tempNameArray[i]=nameArray[i];
                tempprfMarksArray[i]=prfMarksArray[i];
                tempdbmsMarksArray[i]=dbmsMarksArray[i];
            }
            for (int i = 0; i <tempidArray.length-1; i++){ //sort DBMS Marks
                for(int j=0;j<tempidArray.length-1;j++){
                    if(tempdbmsMarksArray[j]<tempdbmsMarksArray[j+1]){ //Compare to tempdbms MArks
                        int tempDBMS=tempdbmsMarksArray[j];
                        tempdbmsMarksArray[j]=tempdbmsMarksArray[j+1];
                        tempdbmsMarksArray[j+1]=tempDBMS;

                        String tempId=tempidArray[j];
                        tempidArray[j]=tempidArray[j+1];
                        tempidArray[j+1]=tempId;

                        String tempName=tempNameArray[j];
                        tempNameArray[j]=tempNameArray[j+1];
                        tempNameArray[j+1]=tempName;

                        int tempPRF=tempprfMarksArray[j];
                        tempprfMarksArray[j]=tempprfMarksArray[j+1];
                        tempprfMarksArray[j+1]=tempPRF;

                    }
                }
            }
            System.out.println("ID\tName\tDBMS Marks\tPRF Marks");
            System.out.println("---\t-------\t-----------\t----------");
            for (int i = 0; i < size; i++){ //To print
                if(tempdbmsMarksArray[i]==-1){
                    continue;
                }else{
                    System.out.println(tempidArray[i]+"\t"+tempNameArray[i]+"\t\t"+tempdbmsMarksArray[i]+"\t\t"+tempprfMarksArray[i]);
                }
            }
            System.out.print("\n\nDo you want to go back to main menu?(y) : ");
            String option=input.nextLine();

            if(option.equalsIgnoreCase("y")){
                clearConsole();
                homePage();

            }
        }while(true);

    }
    public static void bestinPRF(){
        //Beginning of BEST IN PROGRAMMING FUNDAMENTALS Page
        Scanner input=new Scanner(System.in);
        L1 :do{	for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","BEST IN PROGRAMMING FUNDAMENTALS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            int size=idArray.length;
            String[] tempidArray =new String[size];
            String[] tempNameArray =new String[size];
            int[] tempprfMarksArray  =new int[size];
            int[] tempdbmsMarksArray  =new int[size];
            for (int i = 0; i < size; i++){ //To sorting copy original array data to temp arrays
                tempidArray[i]=idArray[i];
                tempNameArray[i]=nameArray[i];
                tempprfMarksArray[i]=prfMarksArray[i];
                tempdbmsMarksArray[i]=dbmsMarksArray[i];
            }
            for (int i = 0; i <tempidArray.length-1; i++){ //sort PRF Marks
                for(int j=0;j<tempidArray.length-1;j++){
                    if(tempprfMarksArray[j]<tempprfMarksArray[j+1]){ //Compare to tempprf MArks

                        int tempPRF=tempprfMarksArray[j];
                        tempprfMarksArray[j]=tempprfMarksArray[j+1];
                        tempprfMarksArray[j+1]=tempPRF;

                        String tempId=tempidArray[j];
                        tempidArray[j]=tempidArray[j+1];
                        tempidArray[j+1]=tempId;

                        String tempName=tempNameArray[j];
                        tempNameArray[j]=tempNameArray[j+1];
                        tempNameArray[j+1]=tempName;

                        int tempDBMS=tempdbmsMarksArray[j];
                        tempdbmsMarksArray[j]=tempdbmsMarksArray[j+1];
                        tempdbmsMarksArray[j+1]=tempDBMS;
                    }
                }
            }
            for (int i = 0; i < 20; i++){
                System.out.print("-");
            }
            System.out.println("ID\tName\tPRF Marks\tDBMS Marks");
            System.out.println("---\t-------\t-----------\t----------");
            for (int i = 0; i < size; i++){ //To print
                if(tempprfMarksArray[i]==-1){
                    continue;
                }else{
                    System.out.println(tempidArray[i]+"\t"+tempNameArray[i]+"\t\t"+tempprfMarksArray[i]+"\t\t"+tempdbmsMarksArray[i]);
                    for (int j = 0; i < 20; j++){
                        System.out.print("-");
                    }
                }
            }
            System.out.print("\n\nDo you want to go back to main menu?(y) : ");
            String option=input.nextLine();

            if(option.equalsIgnoreCase("y")){
                clearConsole();
                homePage();

            }

        }while(true);
    }

    public static void printStudentRanks(){
        //Beginning of Print Student Ranks Page
        Scanner input=new Scanner(System.in);
        int total[]=rankArrays();
        double[] avg=new double[total.length];
        for (int i = 0; i <total.length ; i++){
            avg[i]=(double)(total[i]*0.5);
        }
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","PRINT STUDENT RANKS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------

            String[] tempIdArray=new String[idArray.length];
            String[] tempNameArray=new String[nameArray.length];

            for (int i = 0; i < idArray.length; i++){
                tempIdArray[i]=idArray[i];

            }
            for (int i = 0; i < idArray.length; i++){
                tempNameArray[i]=nameArray[i];
            }

            System.out.println();
            for (int i = 0; i < 50; i++){
                System.out.print("-");
            }
            System.out.println("\nRank\tID\tName\tTotal Marks\tAvg.Marks");
            for(int i=0; i<tempIdArray.length; i++){
                if(prfMarksArray[i]==-1){
                    continue;
                }else{
                    System.out.println((i+1)+"\t"+tempIdArray[i]+"\t"+tempNameArray[i]+"\t"+total[i]+"\t\t"+avg[i]);
                }
            }
            for (int i = 0; i < 50; i++){
                System.out.print("-");
            }

            System.out.print("\n\nDo you want to go back to main menu?(y) : ");
            String option=input.nextLine();

            if(option.equalsIgnoreCase("y")){
                clearConsole();
                homePage();
            }
        }while(true);
    }

    public static void printStudentDetails(){
        //Beginning of Print Student Details Page
        Scanner input=new Scanner(System.in);
        int[] total=rankArrays();
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","PRINT STUDENT DETAILS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            L2: do{
                System.out.print("Input student ID : ");
                String id=input.nextLine();
                int index=searchId(id);
                if(index==-1){
                    System.out.println(id+" not found...\n");
                    continue L2;
                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }
                //--------------------------------

                System.out.print("Student Name : "+nameArray[index]);

                if(prfMarksArray[index]==-1){
                    System.out.print("\n\nMarks yet to be added. ");
                    System.out.print("\n\nDo you want to search another student details?(y/n) : ");
                    String option=input.nextLine();

                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();

                    }
                }
                if(prfMarksArray[index]!=-1){
                    System.out.println("\n");
                    for (int i = 0; i < 20; i++){
                        System.out.print("-");
                    }
                    System.out.print("\nPRF Marks \t"+prfMarksArray[index]+"\nDBMS Marks \t"+dbmsMarksArray[index]);
                    System.out.print("\nTotal Marks \t"+total[index]);
                    double avg=total[index]*0.5;
                    System.out.print("\nAverage Marks \t"+avg);
                    System.out.print("\nRank \t"+"\t"+(index+1)+"\n");  //0+1(need index)
                    for (int i = 0; i < 20; i++){
                        System.out.print("-");
                    }

                    System.out.print("\n\nDo you want to search another student details?(y/n) : ");
                    String option=input.nextLine();

                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();

                    }
                }

            }while(true);
        }while(true);
    }
    public static int[] rankArrays(){
        int[] total=new int[idArray.length]; // create int type address array to store total
        for (int i = 0; i < idArray.length; i++){ //copy to total of arrays
            total[i]=prfMarksArray[i]+dbmsMarksArray[i];
        }
        for (int i = 0; i < idArray.length-1; i++){
            for (int j = 0; j < idArray.length-1; j++){ //sort total array and other 4 arrays with total array
                if(total[j]<total[j+1]){
                    int tempTotal=total[j];
                    total[j]=total[j+1];
                    total[j+1]=tempTotal;

                    String tempId=idArray[j];
                    idArray[j]=idArray[j+1];
                    idArray[j+1]=tempId;

                    String tempName=nameArray[j];
                    nameArray[j]=nameArray[j+1];
                    nameArray[j+1]=tempName;

                    int tempPRF=prfMarksArray[j];
                    prfMarksArray[j]=prfMarksArray[j+1];
                    prfMarksArray[j+1]=tempPRF;

                    int tempDBMS=dbmsMarksArray[j];
                    dbmsMarksArray[j]=dbmsMarksArray[j+1];
                    dbmsMarksArray[j+1]=tempDBMS;
                }
            }

        } return total;

    }

    public static void deleteStudent(){
        //Beginning of Delete Student Page
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","DELETE STUDENT","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            L2: do{
                System.out.print("Input student ID : ");
                String id=input.nextLine();
                int index=searchId(id);
                if(index==-1){
                    System.out.println(id+" not found...\n");
                    continue L2;
                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }
                for(int i=index; i<idArray.length-1; i++){ //copy second index element to first index element --> Beginning in index element
                    idArray[i]=idArray[i+1];
                    nameArray[i]=nameArray[i+1];
                    prfMarksArray[i]=prfMarksArray[i+1];
                    dbmsMarksArray[i]=dbmsMarksArray[i+1];
                }
                String[] tempIdArray=new String[idArray.length-1]; //Create New temp array size reduce by 1 element-->idArray.length-1
                String[] tempNameArray=new String[idArray.length-1]; //Create New temp array size reduce by 1 element-->idArray.length-1
                int[] tempprfMarksArray=new int[idArray.length-1]; //Create New temp array size reduce by 1 element-->idArray.length-1
                int[] tempdbmsMarksArray=new int[idArray.length-1]; //Create New temp array size reduce by 1 element-->idArray.length-1

                for(int i=0; i<tempIdArray.length; i++){ //Data Copy to temp arrays
                    tempIdArray[i]=idArray[i];
                    tempNameArray[i]=nameArray[i];
                    tempprfMarksArray[i]=prfMarksArray[i];
                    tempdbmsMarksArray[i]=dbmsMarksArray[i];
                }
                idArray=tempIdArray; //Assign tempIdArray Address to idArray
                nameArray=tempNameArray;
                prfMarksArray=tempprfMarksArray;
                dbmsMarksArray=tempdbmsMarksArray;

                System.out.print("Student has been deleted successfully.\n\n");
                L3:do{

                    System.out.print("Do you want to delete another student (Y/N) : ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("Y")){  //if(option.charAt(0)=='Y' ||option.charAt(0)=='y')
                        clearConsole();
                        continue L1;
                    }else if(option.equalsIgnoreCase("N")){
                        clearConsole();
                        homePage();
                        break L1;
                    }else{
                        System.out.println("Invalid option...");
                        System.out.println();
                        continue L3;
                    }
                }while(true);

            }while(true);
        }while(true);
    }

    public static void updateMarks(){
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","UPDATE MARKS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            L2: do{
                System.out.print("Input student ID : ");
                String id=input.nextLine();
                int index=searchId(id);

                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }
                //--------------------------------
                if(prfMarksArray[index]==-1){
                    System.out.println(id+" Marks Not yet added.Please use [3] to add Marks"+"\n");
                    System.out.print("Do you want to update another student Marks?(y/n) : ");
                    String option=input.nextLine();
                    if(option.equalsIgnoreCase("y")){
                        clearConsole();
                        continue L1;
                    }else {
                        clearConsole();
                        homePage();
                    }

                }
                System.out.println("Student name : "+nameArray[index]+"\n");
                System.out.println("PRF Marks : "+prfMarksArray[index]);
                System.out.println("DBMS Marks : "+dbmsMarksArray[index]+"\n");

                L3 : do {
                    System.out.print("Enter new PRF Marks : ");
                    int newPRF =input.nextInt();
                    if(isValidMarks(newPRF)==false){
                        System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                        continue L3;
                    }
                    input.nextLine();
                    prfMarksArray[index]=newPRF; //index-->replace to new marks
                    L4 : do {
                        System.out.print("Enter new DBMS Marks : ");
                        int newDBMS =input.nextInt();
                        if(isValidMarks(newDBMS)==false){
                            System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                            continue L4;
                        }

                        input.nextLine();
                        dbmsMarksArray[index]=newDBMS; //index-->replace to new marks
                        System.out.print("\nMarks have been updated successfully.");



                        System.out.print("\n\nDo you want to update another student Marks?(y/n) : ");
                        String option=input.nextLine();

                        if(option.equalsIgnoreCase("y")){
                            clearConsole();
                            continue L1;
                        }else {
                            clearConsole();
                            homePage();

                        }
                        input.nextLine();

                    }while(true);
                }while(true);
            }while(true);
        }while(true);
    }

    public static void updateStudentDetails(){
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","UPDATE STUDENT DETAILS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            L2: do{
                System.out.print("Input student ID : ");
                String id=input.nextLine();
                int index=searchId(id);

                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }
                //--------------------------------

                System.out.print("Student name : "+nameArray[index]+"\n\n");
                System.out.print("Enter the new Student name : ");
                String newName =input.nextLine();
                System.out.print("\nStudent details has been updated successfully.");

                nameArray[index]=newName; //index-->replace to new name

                System.out.print("\n\nDo you want to update another student details?(y/n) : ");
                String option=input.nextLine();

                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();

                }
                input.nextLine();

            }while(true);
        }while(true);
    }

    public static void addMarks(){
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","ADD MARKS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------
            L2: do{
                System.out.print("Input student ID : ");
                String id=input.nextLine();
                int index=searchId(id);

                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }
                //--------------------------------

                if(prfMarksArray[index]==-1){
                    System.out.print("Student name : "+nameArray[index]+"\n");

                    L3 : do{
                        System.out.print("Input PRF Marks : ");
                        int prfMarks=input.nextInt();

                        if(isValidMarks(prfMarks)==false){
                            System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                            continue L3;
                        }
                        input.nextLine();
                        prfMarksArray[index]=prfMarks; //index-->-1 replace to marks

                        L4 : do{
                            System.out.print("Input DBMS Marks : ");
                            int dbmsMarks=input.nextInt();

                            if(isValidMarks(dbmsMarks)==false){
                                System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                                continue L4;
                            }

                            input.nextLine();
                            dbmsMarksArray[index]=dbmsMarks; //index-->-1 replace to marks

                            System.out.print("\n\nDo you want to add another studentMarks(y/n) : ");
                            String option=input.nextLine();

                            if(option.equalsIgnoreCase("y")){
                                clearConsole();
                                continue L1;
                            }else {
                                clearConsole();
                                homePage();

                            }
                            input.nextLine();

                        }while(true);
                    }while(true);
                }

                if(prfMarksArray[index]!=-1){
                    System.out.print("Student name : "+nameArray[index]+"\n");
                    System.out.println("This student's marks have been already added.");
                    System.out.print("If you want to update the marks,please use [4] Update Marks option");
                }

                System.out.print("\n\nDo you want to add another student(y/n) : ");
                String option=input.nextLine();

                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                }

            }while(true);
        }while(true);
    }

    public static void addNewStudentWithMarks(){
        //Beginning of Add New Student With Marks Page
        Scanner input=new Scanner(System.in);
        L1: do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","ADD NEW STUDENT WITH MARKS","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();

            //------------------------------

            //Get Inputs
            L2 : do{
                System.out.print("Enter Student ID   : ");
                String id=input.nextLine();
                if(searchId(id)!=-1){
                    System.out.println(id+" is already exists...");
                    System.out.println();
                    continue L2;

                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;
                }

                System.out.print("Enter Student Name : ");
                String name=input.nextLine();

                System.out.println();


                L3 : do{
                    System.out.print("Input PRF Marks : ");
                    int prfMarks=input.nextInt();

                    if(isValidMarks(prfMarks)==false){
                        System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                        continue L3;
                    }

                    L4 : do{
                        System.out.print("Input DBMS Marks : ");
                        int dbmsMarks=input.nextInt();

                        if(isValidMarks(dbmsMarks)==false){
                            System.out.print("Invalid Marks,Please enter correct marks.\n\n");
                            continue L4;
                        }

                        input.nextLine();

                        extendArrays();

                        idArray[idArray.length-1]=id;     //idArray.length-1 --> Last Index
                        nameArray[nameArray.length-1]=name;
                        prfMarksArray[prfMarksArray.length-1]=prfMarks;
                        dbmsMarksArray[dbmsMarksArray.length-1]=dbmsMarks;

                        System.out.print("\nStudent has been added succefully.\nDo you want to add another student(y/n) : ");
                        String option=input.nextLine();

                        if(option.equalsIgnoreCase("y")){
                            clearConsole();
                            continue L1;
                        }else {
                            clearConsole();
                            homePage();
                            break;

                        }
                    }while(true);
                }while(true);
            }while(true);
        }while(true);
    }
    public static boolean isValidMarks(int marks){
        if(marks<0 || marks>100){
            return false;

        }return true;
    }

    public static void addNewStudent(){
        Scanner input=new Scanner(System.in);
        //Beginning of Add New Student Page
        L1 :do{
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            System.out.printf("%-15s %40s %43s %n", "|","ADD NEW STUDENT","|");
            for (int i = 0; i < 100; i++){
                System.out.print("-");
            }
            System.out.println();
            //------------------------------

            //Get Inputs

            L2 : do{
                System.out.print("Enter Student ID   : ");
                String id=input.nextLine();
                if(searchId(id)!=-1){
                    System.out.println(id+" is already exists...");
                    System.out.println();
                    continue L2;
                }
                if(!isValidId(id)){
                    System.out.println("Invalid Student ID..Please check..");
                    System.out.println();
                    continue L2;

                }

                System.out.print("Enter Student Name : ");
                String name=input.nextLine();

                extendArrays();
                idArray[idArray.length-1]=id;     //idArray.length-1 --> Last Index(Because Empty e;ement after etend array)
                nameArray[idArray.length-1]=name;
                prfMarksArray[prfMarksArray.length-1]=-1;
                dbmsMarksArray[dbmsMarksArray.length-1]=-1;

                System.out.print("\nStudent has been added succefully.\nDo you want to add another student(y/n) : ");
                String option=input.nextLine();

                if(option.equalsIgnoreCase("y")){
                    clearConsole();
                    continue L1;
                }else {
                    clearConsole();
                    homePage();
                    break;
                }

            }while(true);
        }while(true);

    }

    public static int searchId(String id){
        for(int i=0; i<idArray.length; i++){
            if(idArray[i].equalsIgnoreCase(id)){
                return i;
            }
        }
        return -1;
    }

    public static boolean isValidId(String id){
        boolean isValidId=false;
        if(id.length() ==4 && id.charAt(0) == 'S'){
            isValidId=true;
            String sDigit=id.substring(1);
            char[] chars=sDigit.toCharArray();
            for (int i = 0; i < chars.length; i++){
                if(!Character.isDigit(chars[i])){
                    isValidId=false;
                    break;
                }
            }

        }
        return isValidId;
    }

    public static void extendArrays(){
        int size=idArray.length;
        String[] tempIdArray=new String[size+1];
        String[] tempNameArray=new String[size+1];
        int[] tempprfMarksArray=new int[size+1];
        int[] tempdbmsMarksArray=new int[size+1];

        for (int i = 0; i < size ; i++){
            tempIdArray[i]=idArray[i];
            tempNameArray[i]=nameArray[i];
            tempprfMarksArray[i]=prfMarksArray[i];
            tempdbmsMarksArray[i]=dbmsMarksArray[i];
        }
        idArray=tempIdArray;
        nameArray=tempNameArray;
        prfMarksArray=tempprfMarksArray;
        dbmsMarksArray=tempdbmsMarksArray;
    }

    public static void homePage(){
        Scanner input=new Scanner(System.in);
        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-15s %53s %30s %n", "|","WELCOME TO GDSE MARKS MANAGEMENT SYSTEM","|");
        for (int i = 0; i < 100; i++){
            System.out.print("-");
        }
        System.out.println();
        System.out.printf("%-20s %54s %n","[1] Add New Student","[2]  Add New Student With Marks");
        System.out.printf("%-20s %50s %n","[3] Add Marks","[4]  Update Student Details");
        System.out.printf("%-20s %42s %n","[5] Update Marks","[6]  Delete Student");
        System.out.printf("%-20s %42s %n","[7] Print Student Details","[8]  Print Student Ranks");
        System.out.printf("%-20s %46s %n %n ","[9] Best in Programming Fundamentals","[10] Best in Database Management System");

        System.out.print("\bEnter an option to continue > ");
        int option=input.nextInt();
        switch(option){
            case 1 : clearConsole();
                addNewStudent(); break;
            case 2 : clearConsole();
                addNewStudentWithMarks(); break;
            case 3 : clearConsole();
                addMarks();
            case 4 : clearConsole();
                updateStudentDetails(); break;
            case 5 : clearConsole();
                updateMarks(); break;
            case 6 : clearConsole();
                deleteStudent(); break;
            case 7 : clearConsole();
                printStudentDetails(); break;
            case 8 : clearConsole();
                printStudentRanks(); break;
            case 9 : clearConsole();
                bestinPRF(); break;
            case 10: clearConsole();
                bestinDBMS(); break;
            default :
                System.out.print("Invalid Input\nPlease input valid option.\n");
                System.out.print("\nDo you want to back menu(y) : ");
                String option1=input.nextLine();
                input.nextLine();
                if(option1.equalsIgnoreCase("Y")){
                    clearConsole();
                    homePage();
                }else {
                    clearConsole();
                    homePage();
                }
        }
    }

    public static void main(String args[]){
        homePage();

    }

    public static void clearConsole(){
        try {
            final String os = System.getProperty("os.name");
            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        }catch (final Exception e) {
            e.printStackTrace();
        }
    }
}
