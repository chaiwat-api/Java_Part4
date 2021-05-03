class CompanyOwner {
    public String firstName;
    public String lastName;
    public String position;

    CompanyOwner() {
        this.firstName = "Jack";
        this.lastName = "Ma";
        this.position = "Alibaba Group Owner";

    }

    final void hello() {
        System.out.println("Hello, I am " + this.firstName + " " + this.lastName + ".");
    }
}
