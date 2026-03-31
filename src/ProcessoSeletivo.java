import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public  class ProcessoSeletivo {
    public  static void main(String[] args) {
        System.out.println("Processo Seletivo");
        String[] candidatos = {"Pedro", "Vitoria", "João", "Carlos", "Eduardo", "Edmar", "Gabriel", "Paulo", "Lucas", "Bruno", "André"};
        for(String candidato : candidatos) {
        	entrandoEmContato(candidato);
        }
    }
    
    static void entrandoEmContato(String candidato) {
    	int tentativasRealizadas = 1;
    	boolean continuaTentando = true;
    	boolean atendeu = false;
    	do {
    		atendeu = atender();
    		continuaTentando = !atendeu;
    		if(continuaTentando) {
    			tentativasRealizadas++;
    		}
    	}while(continuaTentando && tentativasRealizadas < 3);
    	
    	if(atendeu) {
    		System.out.println("Conseguimos contanto com " + candidato + " na tentativa " + tentativasRealizadas);
    	}else {
    		System.out.println("Nao conseguimos contato");
    	}
    }
    
    static boolean atender() {
    	return new Random().nextInt(3)==1;
    }
    
    static void imprimirCandidatos(){
    	String[] candidatos = {"Pedro", "Vitoria", "João", "Carlos", "Eduardo", "Edmar", "Gabriel", "Paulo", "Lucas", "Bruno", "André"};
    	
    	System.out.println("Lista de candidatos selecionados: ");
    	
    	for(String candidato: candidatos) {
    		System.out.println("O candidato selecionado foi: " + candidato);
    	}
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
