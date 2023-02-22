public class Main {
    public static void main(String[] args) {
        Company company = new Company();
        company.setNameCompany("Java2023");
        company.setId("1234567890");
        company.setDateOfCreation("22.02.2023");

        CompanyET companyET = new CompanyET();
        companyET.setNameCompany("Java2023");
        companyET.setId("1234567890");
        companyET.setDateOfCreation("22.02.2023");
        companyET.setCompanyOwner("John Wick");
        companyET.setFirstCapital(1000.00);
        companyET.setActualCapital(10000.00);
        System.out.println(companyET.profit());
    }
}