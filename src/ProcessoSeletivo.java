public  class ProcessoSeletivo {
    public  static void main(String[] args) {
        System.out.println("Processo Seletivo");
        analisarCandidato(1800.0);
        analisarCandidato(2000.0);
        analisarCandidato(3000.0);

    }

    static void analisarCandidato(double salarioPretendido){
        double salarioBase = 2000.00;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato.");
        }else if(salarioBase == salarioPretendido){
            System.out.println("ligar para o candidato com contra proposta");
        }else{
            System.out.println("Aguardando resultado dos demais candidatos");
        }
    }
}
