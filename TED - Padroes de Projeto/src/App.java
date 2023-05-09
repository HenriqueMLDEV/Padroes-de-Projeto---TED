import Classes.Cliente;
import Classes.Funcionario;


public class App {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        Funcionario funcionario = new Funcionario();
        System.out.println("Dados do cliente: \n" + "ID: " + cliente.getId_cliente(312) +
                "\nNome: " + cliente.getNome("Henrique Melo Leal")+
                "\nCPF: " + cliente.getCpf("704.973.774.70")+
                "\nEndereço: " + cliente.getEndereco("Av General Osorio, 564, Centro")+
                "\nEmail: " + cliente.getEmail("hmleal@gmail.com") +
                "\nDados do funcionário: \n"   +  "Matricula: " +   funcionario.getMatricula(175871)+
                "\nNome: " + funcionario.getNome("Patricia Melo Leal")+
                "\nCPF: " + funcionario.getCpf("031.431.514-47")+
                "\nEndereço: "+ funcionario.getEndereco("Av General Osorio, 564, Centro")+
                "\nEmail: " + funcionario.getEmail("patyleal@gmail.com"));


    }
}