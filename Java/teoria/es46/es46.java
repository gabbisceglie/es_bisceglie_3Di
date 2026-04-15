public class es46 {
    public static void main(String[] args) {
        Studente s1 = new Studente("Mario", "Rossi");
        Studente s2 = new Studente("Luigi", "Verdi");
        Studente s3 = new Studente("Giovanni", "Bianchi");

        //crea na' classe
        Classe classe = new Classe(0);
        classe.aggiungiStudente(s1);
        classe.aggiungiStudente(s2);
        classe.aggiungiStudente(s3);

        classe.rimuoviStudente(s1);

        classe.stampaNumeroStudenti();
        classe.stampaStudenti();
    }
}

//Diagramma UML:
//+-------------------+           <>-----------+-------------------+
//|      ALUNNO       |                        |      CLASSE       |
//+-------------------+                        +-------------------+
//| - nome: String    |                        | - studenti[]      |
//| - cognome: String |                        | - numStudenti:int |
//+-------------------+                        +-------------------+
//                                                     ^
//                                                     |
//                                            +-------------------+
//                                            |       MAIN        |
//                                            |      (es45)       |
//                                            +-------------------+
//                                            | + main(String[])  |
//                                            +-------------------+
//
// Relazioni:
// - CLASSE contiene ALUNNO (aggregazione)
// - MAIN usa CLASSE
// - MAIN crea/usa ALUNNO