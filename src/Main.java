import java.util.concurrent.ThreadLocalRandom;

public class Main {
    public static void main(String[] args) {
        selecaoCandidatos();
    }

    static void imprimirSelecionados(){
        String [] candidatos =
    }

    static void selecaoCandidatos() {
        String[] candidatos = {"FELIE", "MACIEL", "ROBERTO", "EDUARDO", "PATRICIA", "DANIEL", "ANA", "LUISA", "ALICIA"};
        int candidatosSelecionados = 0;

        for (String candidato : candidatos) {
            double salarioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " solicitou este valor de Salário " + salarioPretendido);

            if (salarioPretendido <= 2000.0) {
                System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
                candidatosSelecionados++;
            }

            if (candidatosSelecionados >= 5) {
                break; // Encerrar a seleção após 5 candidatos selecionados
            }
        }
    }

    static double valorPretendido() {
        return ThreadLocalRandom.current().nextDouble(1800.0, 2200.0);
    }

    static void analisarCandidato(double salarioPretendido) {
        double salarioBase = 2000.0;

        if (salarioBase > salarioPretendido) {
            System.out.println("Ligar para o Candidato");
        } else if (salarioBase == salarioPretendido) {
            System.out.println("Ligar para Candidato com contra Proposta");
        } else {
            System.out.println("Aguardando Resultado dos Demais Candidatos");
        }
    }
}
