import java.lang.runtime.SwitchBootstraps;

public class Patient{
        private int id = 0;
        private String name = "";
        private int birthYear = 0;
        private double height = 0.0;
        private double weight = 0.0;
        private String bloodGroup = "";
        private String phoneNumber = "";

        public Patient(){
            this.id = 0;
            this.name = "unknown";
            this.birthYear = 0;
            this.height = 0.0;
            this.weight = 0.0;
            this.bloodGroup = "unknown";
            this.phoneNumber = "unknown";
        }

        public Patient(int id, String name, int birthYear, double height, double weight, String bloodGroup, String phoneNumber){
            this.id = id;
            this.name = name;
            if (birthYear <= 0.0){
                System.out.println("Invalid Year, changing it to default value");
                this.birthYear = 2000;
            }else{
                this.birthYear = birthYear;
            }
            if (height <= 0.0){
                System.out.println("Invalid height, changing it to default value");
                this.height = 150.0;
            }else{
                this.height = height;
            }
            if (weight <= 0.0){
                System.out.println("Invalid weight, changing it to default value");
                this.weight = 60;
            }else{
                this.weight = weight;
            }
            this.bloodGroup = bloodGroup;
            this.phoneNumber = phoneNumber;
        }


        public int getAge(int currentYear){
            currentYear = currentYear - birthYear;
            return currentYear;
        }
        public double getBMI(double weight, double height){
            return (weight*10000)/(height*height);

        }

        public void displayDetails(int currentYear) {
            System.out.println("Patient Name: " + name);
            System.out.println("Patient Age: " + getAge(currentYear));
            System.out.println("Patient Height (cm): " + height);
            System.out.println("Patient Weight (kg): " + weight);
            System.out.println("Patient BloodGroup: " + bloodGroup);
            System.out.println("Patient PhoneNumber: " + phoneNumber);
            System.out.println("Your BMI: " + getBMI(weight,height));
            System.out.println("---------------------");
        }

        public static void main(String[] args) {
            int currentYear = 2024;
            Patient patient = new Patient(1001, "John Doe", 1978, 175.5, 78.0,"ABC","0643542627");
            patient.displayDetails(currentYear);
            Patient invalidPatient = new Patient(1002, "Joe Dohn", 1990, -160.0, -65.0,"xxl","05555555");
            invalidPatient.displayDetails(currentYear);
        }

    }




