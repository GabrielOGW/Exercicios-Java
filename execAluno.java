import javax.swing.JOptionPane;

public class execAluno {
    public static void main(String[] args) {
        aluno aluno = new aluno();
        aluno.setNotaTL(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota do trabalho realizado em laboratorio?")));
        aluno.setAvaliacao(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota da avaliação semestral??")));
        aluno.setExameFinal(Double.parseDouble(JOptionPane.showInputDialog("Qual a nota do exame final?")));

        double media = aluno.setMedia(aluno.getNotaTL(),aluno.getAvaliacao(), aluno.getExameFinal());
        
        JOptionPane.showMessageDialog(null, "Media: " + media + "\nCom o conceito: " + aluno.getConceito(media));   
    }
}