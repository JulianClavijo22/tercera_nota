package Semana6.model;

public class Employee {
    public String role;
    public Employee (String role){
        this.role = role;

    }

    public void showResposabities (){
        switch (role) {
            case "manager":
            System.out.println("Maneja el equipo");
            break;
            case "developer":
            System.out.println("programa y textea");
            case "Designer":
            System.out.println("Diseña");
                
                
        
            default:
            System.out.println("No conocido");
                break;
        }
    }
        
    }
    

