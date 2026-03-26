import javax.swing.JOptionPane;
public class Principal {

    public static void main(String[] args) {
    String nome;
    nome = JOptionPane.showInputDialog(null,"Digite seu nome ");
    JOptionPane.showMessageDialog(null,"Seu nome é " + nome);
    }
}
