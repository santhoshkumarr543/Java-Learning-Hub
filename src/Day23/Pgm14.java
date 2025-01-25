package Day23;

import java.util.*;

public class Pgm14 {

    static class Student {
        private int rollNo;
        private String name;
        private String address;
        private int rank;

        public Student(int rollNo, String name, String address, int rank) {
            this.rollNo = rollNo;
            this.name = name;
            this.address = address;
            this.rank = rank;
        }

        public int getRollNo() {
            return rollNo;
        }

        public void setRollNo(int rollNo) {
            this.rollNo = rollNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public int getRank() {
            return rank;
        }

        public void setRank(int rank) {
            this.rank = rank;
        }

        public String toString() {
            return rollNo + " " + name + " " + address + " " + rank;
        }
    }

    static class SortByRollNo implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getRollNo(), s2.getRollNo());
        }
    }

    static class SortByName implements Comparator<Student> {
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    static class SortByRank implements Comparator<Student> {
        private boolean ascending;

        // Constructor to set the order of sorting
        public SortByRank(boolean ascending) {
            this.ascending = ascending;
        }

        public int compare(Student s1, Student s2) {
            if (ascending) {
                return Integer.compare(s1.getRank(), s2.getRank());
            } else {
                return Integer.compare(s2.getRank(), s1.getRank());
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> studentList = new ArrayList<>();
        boolean exit = false;

        while (!exit) {
            System.out.println("Student Interactive Console : ");
            System.out.println("1). Add User");
            System.out.println("2). Sort Student List by Roll no");
            System.out.println("3). Sort Student List by Name");
            System.out.println("4). Sort Students by Rank");
            System.out.println("5). Exit from System");
            System.out.print("Enter your choice : ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the rollno, name, address and rank (separated by comma): ");
                    String input = sc.nextLine();
                    String[] data = input.split(",");
                    int rollNo = Integer.parseInt(data[0]);
                    String name = data[1];
                    String address = data[2];
                    int rank = Integer.parseInt(data[3]);
                    studentList.add(new Student(rollNo, name, address, rank));
                    break;

                case 2:
                    Collections.sort(studentList, new SortByRollNo());
                    System.out.println("Students List sorted by rollno");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 3:
                    Collections.sort(studentList, new SortByName());
                    System.out.println("Students List sorted by Name");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 4:
                    System.out.print("Sort by ascending or descending (asc / des): ");
                    String order = sc.nextLine().toLowerCase();
                    boolean ascending = order.equals("asc");
                    Collections.sort(studentList, new SortByRank(ascending));
                    System.out.println("Students List sorted by Rank");
                    for (Student student : studentList) {
                        System.out.println(student);
                    }
                    break;

                case 5:
                    exit = true;
                    System.out.println("Exiting ....");
                    break;

                default:
                    System.out.println("Invalid Input Try again !!!");
                    break;
            }
        }
    }
}
