package es6.array;

import java.util.Scanner;

public class array {
    public static void main(String[] args) {

        int scelta=0,cerca=0,trovato=-1;
        int array[]=new int[100];
        
        Scanner scanner = new Scanner(System.in);
        do{
            System.out.println("1: Carica vettore");
            System.out.println("2: Stampa vettore");
            System.out.println("3: Ordina vettore");
            System.out.println("4: Ricerca sequenziale vettore");
            System.out.println("5: Ricerca binaria vettore ordinato"); //ricerca binaria in un vettore ordinato
            System.out.println("0: Esci");
            scelta=scanner.nextInt();

            switch(scelta){
                case 1:
                    caricaArray(array); //La chiamata al metodo carica
                    break;

                case 2:
                    stampaArray(array); //La chiamata al metodo stampa
                    break;

                case 3:
                    ordinaArray(array); //La chiamata al metodo ordina
                    break;

                case 4:
					System.out.println("Inserisci il valore da ricercare");
					cerca=scanner.nextInt();

					trovato=cercaArray(array,cerca);

					if(trovato>=0){
		    System.out.println("Valore cercato ritrovato alla posizione " + trovato);
						
						}else{
		    System.out.println("Valore non trovato");					
							}
					break;

                case 5:
                    System.out.println("Inserisci il valore da ricercare");
                    cerca=scanner.nextInt();
                    int inizio=0;
                    int fine=array.length-1;
                    trovato=-1;
                    while(inizio<=fine){
                        int mezzo=(inizio+fine)/2;
                        if(array[mezzo]==cerca){
                            trovato=mezzo;
                            break;
                        }else if(array[mezzo]<cerca){
                            inizio=mezzo+1;
                        }else{
                            fine=mezzo-1;
                        }
                    }
                    if(trovato>=0){
                        System.out.println("Valore cercato ritrovato alla posizione " + trovato);
                    }else{
                        System.out.println("Valore non trovato");
                    }
                    break;

                case 0:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Scelta non valida");
            }
        }while(scelta!=0);
        
        scanner.close();

    }//Fine Main
    
    public static int cercaArray(int array[],int cerca){
		
		for(int i=0;i<array.length;i++){
			if(array[i]==cerca){
				return i;
				}
		}
		return -1;
}
		
		
    public static void stampaArray(int array[]){ //Metodo per stampare il vettore 
        
        for(int i=0;i<array.length;i++){
            System.out.println("Valore array: " + array[i] + " alla posizione " + i);
        }
            
    }//Fine stampaArray
    
   public static void caricaArray(int array[]){ //Metodo per caricare il vettore
       
       for(int i=0;i<array.length;i++){
            
           array[i]=(int)(Math.random() * 100) +1;//numeri casuali tra 1 e 100
       
       }
    
    }//FIne caricaArray
  
   public static void ordinaArray(int array[]){
      int tmp;
      for(int i=0;i<array.length-1;i++){
          for(int j=i+1;j<array.length;j++){
              if(array[i]>array[j]){
                  tmp=array[i];
                  array[i]=array[j];
                  array[j]=tmp;
              }
          }
      }
       
  }  
}//FINE CLASSE