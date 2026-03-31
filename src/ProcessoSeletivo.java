import java.util.concurrent.ThreadLocalRandom;

public  class ProcessoSeletivo {
    public  static void main(String[] args) {
        System.out.println("Processo Seletivo");
        selecaoCandidatos();
    }
    static  void selecaoCandidatos(){
        String[] candidatos = {"Pedro", "Vitoria", "João", "Carlos", "Eduardo", "Edmar", "Gabriel", "Paulo", "Lucas", "Bruno", "André"};
        int candidatosSelecionados = 0;
        int candidatosAtual = 0;
        double salarioBase = 2000.0;
        while (candidatosSelecionados < 5 && candidatosAtual < candidatos.length){
            String candidato = candidatos[candidatosAtual];
            double salaroioPretendido = valorPretendido();
            System.out.println("O candidato " + candidato + " está pretendendo  R$" + salaroioPretendido);
            if (salarioBase >= salaroioPretendido){
                System.out.println("O candidato " + candidato + " foi selecionado.");
                candidatosSelecionados++;
            }
            candidatosAtual++;
        }
    }

    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800, 2200);
    }


    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
