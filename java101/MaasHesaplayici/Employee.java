public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;
    double tax_ = 0;
    double bonus_ = 0;
    double yilPrimi_ = 0;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

        tax();
        bonus();
        raiseSalary();
    }

    void tax() {
        if (this.salary > 1000)
            tax_ = this.salary * 0.03;
    }

    void bonus() {
        if (this.workHours > 40)
            bonus_ = (this.workHours - 40) * 30;
    }

    void raiseSalary() {
        int workingYear = 2021 - this.hireYear;
        if (workingYear < 10)
            yilPrimi_ = this.salary * 0.05;
        else if ((workingYear > 9) && (workingYear < 20))
            yilPrimi_ = this.salary * 0.1;
        else if (workingYear > 19)
            yilPrimi_ = this.salary * 0.15;
    }

    public String toString() {
        System.out.println("Adı: " + this.name);
        System.out.println("Maaşı: " + this.salary);
        System.out.println("Çalışma saati " + this.workHours);
        System.out.println("Başlangıç Yılı: " + this.hireYear);
        System.out.println("Vergi: " + this.tax_);
        System.out.println("Bonus: " + this.bonus_);
        System.out.println("Maaş artışı: " + this.yilPrimi_);
        System.out.println("Vergi ve bonuslar ile birlikte maaş: " + (this.salary - this.tax_ + this.bonus_));
        System.out.println("Toplam maaş: " + (this.salary - this.tax_ + this.bonus_ + this.yilPrimi_));
        return null;
    }
}
