public class App {
    public static void main(String[] args) throws Exception {
        Pessoa Matheus = new Pessoa("Matheus", "Baraldi", 20, "12/03/2003");
        System.out.println("Nome: " + Matheus.getFullName());
        System.out.println("Idade: " + Matheus.getAge());
        System.out.println("Data de nascimento: " + Matheus.getDateOfBirth());
        
    }
}
