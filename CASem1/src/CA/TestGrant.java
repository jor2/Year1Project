/*
 * CA2 Program
 */
package CA;

/**
 * @author Jordan
 */
import java.util.Scanner;

public class TestGrant {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final int FEES = 3000;
        int userChoice, sdev, maths, systemAnalysis, cmpArch, menu, studentFees = 0, grantFees = 0, hundred = 0, seventyFive = 0, fifty = 0, noGrant = 0, grantAwarded = 0, processed = 0, totalStudentFees = 0;
        double average;
        String user, user1, password, password1, password2, studentName, studentNumber;

        Scanner in = new Scanner(System.in);

        System.out.println("\t\tPlease create your ABC College Grant account");
        System.out.print("Please enter your desired username: ");
        user = in.next();
        System.out.print("\nPlease enter the password for your account: ");
        password = in.next();
        System.out.println("\n\n\t\tSecurity Feature");
        System.out.print("Please enter your username: ");
        user1 = in.next().toLowerCase();
        System.out.print("\nPlease enter your password: ");
        password1 = in.next();
        System.out.print("\nPlease re-enter your password: ");
        password2 = in.next();

        if (user1.equals(user) && password1.equals(password) && password2.equals(password)) {
            System.out.println("\nPassword has been verified successfully.");
            System.out.println("\n\n\t\t ABC College Grant System");
            System.out.println("1.\t Calculate Grant");
            System.out.println("2.\t Fee Statistics");
            System.out.println("3.\t Grant Category Information");
            System.out.println("4.\t Exit");
            System.out.print("\nEnter your choice: ");
            userChoice = in.nextInt();
            while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4) {
                System.out.println("\t Inavlid Choice");
                System.out.println("\n\t\t ABC College Grant System");
                System.out.println("1.\t Calculate Grant");
                System.out.println("2.\t Fee Statistics");
                System.out.println("3.\t Grant Category Information");
                System.out.println("4.\t Exit");
                System.out.print("\nEnter your choice: ");
                userChoice = in.nextInt();
            }
            if (userChoice == 1 || userChoice == 2 || userChoice == 3 || userChoice == 4) {
                while (userChoice != 4) {
                    switch (userChoice) {
                        case 0:
                            while (userChoice == 0) {
                                System.out.println("\n\n\t\t ABC College Grant System");
                                System.out.println("1.\t Calculate Grant");
                                System.out.println("2.\t Fee Statistics");
                                System.out.println("3.\t Grant Category Information");
                                System.out.println("4.\t Exit");
                                System.out.print("\nEnter your choice: ");
                                userChoice = in.nextInt();
                            }
                            break;
                        case 1:
                            System.out.println("\n\n\t\t1. Calculate Grant");
                            System.out.print("\nEnter your student name: ");
                            in.nextLine();
                            studentName = in.nextLine();
                            System.out.print("\nEnter your student number: ");
                            studentNumber = in.nextLine().toLowerCase();
                            while (studentNumber.charAt(0) != ('x')) {
                                System.out.println("\n\tInvalid Student Number (Must begin with an 'x')");
                                System.out.print("\nEnter your student number: ");
                                studentNumber = in.next().toLowerCase();
                            }
                            if (studentNumber.charAt(0) == ('x')) {
                                System.out.print("\nWhat is your subject result in Software Development? ");
                                sdev = in.nextInt();
                                while (sdev > 100) {
                                    System.out.println("\n\tInvalid result. Please re-enter your result.");
                                    System.out.print("\nWhat is your subject result in Software Development? ");
                                    sdev = in.nextInt();
                                }
                                System.out.print("\nWhat is your subject result in Mathematics? ");
                                maths = in.nextInt();
                                while (maths > 100) {
                                    System.out.println("\n\tInvalid result. Please re-enter your result.");
                                    System.out.print("\nWhat is your subject result in Mathematics? ");
                                    maths = in.nextInt();
                                }
                                System.out.print("\nWhat is your subject result in System Analysis? ");
                                systemAnalysis = in.nextInt();
                                while (systemAnalysis > 100) {
                                    System.out.println("\n\tInvalid result. Please re-enter your result.");
                                    System.out.print("\nWhat is your subject result in System Analysis? ");
                                    systemAnalysis = in.nextInt();
                                }
                                System.out.print("\nWhat is your subject result in Computer Architecture? ");
                                cmpArch = in.nextInt();
                                while (cmpArch > 100) {
                                    System.out.println("\n\tInvalid result. Please re-enter your result.");
                                    System.out.print("\nWhat is your subject result in Computer Architecture? ");
                                    cmpArch = in.nextInt();
                                }
                                average = sdev + maths + systemAnalysis + cmpArch;
                                average = average / 4;
                                if (average < 40) {
                                    System.out.println("\n\tNo grant given");
                                    studentFees = FEES - FEES / 100 * 0;
                                    totalStudentFees += studentFees;
                                    grantFees += FEES - studentFees;
                                    noGrant += 1;
                                    processed += 1;
                                    System.out.println("\nFees due by the student are: €" + studentFees);
                                    System.out.printf("\nSudents name:            \t\t:%s%n", studentName);
                                    System.out.printf("Student number:            \t\t:%s%n", studentNumber);
                                    System.out.println("Students average:            \t\t:" + average + "%");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                    while (menu != 0 && menu != 4) {
                                        System.out.println("\tInvalid Choice - please re-enter");
                                        System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                        menu = in.nextInt();
                                    }
                                    if (menu == 0) {
                                        userChoice = 0;
                                    } else if (menu == 4) {
                                        userChoice = 4;
                                    }
                                } else if ((average >= 40) && (average < 60)) {
                                    System.out.println("\n\t\t50% of fees paid");
                                    studentFees = FEES - FEES / 100 * 50;
                                    totalStudentFees += studentFees;
                                    grantFees += FEES - studentFees;
                                    fifty += 1;
                                    grantAwarded += 1;
                                    processed += 1;
                                    System.out.println("\nFees due by the student are: €" + studentFees);
                                    System.out.printf("\nSudents name:            \t\t:%s%n", studentName);
                                    System.out.printf("Student number:            \t\t:%s%n", studentNumber);
                                    System.out.println("Students average:            \t\t:" + average + "%");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                    while (menu != 0 && menu != 4) {
                                        System.out.println("\tInvalid Choice - please re-enter");
                                        System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                        menu = in.nextInt();
                                    }
                                    if (menu == 0) {
                                        userChoice = 0;
                                    } else if (menu == 4) {
                                        userChoice = 4;
                                    }
                                } else if ((average >= 60) && (average < 80)) {
                                    System.out.println("\n\t\t75% of fees paid");
                                    studentFees = FEES - FEES / 100 * 75;
                                    totalStudentFees += studentFees;
                                    grantFees += FEES - studentFees;
                                    seventyFive += 1;
                                    grantAwarded += 1;
                                    processed += 1;
                                    System.out.println("\nFees due by the student are: €" + studentFees);
                                    System.out.printf("\nSudents name:            \t\t:%s%n", studentName);
                                    System.out.printf("Student number:            \t\t:%s%n", studentNumber);
                                    System.out.println("Students average:           \t\t:" + average + "%");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                    while (menu != 0 && menu != 4) {
                                        System.out.println("\tInvalid Choice - please re-enter");
                                        System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                        menu = in.nextInt();
                                    }
                                    if (menu == 0) {
                                        userChoice = 0;
                                    } else if (menu == 4) {
                                        userChoice = 4;
                                    }
                                } else if (average >= 80) {
                                    System.out.println("\n\t\t100% of fees paid");
                                    studentFees = FEES - FEES / 100 * 100;
                                    totalStudentFees += studentFees;
                                    grantFees += FEES - studentFees;
                                    hundred += 1;
                                    grantAwarded += 1;
                                    processed += 1;
                                    System.out.println("\nFees due by the student are: €" + studentFees);
                                    System.out.printf("\nSudents name:            \t\t:%s%n", studentName);
                                    System.out.printf("Student number:            \t\t:%s%n", studentNumber);
                                    System.out.println("Students average:            \t\t:" + average + "%");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                    while (menu != 0 && menu != 4) {
                                        System.out.println("\tInvalid Choice - please re-enter");
                                        System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                        menu = in.nextInt();
                                    }
                                    if (menu == 0) {
                                        userChoice = 0;
                                    } else if (menu == 4) {
                                        userChoice = 4;
                                    }
                                }
                            } else {
                                while (studentNumber.charAt(0) != 'x') {
                                    System.out.println("\n\tIncorrect Student Number");
                                    System.out.print("\nEnter your student number: ");
                                    studentNumber = in.next().toLowerCase();
                                }
                            }
                            break;
                        case 2:
                            System.out.println("\n\n\t\t2. Fee Statistics");
                            if (grantFees == 0 && studentFees == 0) {
                                System.out.println("\nNo information available");
                                System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                menu = in.nextInt();
                                while (menu != 0 && menu != 4) {
                                    System.out.println("\tInvalid Choice - please re-enter");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                }
                                if (menu == 0) {
                                    userChoice = 0;
                                } else if (menu == 4) {
                                    userChoice = 4;
                                }
                            } else {
                                System.out.println("\nTotal grant fees paid to colleges was\t:€" + grantFees);
                                System.out.println("The total cash amount paid by students(non-grant fees) to colleges was\t:€" + totalStudentFees);
                                System.out.println("The total number of students processed was\t:" + processed);
                                System.out.println("The total number of students that received a grant was\t:" + grantAwarded);
                                System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                menu = in.nextInt();
                                while (menu != 0 && menu != 4) {
                                    System.out.println("\tInvalid Choice - please re-enter");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                }
                                if (menu == 0) {
                                    userChoice = 0;
                                } else if (menu == 4) {
                                    userChoice = 4;
                                }
                            }
                            break;
                        case 3:
                            System.out.println("\n\n\t\t3. Grant Category Information");
                            if (fifty == 0 && seventyFive == 0 && hundred == 0 && noGrant == 0) {
                                System.out.println("\nNo information available");
                                System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                menu = in.nextInt();
                                while (menu != 0 && menu != 4) {
                                    System.out.println("\tInvalid Choice - please re-enter");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                }
                                if (menu == 0) {
                                    userChoice = 0;
                                } else if (menu == 4) {
                                    userChoice = 4;
                                }
                            } else {
                                System.out.println("\n100% Paid" + "\t\t75% Paid" + "\t\t50% Paid" + "\t\tNo Grant Paid");
                                System.out.print(+hundred + "\t\t\t" + seventyFive + "\t\t\t" + fifty + "\t\t\t" + noGrant);
                                if (fifty > seventyFive && fifty > hundred) {
                                    System.out.println("\n\nThe category with the most successfull number of applicants is the 50% category with " + fifty);
                                } else if (seventyFive > fifty && seventyFive > hundred) {
                                    System.out.println("\n\nThe category with the most successfull number of applicants is the 75% category with " + seventyFive);
                                } else if (hundred > fifty && hundred > seventyFive) {
                                    System.out.println("\n\nThe category with the most successfull number of applicants is the 100% category with " + hundred);
                                }
                                System.out.print("\n\nPress 0 to redisplay menu or 4 to exit the program: ");
                                menu = in.nextInt();
                                while (menu != 0 && menu != 4) {
                                    System.out.println("\tInvalid Choice - please re-enter");
                                    System.out.print("\nPress 0 to redisplay menu or 4 to exit the program: ");
                                    menu = in.nextInt();
                                }
                                if (menu == 0) {
                                    userChoice = 0;
                                } else if (menu == 4) {
                                    userChoice = 4;
                                }
                            }
                    }
                }
            } else {
                while (userChoice != 1 && userChoice != 2 && userChoice != 3 && userChoice != 4) {
                    System.out.println("\t Inavlid Choice");
                    System.out.println("\n\n\t\t ABC College Grant System");
                    System.out.println("1.\t Calculate Grant");
                    System.out.println("2.\t Fee Statistics");
                    System.out.println("3.\t Grant Category Information");
                    System.out.println("4.\t Exit");
                    System.out.print("\nEnter your choice: ");
                    userChoice = in.nextInt();
                }
            }
        } else {
            System.out.println("\n\tYour user or password was invalid.");
        }

    }
}
