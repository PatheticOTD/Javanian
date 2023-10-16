

public class dz2 {

        public static void main(String[] args) {
            //Slaves
            Employee emp1 = new Employee("John", 30, 8, 50000, "Java Developer");
            Employee emp2 = new Employee("Sam", 22, 3, 20000, "Python Developer");
            Employee emp3 = new Employee("Huan", 19, 2, 300, "Manual Tester");
            Employee emp4 = new Employee("Tyler Derdan", 28, 5, 1500, "ML");
            //Boses
            Boss boss1 = new Boss("Tim Cock", 69);
            Boss boss2 = new Boss("Skott Shady", 30);

            //Organisations
            Organization org1 = new Organization();
            org1.setName("Apple");
            org1.addVacancy("Java Developer", 3, 60000);
            org1.addVacancy("Python Developer", 5, 690900);
            org1.addVacancy("Manual Tester", 1, 600);

            Organization org2 = new Organization();
            org2.setName("Aboba.inc");
            org2.addVacancy("JavaScript Developer", 0, 6000);
            org2.addVacancy("Python Developer", 2, 600900);
            org2.addVacancy("Manual Tester", 1, 600);

            boss2.createComp("Besplatno_tolko_v_mishelovke");
            boss2.getComps().get(0).addVacancy("Dev Ops", 5, 1500);
            boss2.getComps().get(0).addVacancy("Sys Admin", 2, 1000);
            boss2.getComps().get(0).addVacancy("ML", 3, 2000);
            boss2.getComps().get(0).info();
            
            
            boss1.addComp(org1);  
            boss1.addComp(org2);

            boss2.addComp(org2);

            boss1.test(emp1);
            boss1.killSlave(emp1);
            org1.info();

            boss2.test(emp2);
            boss2.test(emp3);
            org2.info();

            emp1.info();
            emp2.info();
            emp3.info();

            emp3.imleavin();
            org2.info();

            boss2.test(emp4);
            emp4.info();
            emp4.imleavin();
            boss2.getComps().get(0).info();
            boss2.sellComp(boss2.getComps().get(0));

        }
    
}
