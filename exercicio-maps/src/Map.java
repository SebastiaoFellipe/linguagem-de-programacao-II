import java.util.HashMap;
import java.util.Scanner;

public class Map{
    public static void main(String[] args){
        HashMap<Integer, String> alunos = new HashMap<>();
		alunos.put(1,"Sebastião");
		alunos.put(2,"Ana");
		alunos.put(3,"Natham");
		HashMap<Integer, Boolean> presenca = new HashMap<>();
		presenca.put(1, false);
		presenca.put(2, false);
		presenca.put(3, false);
		System.out.println("Lista de presença atual:");
		for(HashMap.Entry<Integer, String> entry : alunos.entrySet()){
		    System.out.println("ID: "+entry.getKey()+" | Nome: "+entry.getValue());
		}
		Scanner scanner = new Scanner(System.in);
		for(HashMap.Entry<Integer, String> entry : alunos.entrySet()){
		    System.out.println(entry.getValue()+" está presente? 0-não 1-sim");
		    int resp = scanner.nextInt();
		    if(resp==1){
		        presenca.put(entry.getKey(), true);
		    }
		}
		System.out.println("Lista de presença final:");
		for(HashMap.Entry<Integer, String> entry : alunos.entrySet()){
		    String presencaAluno = (presenca.get(entry.getKey()) ? "Presente" : "Ausente");
		    System.out.println("ID: "+entry.getKey()+" | Nome: "+entry.getValue()+" - "+presencaAluno);
		}
    }
}