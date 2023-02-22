public class Company {
    private String nameCompany;
    private String dateOfCreation;
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        if(id.length()==10) {
            this.id = id;
        }
    }

    public String getNameCompany() {
        return nameCompany;
    }

    public void setNameCompany(String nameCompany) {
        this.nameCompany = nameCompany;
    }

    public String getDateOfCreation() {
        return dateOfCreation;
    }

    public void setDateOfCreation(String dateOfCreation) {
        this.dateOfCreation = dateOfCreation;
    }
}
