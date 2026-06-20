/*
			Company Branches	
	- Create a Company class with:
		- Static variable companyName.
		- Static variable totalBranches.
	- Every time a new branch (object) is created, increment totalBranches.
	- Show that changing companyName reflects in all objects.
 */
class Company {

    static final String companyName = "ABC Pvt. Ltd.";
    static int totalBranches = 0;

    public Company() {
        totalBranches++;
    }

    static void showTotalBranches() {
        System.out.println("The total number of Branches :" + totalBranches);
    }
}

public class Exercise6 {

    public static void main(String[] args) {
        Company.showTotalBranches();
        Company c1 = new Company();
        Company.showTotalBranches();

        Company c2 = new Company();
        Company.showTotalBranches();

        Company c3 = new Company();
        Company.showTotalBranches();
    }
}
