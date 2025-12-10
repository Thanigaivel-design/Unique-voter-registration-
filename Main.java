import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VoterRegistrationSystem system = new VoterRegistrationSystem();

        while (true) {
            System.out.println("\n========= UNIQUE VOTER REGISTRATION SYSTEM =========");
            System.out.println("1. Register New Voter");
            System.out.println("2. View All Registered Voters");
            System.out.println("3. Search Voter by ID");
            System.out.println("4. Delete Voter by ID");
            System.out.println("5. Count Registered Voters");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int ch = 0;

            try {
                ch = Integer.parseInt(sc.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid input. Enter a number.");
                continue;
            }

            switch (ch) {

                case 1:
                    System.out.print("Enter Voter ID: ");
                    String id = sc.nextLine();

                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Age: ");
                    int age;
                    try {
                        age = Integer.parseInt(sc.nextLine());
                    } catch (Exception e) {
                        System.out.println("Invalid age!");
                        break;
                    }

                    System.out.print("Enter Address: ");
                    String address = sc.nextLine();

                    System.out.print("Enter Father/Mother Name: ");
                    String fmname = sc.nextLine();

                    System.out.print("Enter Gender: ");
                    String gender = sc.nextLine();

                    System.out.print("Enter Mobile Number: ");
                    String mobile = sc.nextLine();

                    System.out.print("Enter Email ID: ");
                    String email = sc.nextLine();

                    System.out.print("Enter Aadhaar Number: ");
                    String aadhaar = sc.nextLine();

                    System.out.print("Enter DOB (DD-MM-YYYY): ");
                    String dob = sc.nextLine();

                    System.out.print("Enter Nationality: ");
                    String nationality = sc.nextLine();

                    System.out.print("Enter District: ");
                    String district = sc.nextLine();

                    System.out.print("Enter State: ");
                    String state = sc.nextLine();

                    System.out.print("Enter Pincode: ");
                    String pincode = sc.nextLine();

                    System.out.print("Enter Constituency: ");
                    String constituency = sc.nextLine();

                    System.out.print("Enter Booth Number: ");
                    String booth = sc.nextLine();

                    System.out.print("Enter Voter Type (General/Postal/Overseas): ");
                    String vtype = sc.nextLine();

                    String regDate = LocalDate.now().toString();

                    Voter v = new Voter(id, name, age, address, fmname, gender, mobile, email,
                                        aadhaar, dob, nationality, district, state, pincode,
                                        constituency, booth, vtype, regDate);

                    if (system.addVoter(v))
                        System.out.println("Voter registered successfully!");
                    else
                        System.out.println("Duplicate Voter ID.");
                    break;

                case 2:
                    system.showVoters();
                    break;

                case 3:
                    System.out.print("Enter Voter ID to search: ");
                    system.searchVoter(sc.nextLine());
                    break;

                case 4:
                    System.out.print("Enter Voter ID to delete: ");
                    system.deleteVoter(sc.nextLine());
                    break;

                case 5:
                    system.countVoters();
                    break;

                case 6:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
